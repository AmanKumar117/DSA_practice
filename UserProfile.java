import java.io.Serializable;

public class UserProfile implements Serializable {
  private String name;
  private String email;
  private String phone;
//default constructor
  public UserProfile() {
	    this.name = "User";
	    this.email = "user@mail.com";
	    this.phone = "1234567898";
	  }
//parameterised constructor
  public UserProfile(String name, String email, String phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
  }
//setters and getters
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}