<!--    Same as nameForm.jsp but doesn't use a Backing Object.
      Thus if you get an error on the form, all data in the form is lost on
      re-presentation.   
-->
<html>
<head>
<title>Personal Details</title>
</head>
<body> 
<h1>Please enter your name</h1>
<form name="nameForm" action="${pageContext.request.contextPath}/servlet/processstudentform" method="POST">
First Name: <input type="TEXT" name="FirstName">  <font size="3" color="red">${errorInFirstNameMsg}</font><BR>
Last Name: <input type="TEXT" name="LastName"> <font size="3" color="red">${errorInLastNameMsg}</font><BR>
    <input type="submit" name="Register" value="Enter">
</form>
</body>
</html>