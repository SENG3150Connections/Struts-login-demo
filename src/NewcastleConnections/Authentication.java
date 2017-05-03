package NewcastleConnections;

import com.opensymphony.xwork2.ActionSupport;

import java.util.LinkedList;

/**
 * Created by seb on 2/5/17.
 */
public class Authentication extends ActionSupport {


    private LinkedList<String> users = new LinkedList<>();
    private LinkedList<String> passwords = new LinkedList<>();


    private String username;
    private String password;

    public Authentication() {
        users.add("user");
        passwords.add("pw");
        users.add("AnotherUser");
        passwords.add("secretPassword");
        users.add("seb");
        passwords.add("password");




    }



    public String execute() {

        // Populate dummy user data





        return "SUCCESS";


    }

    public void validate(){

        if(getUsername().equals("")){ // Empty username field

            addFieldError("username", getText("Username required"));

        }

        if((getPassword()).equals("")){ // Empty password field

            addFieldError("password", getText("Password required"));

        }


        // Test input

        boolean inputValid = false;

        for (int i = 0; i < users.size(); i++ ) {

            if ( username.equals(users.get(i)) ) {

                if (password.equals(passwords.get(i))) {

                    // match found, input is valid
                    inputValid = true;
                }

            }

        }

        if (!inputValid) {

            addFieldError("password", getText("Password Incorrect"));


        }


    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
