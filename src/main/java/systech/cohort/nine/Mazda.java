package systech.cohort.nine;

public class Mazda extends Vehicle{

    public Mazda(){
        super.displayCountry(this.details);
    }

    private String details = "Mazda";

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
