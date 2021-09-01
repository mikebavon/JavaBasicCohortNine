package systech.cohort.nine;

public class Subaru extends Vehicle{

    public Subaru(){
        super.displayCountry(this.details);
    }

    private String details = "Subaru";

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
