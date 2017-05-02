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




    public String execute() {

        // Populate dummy user data

        users.add("user");
        passwords.add("pw");
        users.add("AnotherUser");
        passwords.add("secretPassword");
        users.add("seb");
        passwords.add("password");



        // Test input

        for (int i = 0; i < users.size(); i++ ) {

            if ( username.equals(users.get(i)) ) {

                if (password.equals(passwords.get(i))) {

                    // match found, input is valid
                    return "SUCCESS";
                }

            }

        }


        return "ERROR";


    }

    public void validate(){

        if(getUsername().equals("")){ // Empty username field

            addFieldError("username", getText("Username required"));

        }

        if((getPassword()).equals("")){ // Empty password field

            addFieldError("password", getText("Password required"));

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
