package saptami;

public class User {
    private String name;
    private String email;
    private String Password;
    
    User(){
  	  
    }
    
    public String getPasswordHash() {
		return Password;
  	  
    }
    
    public void setPassword(String password) {
  	  this.Password = password;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
}