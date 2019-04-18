<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:url var="formMethod" value="/driveTimeResult" />

<div class="content-area">

	<form method="GET" action="${formMethod}">
	<h3 class="content-heading">Alien Travel Calculator</h3>
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
		<div class="select-planet">
			<label for="transChoice">Choose a Transportation Method</label> 
			<select
				name="transChoice" id="transChoice">
				<option value="walking">Walking</option>
				<option value="car">Car</option>
				<option value="bullet train">Bullet Train</option>
				<option value="boeing 747">Boeing 747</option>
				<option value="concorde">Concorde</option>
			</select>
		</div>
		<div class ="enter-earth-age">
			<label for="earthAge">Enter Your Earth Age</label>
			<input type="text" name="earthAge" id="earthAge"/>
		</div>
		<input class="formSubmitButton" type="submit" value="Calculate Travel Time" />
	</form>
</div>


</body>
</html>