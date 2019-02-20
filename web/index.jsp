<%--
  Created by IntelliJ IDEA.
  User: lunkus
  Date: 2019-02-19
  Time: 06:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.util.*, java.lang.*" %>
<html>



<head>
    <title>Title</title>
</head>
<body>

<%
    try {
        if (request.getAttribute("Items") != null) {
            List<String> itemsArray = (List<String>) request.getAttribute("Items");
            out.println(itemsArray);
            out.println(itemsArray.size());
            for (int i=0; i < itemsArray.size(); i++) {
                out.println(itemsArray.get(i));
            }
        }
        else {
            out.println("no data in array");
        }
    }
    catch (Exception e) {
        out.println("Exception : " + e);
    }

%>

</body>
</html>
