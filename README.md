# Contact Tracing Program

Due to the COVID-19 pandemic of today, everyone is doing their best to stop the 
spread of the virus by staying home.  Experts already stated that we need to wait 
until COVID-19 cases actually start to decline over several weeks before 
reopening businesses and going back to school and work. But once people start 
resuming their normal routines, it will be essential to trace contacts of a 
newly infected patient to contain emerging clusters of COVID-19 infections. 
Contact tracing is a key strategy for preventing further spread of the virus 
according to the Centers for Disease Control and Prevention. This week’s challenge 
is to write a Contact Tracing Program that produces a contact report of an infected 
patient.

 

Requirements:
Write a program that will allow a user to enter in:
a name, 
an email address,
a phone number, 
an address (city & state),
at least one symptom:
name of a symptom,
number of days with this symptom
At least one contacted person:
a name,
an email address,
a phone number
 

Functionalities

Build as an Object-Oriented Program
must contain multiple classes, implement composition
use inheritance if/when possible
all instance variables must be accessed via methods (getters & setters)
The main method of the program should handle all user interaction
The data must be kept in a collection (i.e. Arrays, Array List, or Hash Map)
Must check for all symptoms
Ensure that users have met the minimum amount of items requirements
Make the report look pretty!
 

Common signs and symptoms can include:

Fever
Cough
Shortness of breath or difficulty breathing
Tiredness
Aches
Chills
Sore throat
Loss of smell
Loss of taste
Headache
Diarrhea
Severe vomiting
Output Example:

    Contact Tracing Program
    Enter a newly infected person's information
    What is a patient's name?
    Elsa
    What is a patient's phone number? 
    111-222-3333
    What is a patient's email?
    elsa@frozen.com
    What city does a patient live in?
    Arendelle
    What state does a patient live in?
    Whoknows
    
    Does Elsa have any symptom for Fever? (y/n)
    y
    How long has  Elsa  had this symptom for?
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
    
    ***** Contact Tracing Report *****
    Name: Elsa
    Phone: 111-222-3333
    Email: elsa@frozen.com
    City: Arendelle	State:Whoknows
    
    **	Symptoms: 
        had Fever for 5 days
        had Aches for 2 days
        had Chills for 4 days
    
    
    **      Contacts:
    Name: Olaf
    Phone: unknown
    Email: unknown
    
    
    Name: Anna
    Phone: 333-444-9999
    Email: anna@somewhere.com
    


