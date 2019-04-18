<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="inner-planets" class="planets">
    <h1>Inner Planets</h1>
    <section class="planet">
        <h2>Mercury</h2>
        <c:url var="mercuryImgSrc" value="/img/mercury.jpg" />
		<img src="${mercuryImgSrc}" alt="Mercury">
        <p>Mercury is the smallest and closest to the Sun of the eight planets in the Solar System, with an orbital period of about 88 Earth days. Seen from Earth, it appears to move around its orbit in about 116 days, which is much faster than any other planet in the Solar System. It has no known natural satellites. The planet is named after the Roman deity Mercury, the messenger to the gods.</p>
        <p>Mercury is gravitationally locked and rotates in a way that is unique in the Solar System. As seen relative to the fixed stars, it rotates on its axis exactly three times for every two revolutions it makes around the Sun. As seen from the Sun, in a frame of reference that rotates with the orbital motion, it appears to rotate only once every two Mercurian years. An observer on Mercury would therefore see only one day every two years.</p>
    </section>

    <section class="planet">
        <h2>Venus</h2>
        <c:url var="venusImgSrc" value="/img/venus.jpg" />
		<img src="${venusImgSrc}" alt="Venus">
        <p>Venus is the second planet from the Sun, orbiting it every 224.7 Earth days. It has no natural satellite. It is named after the Roman goddess of love and beauty. After the Moon, it is the brightest natural object in the night sky, reaching an apparent magnitude of -4.6, bright enough to cast shadows. Because Venus is an inferior planet from Earth, it never appears to venture far from the Sun: its elongation reaches a maximum of 47.8�.</p>
        <p>Venus is a terrestrial planet and is sometimes called Earth's "sister planet" because of their similar size, mass, proximity to the Sun and bulk composition. It is radically different from Earth in other respects. It has the densest atmosphere of the four terrestrial planets, consisting of more than 96% carbon dioxide. The atmospheric pressure at the planet's surface is 92 times that of Earth's. With a mean surface temperature of 735 K (462 �C; 863 �F), Venus is by far the hottest planet in the Solar System, even though Mercury is closer to the Sun.</p>
    </section>

    <section class="planet">
        <h2>Earth</h2>
        <c:url var="earthImgSrc" value="/img/earth.jpg" />
		<img src="${earthImgSrc}" alt="Earth">
        <p>Earth is the third planet from the Sun, the densest planet in the Solar System, the largest of the Solar System's four terrestrial planets, and the only astronomical object known to harbor life. The earliest life on Earth arose at least 3.5 billion years ago. Earlier physical evidences of life include graphite, a biogenic substance, in 3.7 billion-year-old metasedimentary rocks discovered in southwestern Greenland, as well as, "remains of biotic life" found in 4.1 billion-year-old rocks in Western Australia. Earth's biodiversity has expanded continually except when interrupted by mass extinctions. Although scholars estimate that over 99 percent of all species of life (over five billion) that ever lived on Earth are extinct, there are still an estimated 10-14 million extant species, of which about 1.2 million have been documented and over 86 percent have not yet been described.</p>
    </section>

    <section class="planet">
        <h2>Mars</h2>
        <c:url var="marsImgSrc" value="/img/mars.jpg" />
		<img src="${marsImgSrc}" alt="Mars">
        <p>Mars is the fourth planet from the Sun and the second smallest planet in the Solar System, after Mercury. Named after the Roman god of war, it is often referred to as the "Red Planet" because the iron oxide prevalent on its surface gives it a reddish appearance. Mars is a terrestrial planet with a thin atmosphere, having surface features reminiscent both of the impact craters of the Moon and the volcanoes, valleys, deserts, and polar ice caps of Earth.</p>
        <p>The rotational period and seasonal cycles of Mars are likewise similar to those of Earth, as is the tilt that produces the seasons. Mars is the site of Olympus Mons, the largest volcano and second-highest known mountain in the Solar System, and of Valles Marineris, one of the largest canyons in the Solar System. The smooth Borealis basin in the northern hemisphere covers 40% of the planet and may be a giant impact feature. Mars has two moons, Phobos and Deimos, which are small and irregularly shaped. These may be captured asteroids, similar to 5261 Eureka, a Mars trojan.</p>
    </section>
</section>

