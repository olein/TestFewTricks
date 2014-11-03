<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
  
successful

<s:property value="result"/>

    <table border="0" align="left" width=30%>
	<tr><td>Name</td><td>Password</td></tr>
	<s:iterator value="output">
	<tr><td><s:property value="name"/></td>
	<td><s:property value="password"/></td></tr>
	</s:iterator>
	</table>

</body>
</html>