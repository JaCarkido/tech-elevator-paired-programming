<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
	<head>
		<title>Shopping Cart Exercise</title>
	</head>
	<body>
		<h1>Shopping Cart Exercise</h1>
		<c:url value="viewShoppingCart" var="viewShoppingCart"/>
		<h3> <a href="${viewShoppingCart}">View Cart</a></h3>
		
		<h2>Garden Vegetable Seeds</h2>
		<ul>
		<c:url value="productDetail" var="productDetail"/>
		<c:forEach var="vegetable" items="${vegetables}">
			<li><a href="${productDetail}?name=${vegetable.name}">${vegetable.name}</a></li>
		</c:forEach>
		</ul>
	</body>
</html>

<!-- 
<div id="recipes">
    	<c:forEach var="recipe" items="${recipes}">
    		<div class="list">
    			<a class="detail-img-link" href="recipeDetails?recipeId=${recipe.recipeId}">
    				<img class="photo" src="img/recipe${recipe.recipeId}.jpg"/>
    			</a>
    			<h4><a class="detail-link" href="recipeDetails?recipeId=${recipe.recipeId}">${recipe.name}</a></h4>
    			 <img class="star" src="img/${Math.round(recipe.averageRating)}-star.png"/>
    			<p>${recipe.ingredients.size()} ingredients </p>
    		</div>
    	
    	</c:forEach>
    	</div> -->