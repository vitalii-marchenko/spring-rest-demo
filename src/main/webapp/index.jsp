<%--
  Created by IntelliJ IDEA.
  User: vitalymarchenko
  Date: 15.05.2020
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring REST Demo</title>
</head>
<body>
    Spring REST Demo
    <hr>

    <a href="${pageContext.request.contextPath}/test/hello">Hello</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</body>
</html>
