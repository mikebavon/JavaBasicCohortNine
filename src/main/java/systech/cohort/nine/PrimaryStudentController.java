package systech.cohort.nine;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PrimaryStudentController extends DatabaseUtil implements StudentControllerI{

    public void addStudent(Student student) {
        execUpdate(student.createUpdateSql());
    }

    public void editStudent(Student student) {
        if (student == null || student.getId() == 0 )
            return;

        execUpdate(student.createUpdateSql());
    }

    public List<Student> listStudent() {
        List<Student> students = new ArrayList<Student>();
        try {
            ResultSet result = execQuery("select * from students");
            while (result.next()) {
                Student student = new Student();
                student.setId(result.getInt(1));
                student.setName(result.getString(2));
                student.setSkulClass(result.getString(3));
                student.setMark(result.getDouble(4));
                student.setGender(Gender.valueOf(result.getString(5)));
                students.add(student);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return students;
    }

    public void deleteStudent(int id) {
        execUpdate("delete from students where id=" + id);
    }
}
