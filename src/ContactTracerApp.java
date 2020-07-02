import java.util.Scanner;

public class ContactTracerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listOfSymptoms = new String[]{
                "Fever", "Cough", "Shortness of breath or difficulty breathing",
                "Tiredness", "Aches", "Chills",
                "Sore throat",
                "Loss of smell",
                "Loss of taste",
                "Headache",
                "Diarrhea",
                "Severe vomiting"
        };





        String patientName;
        InfectedUser patient;
        ContactedUser contactedUser;

        System.out.println("Contact Tracing Program");
        System.out.println("Enter a newly infected person's information");
        patient = new InfectedUser();
        System.out.println("What is a patient's name?");
        patientName = scanner.next();
        patient.setName(scanner.next());

        System.out.printf("What is a %s's phone number?\n", patientName);
        patient.setPhoneNumber(scanner.next());
        System.out.printf("What is a %s's email?\n", patientName);
        patient.setEmail(scanner.next());
        System.out.printf("What city does a %s live in?\n", patientName);
        patient.setCity(scanner.next());
        System.out.printf("What state does %s live in\n?", patientName);
        patient.setState(scanner.next());

        do {

            askAgain =
        } while();
        System.out.println("Does Elsa have any symptom for Fever? (y/n)");
        y
        System.out.println("How long has %d had this symptom for?");
        5 days
        Does Elsa have any symptom for Cough? (y/n)
        n
        Does Elsa have any symptom for Shortness of breath or difficulty breathing? (y/n)
        n
        Does Elsa have any symptom for Tiredness? (y/n)
        n
        Does Elsa have any symptom for Aches? (y/n)
        y
        How long has  Elsa  had this symptom for?
        2 days
        Does Elsa have any symptom for Chills? (y/n)
        y
        How long has  Elsa  had this symptom for?
        4 days
        Does Elsa have any symptom for Sore throat? (y/n)
        n
        Does Elsa have any symptom for Loss of smell? (y/n)
        n
        Does Elsa have any symptom for Loss of taste? (y/n)
        n
        Does Elsa have any symptom for Headache? (y/n)
        n
        Does Elsa have any symptom for Diarrhea? (y/n)
        n
        Does Elsa have any symptom for Severe vomiting? (y/n)
        n

        Has Elsa met or run into anyone? (y/n)
        y
        What is his/her name?
                Olaf
        What is his/her phone number?
        unknown
        What is his/her email?
                unknown
        Have Elsa met or run into anyone else? (y/n)
        y
        What is his/her name?
                Anna
        What is his/her phone number?
        333-444-9999
        What is his/her email?
                anna@somewhere.com

        Have Elsa met or run into anyone else? (y/n)
        n




    }
}
