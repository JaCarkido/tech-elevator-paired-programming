
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="content-area-result">
	
		<img src="img/${param.planetChoice}.jpg" />
	
	<div class="weight-text">
		Traveling by ${param.transChoice} you will reach <span class="capitalize">${param.planetChoice}.</span> in
		 <c:out value="${conversion.travelTime}" /> years.  You will be <c:out value="${conversion.travelTime + param.earthAge}"/>
		years old
	</div>
	<!-- ${param.planetChoice} = param check   -->
</div>


</body>
</html>