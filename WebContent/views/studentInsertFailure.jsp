<%@page contentType="text/html" %>
<html>
<head>
<title>New Student Creation Failure</title>
</head>
<body> 
<h2>An Error Occurred updating the name</h2>
<h3><font COLOR="#00008B">
&nbsp;&nbsp;&nbsp;&nbsp;
${sessionScope.name.firstName} ${sessionScope.name.lastName}
</font>
</h3>
<h2>
Failure Reason: ${StudentInsertFailureMsg}
<br>
Please try again or report the failure
</h2>
</body>
</html>