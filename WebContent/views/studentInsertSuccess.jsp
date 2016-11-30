<!--  Note that jstl-api-1.2.jar and jstl-impl-1.2.jar have been placed in the
      WebContent/WEB-INF/lib folder.   These .jar files are needed for the JSTL libraries used
      below.   Also, by putting the .jar files in the WEB-INF/lib folder they will be copied as
      part of the .war file
-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" %>
<html>
<head>
<title>Submission Result</title>
</head>
<body> 
<h2>Your information has been successfully added:</h2>
<h3><font COLOR="#00008B">
&nbsp;&nbsp;&nbsp;&nbsp;
${sessionScope.student.name.firstName} ${sessionScope.student.name.lastName}
&nbsp &nbsp &nbsp Your Student Id is: ${sessionScope.student.id}
</font>
</h3>
</body>
</html>
<c:remove var="name" scope="session" />