<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: seb
  Date: 2/5/17
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Newcastle Connections</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

    <h2>Welcome <s:property value="username"/>!</h2>

    <h3> List of other usernames and passwords: (For testing and such)</h3>

    <table class="table table-striped">
        <tr>
            <th>Username | Password</th>
        </tr>
        <s:iterator value="listOfUsers">


            <tr>

                <td><s:property/></td>

            </tr>
        </s:iterator>
    </table>

</div>


</body>
</html>
