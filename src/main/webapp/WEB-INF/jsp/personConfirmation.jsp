<%--
  Created by IntelliJ IDEA.
  User: annpo
  Date: 03.05.2019
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Submitted Person Information</title>
</head>
<body>

<h2>Submitted Person Information</h2>
<table>
    <tr>
        <td>Name :</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Nachname :</td>
        <td>${nachname}</td>
    </tr>
</table>

<ul>
    <c:forEach items="${exMaedels}" var="maedel">
        <li>${maedel}</li>
    </c:forEach>
</ul>

</body>
</html>
