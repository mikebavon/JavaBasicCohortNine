package systech.cohort.nine;


import java.util.Scanner;

public class DatabaseConn {

    public static void main(String args []) {

        int counter = 0;
        while (counter < 5) {
            System.out.println("Add Student");
            Scanner input = new Scanner(System.in);
            Student student = new Student();
            System.out.println("NAME:");
            student.setName(input.nextLine());
            System.out.println("CLASS:");
            student.setSkulClass(input.nextLine());
            System.out.println("MARK:");
            student.setMark(input.nextDouble());
            System.out.println("SELECT GENDER: ");
            System.out.println("1. MALE");
            System.out.println("2. FEMALE");
            System.out.println("3. NA");
            student.setGender(Gender.values()[input.nextInt() - 1]);
            System.out.println("LEVEL: ");
            System.out.println("1. PRIMARY");
            System.out.println("2. SECONDARY");
            System.out.println("3. UNIVERSITY");
            System.out.println("4. NA");
            student.setLevel(StudentLevel.values()[input.nextInt() - 1]);

            PrimaryStudentController primaryStudentController = new PrimaryStudentController();
            primaryStudentController.addStudent(student);

            for (Student studentList : primaryStudentController.listStudent()) {
                System.out.println(studentList.getId() + ". " + studentList.getName() + " of class/grade/year " + studentList.getSkulClass()
                        + " got " + studentList.getMark());

            }

            counter++;
        }
    }

}

