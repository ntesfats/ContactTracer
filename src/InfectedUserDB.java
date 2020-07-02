import java.util.ArrayList;

public class InfectedUserDB {
    private ArrayList<InfectedUser> listOfInfectedUser;

    public InfectedUserDB(){
        listOfInfectedUser = new ArrayList<InfectedUser>();
    }

    public void addInfectedUser(InfectedUser infectedUser){
        listOfInfectedUser.add(infectedUser);
    }

    public ArrayList<InfectedUser> getAllInfectedUser(){
        return new ArrayList<>(listOfInfectedUser);
    }
}
