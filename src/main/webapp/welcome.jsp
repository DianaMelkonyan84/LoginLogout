<%--
  Created by IntelliJ IDEA.
  User: 37455
  Date: 5/25/2024
  Time: 12:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello <%=session.getAttribute("user")%></h1>

<a href="register.jsp">logout</a>

</body>
</html>
