<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.nanika"%>
    <%
    nanika n = (nanika)application.getAttribute("n");
    int count = n.getCount();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%=count %>Pの手番</p>
<form action="Main" method="post">
	<table border="">
	<tr><th><button type="submit" name="button" value="1">　</button></th><th><button type="submit" name="button" value="2">　</button></th><th><button type="submit" name="button" value="3">　</button></th></tr>
	<tr><th><button type="submit" name="button" value="4">　</button></th><th><button type="submit" name="button" value="5">　</button></th><th><button type="submit" name="button" value="6">　</button></th></tr>
	<tr><th><button type="submit" name="button" value="7">　</button></th><th><button type="submit" name="button" value="8">　</button></th><th><button type="submit" name="button" value="9">　</button></th></tr>

	</table>
</form>
</body>
</html>