package systech.cohort.nine;

public class Ducati extends MotorCycle{

    public Ducati(){
        super.displayCountry(this.details);
    }

    private String details = "SINGAPORE";

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
