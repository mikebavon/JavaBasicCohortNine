package systech.cohort.nine;

import java.util.Random;

public class Student {

    private int id;

    private String name;

    private String skulClass;

    private double mark;

    private Gender gender;

    private StudentLevel level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkulClass() {
        return skulClass;
    }

    public void setSkulClass(String skulClass) {
        this.skulClass = skulClass;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StudentLevel getLevel() {
        return level;
    }

    public void setLevel(StudentLevel level) {
        this.level = level;
    }

    public String createUpdateSql(){

        String sql;

        if (getId() == 0) {
            sql = "insert into students(id,name,class,mark,gender,level) values(";

            sql += new Random().nextInt() + ",";
            sql += "'" + getName() + "',";
            sql += "'" + getSkulClass() + "',";
            sql += getMark() + ",";
            sql += "'" + (getGender() == null ? "NA" : getGender().name()) + "',";
            sql += "'" + (getLevel() == null ? "NA" : getLevel().name()) + "')";

        } else {
            sql = "update students set ";

            String setCol = "";

            if (getName() != null && !getName().trim().equals(""))
                setCol += "name='" + getName();

            if (!setCol.equals("") && getSkulClass() != null && !getSkulClass().trim().equals(""))
                setCol += ",class='" + getSkulClass() + "',";

            if (!setCol.equals("") && getMark() > 0)
                setCol += ",mark=" + getSkulClass() + ",";

            if (!setCol.equals("") && getGender() != null)
                setCol += ",gender='" + getGender().name() + "',";

            if (!setCol.equals("") && getLevel() != null)
                setCol += ",level='" + getLevel().name() + "',";

            sql += setCol;

            sql += " where id=" + getId();

        }

        System.out.println("Executing sql: " + sql);

        return sql;


    }
}
