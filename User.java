public class User {

    private String userUserName;
    private String userFirstName;
    private String userLastName;
    private String userUrl;
    private String userEmail;

    public User() {}

    public User (String userUserName, String userFirstName, String userLastName, String userEmail, String userUrl) {
        this.userUserName = userUserName;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userUrl = userUrl;
        this.userEmail = userEmail;
    }

    public String getUserUserName(){
        return this.userUserName;
    }

    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }

    public String getUserFirstName(){
        return this.userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName(){
        return this.userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserUrl(){
        return this.userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getUserEmail(){
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
