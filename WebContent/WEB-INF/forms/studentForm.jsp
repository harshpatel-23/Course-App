<html>
<head>
<title>Personal Details</title>
</head>
<body> 
<h1>Please enter your name</h1>
<form name="nameForm" action="${pageContext.request.contextPath}/servlet/processstudentform" method="POST">
First Name: <input type="TEXT" name="FirstName" value="${studentFormData.firstName}"> <font size="3" color="red">${errorInFirstNameMsg}</font><BR>
Last Name: <input type="TEXT" name="LastName" value="${studentFormData.lastName}"> <font size="3" color="red">${errorInLastNameMsg}</font><BR>
    <input type="submit" name="Register" value="Enter">
</form>
</body>
</html>