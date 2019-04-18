DROP TABLE IF EXISTS pet                cascade;
DROP TABLE IF EXISTS family             cascade;
DROP TABLE IF EXISTS owner              cascade;
DROP TABLE IF EXISTS address_owner      cascade;
DROP TABLE IF EXISTS owner_address      cascade;
DROP TABLE IF EXISTS address            cascade;
DROP TABLE IF EXISTS visit              cascade;
DROP TABLE IF EXISTS procedure_visit    cascade;
DROP TABLE IF EXISTS visit_procedure    cascade;
DROP TABLE IF EXISTS procedure          cascade;

CREATE TABLE pet (
        id serial NOT NULL,
        name varchar(45) NOT NULL,
        type varchar(12) NOT NULL,
        age integer,
        CONSTRAINT pk_pet_id PRIMARY KEY (id)
        );
       
CREATE TABLE family (
        pet_id integer NOT NULL,
        owner_id integer NOT NULL,
        CONSTRAINT pk_family_pet_id_owner_id PRIMARY KEY (pet_id,owner_id)
        );
        
CREATE TABLE owner (
        id serial NOT NULL,
        first_name varchar(45),
        last_name varchar(45),
        CONSTRAINT pk_owner_id PRIMARY KEY (id)
        );
        
CREATE TABLE address_owner (
        owner_id integer NOT NULL,
        address_id integer NOT NULL,
        isactive boolean DEFAULT TRUE NOT NULL,
        inactive_date DATE,
        CONSTRAINT pk_owner_address_owner_id_address_id PRIMARY KEY (owner_id,address_id)
        );
        
CREATE TABLE address (
        id sErIaL NOT NULL,
        street_address varchar(128),
        street_address_2 varchar(128), --supplemental apt # etc
        city varchar(128),
        state varchar(128),
        country varchar(128),
        zip5 smallint,
        zip_extension smallint,
        CONSTRAINT pk_address_id PRIMARY KEY (id)
        );
        
CREATE TABLE visit (
        id serial NOT NULL,
        visit_time timestamp without time zone NOT NULL,
        pet_id integer NOT NULL, -- if there are two pets in the room together they should be logged as two seperate visits $$$
        owner_id integer NOT NULL,
        procedure_id integer NOT NULL, --even a check up (or a complimentary check up) counts as a procedure so it cannot be null
        CONSTRAINT pk_visit_id PRIMARY KEY (id)
        );
        
CREATE TABLE procedure_visit (
        visit_id integer NOT NULL,
        procedure_id integer NOT NULL,
        CONSTRAINT pk_visit_procedure_visit_id_procedure_id PRIMARY KEY (visit_id,procedure_id)
        );
        
CREATE TABLE procedure (
        id serial NOT NULL,
        description varchar(512),
        CONSTRAINT pk_procedure_id PRIMARY KEY (id)
        );
        
ALTER TABLE family
ADD FOREIGN KEY(pet_id)
REFERENCES pet(id);

ALTER TABLE family
ADD FOREIGN KEY(owner_id)
REFERENCES owner(id);

ALTER TABLE address_owner
ADD FOREIGN KEY (owner_id)
REFERENCES owner(id);

ALTER TABLE address_owner
ADD FOREIGN KEY(address_id)
REFERENCES address(id);

ALTER TABLE visit
ADD FOREIGN KEY(pet_id)
REFERENCES pet(id);

ALTER TABLE visit
ADD FOREIGN KEY(owner_id)
REFERENCES owner(id);

ALTER TABLE procedure_visit
ADD FOREIGN KEY(procedure_id)
REFERENCES procedure(id);

ALTER TABLE procedure_visit
ADD FOREIGN KEY(visit_id)
REFERENCES visit(id);


        