/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tunipharma.entities;

/**
 *
 * @author sicateur
 */
public class Admin {
    private String login ;
    private String pwd;
    private String email;
    public Admin(String login, String pwd,String email) {
        this.login = login;
        this.pwd = pwd;
        this.email = email;
    }

    public Admin() {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
