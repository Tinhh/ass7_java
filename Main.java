package ss1;
import ss1.Student;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int luachon;
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Edit Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Sort by gpa");
            System.out.println("5.Sort by name");
            System.out.println("6.Show List Student");
            System.out.println("0.Exit");
            do {
                System.out.println("Nhập các số để chọn từng chức năng (1/2/3/4/5/6/0) : ");
                luachon = scanner.nextInt();
                if (luachon < 0 || luachon > 6) {
                    System.out.println("Not found");
                }
            }while (luachon < 0 || luachon > 6);
                switch (luachon){
                    case 1:
                        System.out.println("Add Student ");
                        student.addStudent();
                        break;
                    case 2 :
                        System.out.println("Edit Student");
                        student.editStudent();
                        break;
                    case 3 :
                        System.out.println("Delete Student");
                        student.deleteStudent();
                        break;
                    case 4 :
                        System.out.println("Sort by GPA ");
                        student.sortStudentGpa();
                        student.showStudentList();
                        break;
                    case 5 :
                        System.out.println("Sort by NAME  ");
                        student.sortStudentName();
                        student.showStudentList();
                        break;
                    case 6:
                        System.out.println("Show list Student");
                        student.showStudentList();
                        break;
                    case 0 :
                        System.out.println("EXIT");
                        System.exit(0);
                        break;

                }


        }while (luachon != 0);
    }
}
