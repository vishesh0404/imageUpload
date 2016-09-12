<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>images</title>
</head>
 
 
<body>

		
		<form:form method="POST" enctype="multipart/form-data">
			Please select an Image to upload <input type="file" name="file" />
			<input type="submit" value="upload">
		</form:form>

        <c:forEach items="${images}" var="image">
        	<img height="60" width="60" alt="${image.id}" src="${image.path}"> &nbsp;&nbsp;&nbsp;
        </c:forEach>
</body>
</html>