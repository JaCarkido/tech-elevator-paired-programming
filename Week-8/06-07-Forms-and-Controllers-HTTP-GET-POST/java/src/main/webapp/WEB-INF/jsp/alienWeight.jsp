<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:url var="formMethod" value="/alienWeightResult" />

<div class="content-area">

	<form method="GET" action="${formMethod}">
	<h3 class="content-heading">Alien Weight Calculator</h3>
		<div class="select-planet">
			<label for="planetChoice">Choose a Planet</label> 
			<select
				name="planetChoice" id="planetChoice">
				<option value="mercury">Mercury</option>
				<option value="venus">Venus</option>
				<option value="earth">Earth</option>
				<option value="mars">Mars</option>
				<option value="jupiter">Jupiter</option>
				<option value="saturn">Saturn</option>
				<option value="uranus">Uranus</option>
				<option value="neptune">Neptune</option>
			</select>
		</div>
		<div class ="enter-earth-weight">
			<label for="earthWeight">Enter Your Earth Weight</label>
			<input type="text" name="earthWeight" id="earthWeight"/>
		</div>
		<input class="formSubmitButton" type="submit" value="Calculate Weight" />
	</form>
</div>





</body>
</html>