import java.util.Scanner;

public class ContactTracerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InfectedUserDB infectedUserDB = new InfectedUserDB();

        String[] listOfSymptoms = new String[]{
                "Fever", "Cough", "Shortness of breath or difficulty breathing",
                "Tiredness", "Aches", "Chills", "Sore throat",
                "Loss of smell", "Loss of taste",  "Headache",
                "Diarrhea", "Severe vomiting"
        };

        System.out.println("Contact Tracing Program");
        Boolean thereIsMoreInfectedPerson = true;
        do {
            contactTraceProgram(scanner, listOfSymptoms, infectedUserDB);

            System.out.println("Do you want to add another infected person's information (y/n)");
            thereIsMoreInfectedPerson = scanner.next().equalsIgnoreCase("y");
        } while(thereIsMoreInfectedPerson);

        // Print out the report
        ContactTracingReport(infectedUserDB);

    }
    public static void ContactTracingReport(InfectedUserDB infectedUserDB){
        System.out.println("\n\t***** Contact Tracing Report *****\n");
        System.out.println();
        int counter = 0;
        for (InfectedUser infectedUser : infectedUserDB.getAllInfectedUser()){
            System.out.printf("Patient %d: \n", ++counter);
            System.out.println(infectedUser);

            System.out.println();

            System.out.println("\t****\tSymptoms:");
            for (Symptom symptom : infectedUser.getSymptoms()) {
                System.out.println(symptom);
            }
            System.out.println();

            System.out.println("\t****\tContacts:");
            for (ContactedUser contUser : infectedUser.getContactedUsers()){
                System.out.println(contUser);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void contactTraceProgram(Scanner scanner, String[] listOfSymptoms, InfectedUserDB infectedUserDB){
        String patientName;
        InfectedUser infectedPatient;

        System.out.println("\nEnter a newly infected person's information");
        infectedPatient = new InfectedUser();
        System.out.println("What is a patient's name?");
        patientName = scanner.next();
        infectedPatient.setName(patientName);

        System.out.printf("What is a %s's phone number?\n", patientName);
        infectedPatient.setPhoneNumber(scanner.next());
        System.out.printf("What is a %s's email?\n", patientName);
        infectedPatient.setEmail(scanner.next());
        System.out.printf("What city does a %s live in?\n", patientName);
        scanner.nextLine();
        infectedPatient.setCity(scanner.nextLine());
        System.out.printf("What state does %s live in?\n", patientName);
        infectedPatient.setState(scanner.next());


        askForAnySymptom(scanner, patientName, listOfSymptoms, infectedPatient);

        haveMadeContactWithAnyone(scanner, patientName, infectedPatient);


        infectedUserDB.addInfectedUser(infectedPatient);
    }

    public static void askForAnySymptom(Scanner scanner, String patientName, String[] listOfSymptoms,
                                        InfectedUser infectedPatient) {
        String inputAnswer;
        Boolean hasSymptom;
        int numberOfDays;
        Symptom patientSymptom;

        for(int i=0; i < listOfSymptoms.length; i++){
            System.out.printf("Does %s have any symptom for %s? (y/n)\n", patientName, listOfSymptoms[i]);
            inputAnswer = scanner.next();
            hasSymptom = inputAnswer.equalsIgnoreCase("y");

            if (hasSymptom) {
                System.out.printf("How long has %s had this symptom for? (in # of Days)\n", patientName);
                numberOfDays = scanner.nextInt();
                patientSymptom = new Symptom(listOfSymptoms[i], numberOfDays);
                infectedPatient.addSymptom(patientSymptom);
            }
        }
    }

    public static void haveMadeContactWithAnyone(Scanner scanner, String patientName,
                                                 InfectedUser infectedPatient) {
        ContactedUser contactedUser;
        String inputAnswer;
        String contactedUserName;


        Boolean metOrRunIntoAnyone = false;
        Boolean first = true;
        do {

            contactedUser = new ContactedUser();
            if (first) {
                System.out.printf("Has %s met or run into anyone? (y/n)\n", patientName);
                inputAnswer = scanner.next();
                metOrRunIntoAnyone = inputAnswer.equalsIgnoreCase("y");
            }
            if (metOrRunIntoAnyone) {
                first = false;
                System.out.println("What is his/her name?");
                contactedUserName = scanner.next();
                contactedUser.setName(contactedUserName);

                System.out.printf("What is %s phone number?\n", contactedUserName);
                contactedUser.setPhoneNumber(scanner.next());
                System.out.printf("What is %s email?\n", contactedUserName);
                contactedUser.setEmail(scanner.next());

                infectedPatient.addContactedUser(contactedUser);

                System.out.printf("Have %s met or run into anyone else? (y/n)\n", patientName);
                inputAnswer = scanner.next();
                metOrRunIntoAnyone = inputAnswer.equalsIgnoreCase("y");
            }

        } while(metOrRunIntoAnyone);
    }
}
