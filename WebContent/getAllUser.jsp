<%@ page contentType="text/html; charset=UTF-8"%>  
    <%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="getAllUser.action?">Get all</a><br/>
	Get all by criteria: <br/>
	<s:form action="getAllUserByCriteria" method="post" >  
                
                <s:textfield name="name" label="Name"/>
                <s:password name="password" label="Password"></s:password> 
                <s:submit value="Upload" align="center" />  
     </s:form>  <br/>
	<a href="addUser.action?name=lenin&password=lenin">Add user</a>
	
	<br/> Update user:<br/>
	<s:form action="updateUser" method="post" >  
                
                <s:textfield name="name" label="Name"/>
                <s:password name="password" label="Password"></s:password> 
                <s:submit value="Upload" align="center" />  
     </s:form>  <br/>
     <a href="deleteUser.action?">delete</a><br/>
</body>
</html>