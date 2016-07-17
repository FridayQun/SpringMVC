<%@page session="false"%>
<html>
<body>
	<h1>username : ${username}</h1>
	<%=request.getSession().getAttribute("username") %>
</body>
</html>