<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
    <meta charset="UTF-8">
    <title>Your person form</title>
    <link href="/css/main.css" rel="stylesheet">
</head>

<body>
<h2 class="hello-title">Your person form!</h2>
<script src="/js/main.js"></script>

<form:form method="POST" modelAttribute="person">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="nachname">Nachname</form:label></td>
            <td><form:input path="nachname"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>

</html>