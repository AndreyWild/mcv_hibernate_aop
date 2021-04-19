<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<body>
<h2>Employee Info</h2>
<br>

<%--Создает форму с атрибутами--%>
<form:form action="saveEmployee" modelAttribute="employee">

<%--    Создает скрытую форму id--%>
    <form:hidden path="id"/>

<%--    Создает формы с параметрами работника--%>
    Name<form:input path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <br><br>
    Department<form:input path="department"/>
    <br><br>
    Salary<form:input path="salary"/>
    <br><br>
<%--    Создает кнопу OK--%>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
