<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<s:a action="mywelcome">Click to Go on Welcome Page </s:a>
<br>
<hr>
Change Language &nbsp;&nbsp;
<s:a href="langAc?request_locale=en_US">English</s:a>
<s:a href="langAc?request_locale=hi_IN">हिंदी</s:a>
<s:a href="langAc?request_locale=it_IT">italiano</s:a>
</body>
</html>