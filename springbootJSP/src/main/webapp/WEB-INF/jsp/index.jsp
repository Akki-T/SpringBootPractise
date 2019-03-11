<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<link rel="stylesheet" type="text/css"
 href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
      <h1>Welcome</h1>
      <h2>${message}</h2>
              
      <a href="${pageContext.request.contextPath}/personList">Show Persons List</a>  
       
   </body>
</html>