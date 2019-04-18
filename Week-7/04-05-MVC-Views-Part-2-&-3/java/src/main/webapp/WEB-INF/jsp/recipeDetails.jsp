<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

<c:set var="recipeId" value="${param.recipeId}">
</c:set>
<div id="bodyStyle">
	<div id="topContainer">
		<img href src="img/recipe${recipeId}.jpg" />
		<div id="description">
			<h5>${recipe.name}</h5>
			<div>${recipe.recipeType}</div>
			<div>
				<b> Cook Time: </b> ${recipe.cookTimeInMinutes}
			</div>
			<div id="recipeDescription">${recipe.description}</div>
		</div>

	</div>

	<div id="listContainer">
		<ul>
			<b> Ingredients: </b>
			<c:forEach var="ingredient" items="${recipe.ingredients}">
				<li>${ingredient.quantity} ${ingredient.name}</li>
			</c:forEach>
		</ul>

	</div>

	<div id="preparationContainer">

		<ol>
			<b> Preparation: </b>
			<c:forEach var = "step" items="${recipe.preparationSteps}">
				<li>${step}</li>
			</c:forEach>
		</ol>
	</div>



</div>
</body>
</html>