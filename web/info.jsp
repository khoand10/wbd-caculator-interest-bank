<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 26/04/2018
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>info</title>
</head>
<body>
    Moneys: <%=request.getParameter("money")%><br>
    Interest rate:<%=request.getParameter("rate")%><br>
    Amount: <%=request.getParameter("amount")%><br>
    nIterest: ${requestScope.interest}
</body>
</html>
