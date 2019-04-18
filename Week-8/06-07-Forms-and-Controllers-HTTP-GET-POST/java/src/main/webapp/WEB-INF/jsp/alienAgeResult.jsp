
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="content-area-result">
	
		<img src="img/${param.planetChoice}.jpg" />
	
	<div class="weight-text">
		If you are ${param.earthAge} years old on Earth, then you would be
		<c:out value="${conversion.alienAge}" />
		years old on <span class="capitalize">${param.planetChoice}.</span>
	</div>
	<!-- ${param.planetChoice} = param check   -->
</div>


</body>
</html>