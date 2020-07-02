public class Symptom {

    private String name;
    private int numberOfDays;

    public Symptom() {

    }

    public Symptom(String name, int numberOfDays) {
        this.name = name;
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String toString() {
        return "\t\thad " + this.name + " for " + this.numberOfDays + " days";
    }
}

