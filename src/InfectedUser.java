import java.util.ArrayList;

public class InfectedUser extends User{

    private String city;
    private String state;
    private ArrayList<Symptom> symptoms;
    private ArrayList<ContactedUser> contactedUsers;

    public InfectedUser() {
        this.symptoms = new ArrayList<Symptom>();
        this.contactedUsers = new ArrayList<ContactedUser>();
    }

    public InfectedUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.symptoms = new ArrayList<Symptom>();
        this.contactedUsers = new ArrayList<ContactedUser>();
    }

    public InfectedUser(String name, String email, String phoneNumber, String city, String state) {
        this(name, email, phoneNumber);
        this.city = city;
        this.state = state;
    }

    public void addContactedUser(ContactedUser contactedUser){
        this.contactedUsers.add(contactedUser);
    }
    public void addSymptom(Symptom symptom){
        this.symptoms.add(symptom);
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

    public String toString() {
        return super.toString() + "\n\t\tCity: " + this.city + " State: " + this.state;
    }

}
