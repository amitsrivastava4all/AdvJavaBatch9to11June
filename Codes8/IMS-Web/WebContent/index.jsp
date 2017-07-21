<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
 isErrorPage="false"  isThreadSafe="true" session="true" 
 trimDirectiveWhitespaces="false"   pageEncoding="UTF-8" 
 autoFlush="true" buffer="8kb" errorPage="error.jsp" import="java.util.ArrayList" info=""%>
<!DOCTYPE html >
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.12.4.min.js"></script>
<script src="js/validate.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>


<%! int hitCounter;  // Instance Variable %>
<%
hitCounter++;
// service method
String userid = request.getParameter("userid");  // Local Variable
String password = request.getParameter("pwd");
if(userid!=null && password!=null){
if(userid.equals(password)){
%>
<h1>Welcome <%=userid %>  &nbsp;&nbsp; HIT COUNT IS <%=hitCounter %></h1>
<%=termsAndConditions %>
<%
if(userid.equals("amit")){
%>
<jsp:include page="footer.jsp" flush="true"></jsp:include>
<%-- Footer Data is <%=showFooterData %> --%>
<%

}
%>
<%
}
else{
%>
<h1 class="alert-danger">Invalid Userid or Password</h1>
<%
}
}
%>

<!-- <form action="index.jsp" method="post" id="f1" onsubmit="return beforeSubmit()"> -->
<!-- UserDTO obj = new UserDTO();
	obj.setUserid(request.getParameter("userid"));
 -->
 <jsp:include page="">
 <jsp:param value="" name=""/>
 </jsp:include>
 <jsp:plugin code="MyApplet.class" codebase="" type="applet">
 <jsp:fallback>Sad Ur Browser Not Support Applet</jsp:fallback>
 </jsp:plugin>
<jsp:useBean id="obj" class="com.bmpl.ims.users.UserDTO" scope="page">
<jsp:setProperty property="*" name="*"/>
</jsp:useBean>
<jsp:getProperty property="userid" name="userid"/>
<label>Userid</label>

<input type="text" name="userid" id="userid" onblur="validate()">
<span id="useriderror"></span>
<br>
<label>Password</label>
<input type="password" name="pwd" id="pwd">
<br>
<button class="btn btn-primary" onclick="doAjaxCall()">Submit</button>
<!-- <button class="btn btn-primary" type="submit">Login</button> -->
<button class="btn btn-default">Reset</button>

<!-- HTML Comments -->
<%-- <%
/* int a = 100;
int b = 200;
int c = a + b; */
//out.println("Sum is "+c);
//int x = 100/0;
%>
Sum is <%=c %> --%>
</div>
</body>
</html>