package systech.cohort.nine;

public enum StudentLevel {

    PRIMARY("Primary Level", "Shule Ya Msingi"),
    SECONDARY("Secondary Level", "Shule Ya Upili"),
    UNIVERSITY("University Level", "Chuo Kikuu"),
    NA("Not Specified", "Aijulikani");

    private String name;

    private String kiswLang;

    StudentLevel(String name, String kiswLang){
        this.name = name;
        this.kiswLang = kiswLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKiswLang() {
        return kiswLang;
    }

    public void setKiswLang(String kiswLang) {
        this.kiswLang = kiswLang;
    }
}
