package systech.cohort.nine;

public abstract class Vehicle implements MotorI {

    private String country;

    public void displayCountry(String details) {
        String country;

        if (details == null)
            country = "Unknown";
        else if (details.contains("Toyota") || details.contains("Mazda") || details.contains("Subaru") )
            country = "Japan";
        else if (details.contains("BMW") || details.contains("VW"))
            country = "Germany";
        else if (details.contains("Land Rover"))
            country = "Uk";
        else
            country = "Invalid country details";

        this.country = country;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
