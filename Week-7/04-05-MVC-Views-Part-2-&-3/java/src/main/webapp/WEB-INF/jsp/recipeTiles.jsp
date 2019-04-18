<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>


	<section id="main-content">
		<h3>Recipes</h3>
	<div id="content">
		<c:forEach var="recipe" items="${recipes}">
			<c:url value = "recipeDetails" var = "recipeDetails"/>
			<a class="recipe" href = "${recipeDetails}?recipeId=${recipe.recipeId}">
				<img href src="img/recipe${recipe.recipeId}.jpg"/>
				<h4>${recipe.name}</h4>
				<div class="tile-ingredient-rating">
					<img src="img/${Math.round(recipe.averageRating)}-star.png" />
					<em>${recipe.ingredients.size()} ingredients</em>
				</div>
			</a>
		</c:forEach>
	</div>
	</section>
</body>
</html>