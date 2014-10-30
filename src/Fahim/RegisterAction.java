package Fahim;
import com.opensymphony.xwork2.ActionSupport;  

public class RegisterAction extends ActionSupport{  
private String username,userpass;
private String email;  
  
public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  
  
public String execute(){  
    return "success";  
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}  
  
}  