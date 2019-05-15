package ss1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    public int ID;
    public String name;
    public String age;
    public String address;
    public float gpa;
    public ArrayList<Student> studentsList = new ArrayList<Student>();

    public Student(){

    }
    public Student(int ID, String name, String age, String address, float gpa){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public Student input(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhạp vào ID: ");
        ID = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào tên SV: ");
        name = scanner.nextLine();

        System.out.println("Nhập vào tuổi SV: ");
        age = scanner.nextLine();

        System.out.println("Nhập vào địa chỉ: ");
        address = scanner.nextLine();

        System.out.println("Nhập vào điểm trung bình SV: ");
        gpa = Float.parseFloat(scanner.nextLine());

        Student std = new Student(ID,name,age,address,gpa);
        return std;


    }

    public void addStudent(){
        Student student = new Student();
        Scanner scanner = new Scanner (System.in);

        int sl;
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        sl = scanner.nextInt();
        for (int i = 0; i < sl; i++) {
            student = student.input();
            studentsList.add(student);
        }
    }

    public void  editStudent(){
        int IDluachon;
        int luachon;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhập ID sinh viên: ");
        IDluachon = scanner.nextInt();
        boolean b = true;

        do{
            System.out.println("Nhập ID sinh viên: ");
            ID = scanner.nextInt();
            for (int i = 0; i < studentsList.size() ; i++) {
                if(IDluachon == studentsList.get(i).ID){
                    do{
                        System.out.println("1.Edit ID SV.");
                        System.out.println("2.Edit name SV.");
                        System.out.println("3.Edit age SV. ");
                        System.out.println("4.Edit address SV.");
                        System.out.println("5.Edit gpa SV.");
                        System.out.println("0.Thoát chỉnh sửa");
                        do {
                            System.out.println("Nhap lua chon cua ban:");
                            luachon = scanner.nextInt();
                            if (luachon < 0 || luachon > 5){
                                System.out.println("Nhập sai , vui lòng nhập lại");

                            }
                        }
                        while (luachon < 0 || luachon > 6);
                        switch (luachon){
                            case 1:
                                System.out.println("Edit ID SV:");
                                System.out.println("ID new:");
                                int IDnew = scanner.nextInt();
                                studentsList.get(i).ID = IDnew;
                                System.out.println("Successful Change");
                                break;

                            case 2:
                                System.out.println("Edit name SV:");
                                System.out.println("Name new:");
                                String namenew = scanner.nextLine();
                                studentsList.get(i).name = namenew;
                                System.out.println("Successful Change");
                                break;

                            case 3:
                                System.out.println("Edit age SV:");
                                System.out.println("Age new:");
                                String agenew = scanner.nextLine();
                                studentsList.get(i).age = agenew;
                                System.out.println("Successful Change");
                                break;

                            case 4:
                                System.out.println("Edit Address SV:");
                                System.out.println("Address new:");
                                String addressnew = scanner.nextLine();
                                studentsList.get(i).address = addressnew;
                                System.out.println("Successful Change");
                                break;

                            case 5:
                                System.out.println("Edit gpa SV:");
                                System.out.println("GPA new:");
                                Float gpanew = scanner.nextFloat();
                                studentsList.get(i).gpa = gpanew;
                                System.out.println("Successful Change");
                                break;
                            case 0:
                                System.out.println("GoodBye");
                                continue;
                        }


                    }while (luachon != 0);
                    b = true;
                    break;
                }
            }
            if(b) System.out.println("Not found");
        }
        while (b);
    }

    public void deleteStudent() {
        int IDxoa;
        boolean hihi = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập ID sinh viên: ");
            IDxoa = scanner.nextInt();
            for (int i = 0; i < studentsList.size(); i++) {
                if (IDxoa == studentsList.get(i).ID) {
                    studentsList.remove(i);
                    System.out.println("Đã xóa thông tin sinh viên" + name + "có ID " + ID);
                    break;
                } else {
                    System.out.println("ID sai, vui lòng nhập lại");
                }
            }
        }while (hihi);
    }

    public void sortStudentGpa(){
        Collections.sort(studentsList, new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                return Float.compare(o1.gpa, o2.gpa);
            }
        });

    }
    public void sortStudentName(){
        Collections.sort(studentsList, new Comparator<Student> () {

            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

    }

    public void showStudentList(){
        System.out.println("List Student");

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("STT "+(i+1)+" | "+"ID : "+studentsList.get(i).ID+" | "+"Name : "+studentsList.get(i).name+" | "
                    +"Age : "+studentsList.get(i).age+" | "+"Adress : "+studentsList.get(i).address+" | "+"GPA : "+studentsList.get(i).gpa);
        }
    }
}
