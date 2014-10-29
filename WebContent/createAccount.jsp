    <%@ page contentType="text/html; charset=UTF-8"%>  
    <%@ taglib prefix="s" uri="/struts-tags"%>  
    <html>  
        <head>  
            <title>Test efficiency</title>  
        </head>  
        <body>  
            <h2>  
                
            </h2>  
            <s:actionerror />  
            <s:form action="testCRUD" method="post" >  
                
                <s:textfield name="name" label="Name"/>
                <s:password name="password" label="Password"></s:password> 
                <s:submit value="Upload" align="center" />  
            </s:form>  
        </body>  
    </html>  