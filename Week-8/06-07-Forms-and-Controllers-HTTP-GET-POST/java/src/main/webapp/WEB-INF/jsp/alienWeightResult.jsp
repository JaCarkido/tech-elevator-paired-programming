<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="content-area-result">
	
		<img src="img/${param.planetChoice}.jpg" />
	
	<div class="weight-text">
		If you are ${param.earthWeight} lbs on Earth, then you would weigh
		<c:out value="${conversion.alienWeight}" />
		lbs on <span class="capitalize">${param.planetChoice}.</span>
	</div>
	<!-- ${param.planetChoice} = param check   -->
</div>


</body>
</html>