    <%@ page contentType="text/html; charset=UTF-8"%>  
    <%@ taglib prefix="s" uri="/struts-tags"%>  
    <html>  
        <head>  
            <title>Test link value</title>  
        </head>  
        <body>  
            <h2>  
                Struts2 File Upload & Save Example without Database  
            </h2>  
            <s:actionerror />  
            <s:form action="GetLinks" method="post" >
                <s:textfield name="name" label="Name"/> 
                <s:submit value="Upload" align="center" />  
            </s:form>  
        </body>  
    </html>  