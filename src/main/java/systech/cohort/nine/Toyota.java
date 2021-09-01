package systech.cohort.nine;

public class Toyota extends Vehicle{

    public Toyota(){
        super.displayCountry(this.details);
    }

    private String details = "Toyota";

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
