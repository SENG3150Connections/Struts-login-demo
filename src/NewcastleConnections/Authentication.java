package NewcastleConnections;

import com.opensymphony.xwork2.ActionSupport;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by seb on 2/5/17.
 */
public class Authentication extends ActionSupport {


    private String listOfUsers;

    private LinkedList<String> users = new LinkedList<>();
    private LinkedList<String> passwords = new LinkedList<>();


    private String username;
    private String password;

    public Authentication() {


        users.add("user");
        passwords.add("pw");
        users.add("u");
        passwords.add("p");
        users.add("AnotherUser");
        passwords.add("secretPassword");
        users.add("seb");
        passwords.add("password");




    }



    public String execute() {


        return "SUCCESS";


    }



    public void validate(){




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


            if(getUsername().equals("")){ // Empty username field

                addFieldError("username", getText("Username required"));

            } else if((getPassword()).equals("")){ // Empty password field

                addFieldError("password", getText("Password required"));

            } else {

                if (!inputValid) {

                    // addActionError("INVALID");


                    addFieldError("username", getText("Password Incorrect"));


                }
            }

    }

    public LinkedList<String> getListOfUsers() {

        LinkedList<String> pairs = new LinkedList<>();

        for (int i = 0; i < users.size(); i++ ) {

            pairs.add(users.get(i) + " | " + passwords.get(i));
        }

        return pairs;

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
