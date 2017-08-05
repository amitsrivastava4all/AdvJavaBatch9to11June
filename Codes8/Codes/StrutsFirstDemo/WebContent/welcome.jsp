<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.errorMessage{
color:red;
}
</style>
</head>
<body>
<s:if test="{message==null }">
<h1>Welcome</h1>
</s:if>
<h1><s:property value="message"/></h1>
<s:form action="login" method="post">
<s:textfield cssClass="form-field" name="userid" key="login.userid"/>
<s:password name="pwd" key="login.pwd"/>
<s:submit/>

</s:form>
</body>
</html>