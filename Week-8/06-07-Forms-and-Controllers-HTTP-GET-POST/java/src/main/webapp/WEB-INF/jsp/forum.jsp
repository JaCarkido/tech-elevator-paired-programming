
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:url var="formMethod" value="/forum" />
<div class="content-area-result">

	<form method = "POST" action = "${formMethod}">
		<div class="forum-post-box">
			<div>
				<label for="username">Username</label> 
				<input type="text"name="username" id="username" /> 
			</div>
			<div>	
				<label for="subject">Subject</label>
				<input type="text" name="subject" id="subject" /> 	
			</div>
			<div>
				<label for="message">Message</label>
				<textarea name="message" rows="5" cols="50"></textarea>
			</div>
			<div class="forum-submit-button">
				<input class="formSubmitButton" type="submit" value="Submit" />
			</div>
		</div>
	</form>

</div>


</body>
</html>





