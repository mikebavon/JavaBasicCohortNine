package systech.cohort.nine;

public class MotorCycle implements MotorI {

    private String country;

    public void displayCountry(String details){
        this.country = "China";
    };

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
