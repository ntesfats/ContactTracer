import java.util.ArrayList;

public class InfectedUser extends User{

    private String city;
    private String state;
    private ArrayList<Symptom> symptoms;
    private ArrayList<ContactedUser> contactedUsers;

    public InfectedUser(String name, String email, String phoneNumber, String city, String state,
                        ArrayList<Symptom> symptoms, ArrayList<ContactedUser> contactedUsers) {
        super(name, email, phoneNumber);
        this.city = city;
        this.state = state;
        this.symptoms = symptoms;
        this.contactedUsers = contactedUsers;
    }

    public InfectedUser() {
    }

    public InfectedUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<ContactedUser> getContactedUsers() {
        return contactedUsers;
    }

    public void setContactedUsers(ArrayList<ContactedUser> contactedUsers) {
        this.contactedUsers = contactedUsers;
    }
}
