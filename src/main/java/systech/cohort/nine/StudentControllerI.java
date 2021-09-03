package systech.cohort.nine;

import java.util.List;

public interface StudentControllerI {

    void addStudent(Student student);

    void editStudent(Student student);

    List<Student> listStudent() throws Exception;

    void deleteStudent(int id);


}
