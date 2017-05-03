<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: seb
  Date: 2/5/17
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<head>

  <title>Newcastle Connections</title>
  <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <s:head />
</head>

  <body>
  <div class="container">

  <h1>Login:</h1>
  <s:form action="Authenticate" namespace="/" >
    <div class="form-group">

        <style type="text/css">
            label[for="u"] {
                color: black;
            }
            label[for="p"] {
                color: black;
            }
        </style>


        <s:textfield id="u" key="username" label="Username" />
      <s:password id="p" key="password" label="Password" />
    <s:submit key="submit" name="submit" class="btn btn-success"/>
    </div>
  </s:form>

</div>

  </body>
</html>
