<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/25
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Your Sandwich</title>
</head>
<body>
<c:forEach items="${nhan}" var="moiloainhan" varStatus="counter">
    <br>
    <h2>Nhân thứ: ${counter.count} là ${moiloainhan}</h2>
</c:forEach>
</body>
</html>
