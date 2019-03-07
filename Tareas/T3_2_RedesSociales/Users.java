package Tareas.T3_2_RedesSociales;

/**
 * Users
 */
public class Users {
    protected String username;
    protected String password;

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean equalsUser(Users u){
        if(username.equalsIgnoreCase(u.getUsername())&&(password.equalsIgnoreCase(u.getPassword()))){
            return true;
        }
        return false;
    }
}