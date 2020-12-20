package Errorhandler;

public class User {

    public boolean isUserValid(String userName,String Password){
        if(userName.equals("Gaby") && Password.equals("Gaby")){
            return true;
        }

        return false;
    }
}
