<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: seb
  Date: 2/5/17
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Newcastle Connections</title>
  </head>
  <body>
  Login:
  <s:form action="Authenticate" namespace="/">

    <s:textfield key="username" />
    <s:textfield key="password" />
    <s:submit key="submit" name="submit" />

  </s:form>
  </body>
</html>
