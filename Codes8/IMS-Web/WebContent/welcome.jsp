<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userid = request.getParameter("userid");
String password = request.getParameter("pwd");
System.out.println("Userid "+userid+" Password "+password);

if(userid.equals(password)){
String result = "{'message': 'Welcome User'}";
out.println(result);
}
else{
	String result2 = "{'message': 'Invalid Userid or Password'}";
	out.println(result2);
}

%>
</body>
</html>