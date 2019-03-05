/**
 * SocialNetwork
 */
public abstract class SocialNetwork {
    Users[] facebookUsers = new Users[10];
    Users[] twitterUsers = new Users[10];
    Users[] instaUsers = new Users[10];
    int contF=0;
    int contT=0;
    int contI=0;
    public abstract void addUser();
    public abstract void post();
}