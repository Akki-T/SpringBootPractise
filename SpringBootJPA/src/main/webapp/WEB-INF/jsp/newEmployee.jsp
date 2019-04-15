<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <h1>Add new employee</h1>
        
    <form:form modelAttribute="form">
        <form:errors path="" element="div" />
        <div>
            <form:label path="name">Name</form:label>
            <form:input path="name" />
            <form:errors path="name" />
        </div>
        <div>
            <form:label path="Designation">Designation</form:label>
            <form:input path="Designation" />
            <form:errors path="Designation" />
        </div>
        <div>
            <input type="submit" />
        </div>
    </form:form>
</body>
</html>