<section id="outer-planets" class="planets">
    <h1>Outer Planets</h1>
    <section class="planet">
        <h2>Jupiter</h2>
        <c:url var="jupiterImgSrc" value="/img/jupiter.jpg" />
		<img src="${jupiterImgSrc}" alt="Jupiter">
        <p>Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a giant planet with a mass one-thousandth that of the Sun, but two and a half times that of all the other planets in the Solar System combined. Jupiter is a gas giant, along with Saturn (Uranus and Neptune are ice giants). When viewed from Earth, Jupiter can reach an apparent magnitude of -2.94, bright enough to cast shadows, and making it on average the third-brightest object in the night sky after the Moon and Venus.</p>
        <p>Jupiter is primarily composed of hydrogen with a quarter of its mass being helium, although helium only comprises about a tenth of the number of molecules. It may also have a rocky core of heavier elements, but like the other giant planets, Jupiter lacks a well-defined solid surface. The outer atmosphere is visibly segregated into several bands at different latitudes, resulting in turbulence and storms along their interacting boundaries. A prominent result is the Great Red Spot, a giant storm that is known to have existed since at least the 17th century when it was first seen by telescope. </p>
    </section>

    <section class="planet">
        <h2>Saturn</h2>
        <c:url var="saturnImgSrc" value="/img/saturn.jpg" />
		<img src="${saturnImgSrc}" alt="Saturn">
        <p>Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius about nine times that of Earth. Although only one-eighth the average density of Earth, with its larger volume Saturn is just over 95 times more massive.</p>
        <p>Saturn's interior is probably composed of a core of iron-nickel and rock (silicon and oxygen compounds). This core is surrounded by a deep layer of metallic hydrogen, an intermediate layer of liquid hydrogen and liquid helium, and finally outside the Frenkel line a gaseous outer layer. Saturn has a pale yellow hue due to ammonia crystals in its upper atmosphere. Electrical current within the metallic hydrogen layer is thought to give rise to Saturn's planetary magnetic field, which is weaker than Earth's, but has a magnetic moment 580 times that of Earth due to Saturn's larger size. The outer atmosphere is generally bland and lacking in contrast, although long-lived features can appear. Wind speeds on Saturn can reach 1,800 km/h (500 m/s), higher than on Jupiter, but not as high as those on Neptune. </p>
    </section>

    <section class="planet">
        <h2>Uranus</h2>
        <c:url var="uranusImgSrc" value="/img/uranus.jpg" />
		<img src="${uranusImgSrc}" alt="Uranus">
        <p>Uranus is the seventh planet from the Sun. It has the third-largest planetary radius and fourth-largest planetary mass in the Solar System. Uranus is similar in composition to Neptune, and both have different bulk chemical composition from that of the larger gas giants Jupiter and Saturn. For this reason, scientists often classify Uranus and Neptune as "ice giants" to distinguish them from the gas giants. Uranus's atmosphere, although similar to Jupiter's and Saturn's in its primary composition of hydrogen and helium, contains more "ices", such as water, ammonia, and methane, along with traces of other hydrocarbons. It is the coldest planetary atmosphere in the Solar System, with a minimum temperature of 49 K (-224.2 �C), and has a complex, layered cloud structure, with water thought to make up the lowest clouds, and methane the uppermost layer of clouds.[11] The interior of Uranus is mainly composed of ices and rock.</p>
    </section>

    <section class="planet">
        <h2>Neptune</h2>
        <c:url var="neptuneImgSrc" value="/img/neptune.jpg" />
		<img src="${neptuneImgSrc}" alt="Neptune">
        <p>Neptune is the eighth and farthest planet from the Sun in the Solar System. It is the fourth-largest planet by diameter and the third-largest by mass. Among the giant planets in the Solar System, Neptune is the most dense. Neptune is 17 times the mass of Earth and is slightly more massive than its near-twin Uranus, which is 15 times the mass of Earth, and not as dense as Neptune. Neptune orbits the Sun at an average distance of 30.1 astronomical units (4.50�109 km).</p>
        <p>Neptune is not visible to the unaided eye and is the only planet found by mathematical prediction rather than by empirical observation. Unexpected changes in the orbit of Uranus led Alexis Bouvard to deduce that its orbit was subject to gravitational perturbation by an unknown planet. Neptune was subsequently observed with a telescope on 23 September 1846 by Johann Galle within a degree of the position predicted by Urbain Le Verrier. Its largest moon, Triton, was discovered shortly thereafter, though none of the planet's remaining 14 moons were located telescopically until the 20th century. </p>
    </section>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />