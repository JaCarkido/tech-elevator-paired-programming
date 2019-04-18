<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Page</title>
</head>
<body>
	<h1>Shopping Cart Exercise</h1>
	
	<h2>${param.name}</h2>
	<img src="img/${vegetables.imgName}.jpg"/>
	<p>Price: $${vegetables.price}</p>
	<div class="formInputGroup">
		<c:url var="formAction" value="productDetail"/>
		<form method="POST" action="${formAction}" >
			<label for="quantity">Quantity:</label> 
			<input type="text" name="quantity" id="quantity" />
			<input type="hidden" name="name" id="name" value="${param.name}" />
			<input class="formSubmitButton" type="submit" value="Add To Cart" />
		</form>
	</div>
	<c:url value="greeting" var="greeting"/>
	<a href="${greeting}">Return to catalog</a>
</body>
</html>

