<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person's List</title>
<link rel="stylesheet" type="text/css"
 href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Person List</h1>
    
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>ID</th>
          <th>Name</th>
        </tr>
        <c:forEach  items="${persons}" var ="person">
        <tr>
          <td>${person.id}</td>
          <td>${person.name}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </body>
</body>
</html>