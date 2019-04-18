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
	<h1>This is the Shopping Cart</h1>
<!--  style table when there is time -->
	<table>
		<tr>
			<th>Name</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Total Price</th>
		</tr>	
		<c:set var="totalPrice" value="0"/>
		<c:forEach var="item" items="${shoppingCart}">
			<tr>
				<td>${item.value.name}</td>
				<td>${item.value.quantity}</td>
				<td>$${item.value.price}</td>
				<td>$${item.value.quantity * item.value.price}</td>
				<c:set var="totalPrice" value="${(item.value.quantity * item.value.price) + totalPrice}"/>
			</tr>
		</c:forEach>
	</table>
	
	<div>Total Price: ${totalPrice}</div>
	
	<c:url var="greeting" value="greeting"/>
	<a href="${greeting}">Return to catalog</a>
</body>
</html>

