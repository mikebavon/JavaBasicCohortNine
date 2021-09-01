package systech.cohort.nine;

public class Bmw extends Vehicle{

    public Bmw(){
        super.displayCountry(this.details);
    }

    private String details = "BMW";

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
