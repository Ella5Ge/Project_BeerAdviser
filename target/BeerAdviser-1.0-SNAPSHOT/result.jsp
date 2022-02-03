<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-size: 100%;
        }
    </style>
</head>
<body background="images/bimg.jpg">
<h1 align="center">Beer Recommendations</h1>
<%
    List<String> styles = (List<String>)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while(it.hasNext()) {
      out.print("<br> <center>" + it.next() + "</center>");
    }
%>

</body>
</html>