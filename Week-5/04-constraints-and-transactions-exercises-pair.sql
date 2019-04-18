-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)
--BEGIN TRANSACTION;
INSERT INTO city (name, district, countrycode, population)
     VALUES ('Smallville', 'Kansas', 'USA', 45001)
     ;
SELECT *
  FROM city
 WHERE name='Smallville';
--ROLLBACK;
 
-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
--BEGIN TRANSACTION;
INSERT INTO countrylanguage
        (countrycode, language, isofficial, percentage)
VALUES ('USA', 'Kryptonese', false, .0001)
;
SELECT *
FROM countrylanguage
WHERE language ='Kryptonese'
;
--ROLLBACK;

-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.
--BEGIN TRANSACTION;
UPDATE countrylanguage
   SET language = 'Krypto-babble'
 WHERE language = 'Kryptonese'
 ;
SELECT * from countrylanguage where countrycode = 'USA'
;
--ROLLBACK;
-- 4. Set the US captial to Smallville, Kansas in the country table.
--BEGIN TRANSACTION;
UPDATE country
SET capital = (SELECT id FROM city WHERE name ='Smallville')
WHERE code = 'USA'
;

SELECT name
FROM city
WHERE id = 4081
;
--ROLLBACK;

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
--BEGIN TRANSACTION;
--DELETE FROM city
-- WHERE name = 'Smallville'
--   AND district = 'Kansas'
-- ;
--ROLLBACK; THIS DOES NOT WORK, IT VIOLATES THE FOREIGN KEY CONSTRAINT
-- 6. Return the US captial to Washington.
--BEGIN TRANSACTION;
UPDATE country
SET capital = (SELECT id FROM city WHERe name = 'Washington' AND district ILIKE 'District of Columbia')
WHERE code = 'USA'
;
SELECT city.name
FROM city
        INNER JOIN country 
        ON city.countrycode = country.code
WHERE city.id = country.capital AND country.code = 'USA'
;
--ROLLBACK;

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
--BEGIN TRANSACTION;
DELETE FROM city
 WHERE name = 'Smallville'
   AND district = 'Kansas'
 ;
SELECT name
FROM city
WHERE name='Smallville'
AND district = 'Kansasa'
; 
--ROLLBACK;
-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)
--BEGIN TRANSACTION;

-- Check some before 
SELECT c.name, cl.language, cl.isofficial
FROM countrylanguage cl
        INNER JOIN country c
        ON cl.countrycode = c.code
WHERE c.indepyear BETWEEN 1800 AND 1972
ORDER BY c.indepyear
Limit 5
;

-- reverses the isofficial
UPDATE countrylanguage
SET isofficial = NOT isofficial
WHERE countrycode IN (SELECT code FROM country WHERE indepyear BETWEEN 1800 AND 1972)
;

--runs a second check to make sure values from first are reversed
SELECT c.name, cl.language, cl.isofficial
FROM countrylanguage cl
        INNER JOIN country c
        ON cl.countrycode = c.code
WHERE c.indepyear BETWEEN 1800 AND 1972
ORDER BY c.indepyear
Limit 5
;
--ROLLBACK;

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)
BEGIN TRANSACTION;
SELECT population 
  FROM city
  ORDER BY population DESC
 LIMIT 10
;
UPDATE city
   SET population = (population::numeric/1000)::integer
;
SELECT population 
  FROM city
  ORDER BY population DESC
 LIMIT 10
;
ROLLBACK;


-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 
-- meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)
BEGIN TRANSACTION;
SELECT l.countrycode, co.surfacearea, l.language, l.percentage
  FROM countrylanguage l
  JOIN country co
    ON co.code = l.countrycode
 WHERE language ilike 'French'
   AND percentage > 20
   ORDER BY co.surfacearea DESC
   ;
UPDATE country
  SET surfacearea = surfacearea * 2.59
WHERE code IN(SELECT countrycode FROM countrylanguage WHERE language ILIKE 'French' AND percentage > 20)
;
SELECT l.countrycode, co.surfacearea, l.language, l.percentage
  FROM countrylanguage l
  JOIN country co
    ON co.code = l.countrycode
 WHERE language ilike 'French'
   AND percentage > 20
   ORDER BY co.surfacearea DESC
   ;
COMMIT;