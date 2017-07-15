<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
 isErrorPage="false"  isThreadSafe="true" session="true" 
 trimDirectiveWhitespaces="false"   pageEncoding="UTF-8" 
 autoFlush="true" buffer="8kb" errorPage="error.jsp" import="java.util.ArrayList" info=""%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a = 100;
int b = 200;
int c = a + b;
//out.println("Sum is "+c);
//int x = 100/0;
%>
Sum is <%=c %>
</body>
</html>