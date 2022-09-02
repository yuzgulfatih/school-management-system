import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher fatih = new Teacher(1 , "Fatih" , 500);
        Teacher emine = new Teacher(2 ,"Emine",700 );
        Teacher irem = new Teacher(3 , "Irem", 600);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(fatih);
        teacherList.add(emine);
        teacherList.add(irem);

        Student yasin = new Student(1 , "Yasin" , 12);
        Student gurkan = new Student(2,"Gurkan",9);
        Student mustafa = new Student(3,"Mustafa",5);

        List<Student> studentList = new ArrayList<>();

        studentList.add(yasin);
        studentList.add(mustafa);
        studentList.add(gurkan);

        School ceas = new School(teacherList , studentList);
        mustafa.payFees(4500);
        yasin.payFees(5000);
        gurkan.payFees(6000);
        System.out.println("Ceas has earned " + ceas.getTotalMoneyEarned() + " TL.");

        System.out.println("-----------Teacher's salary-----------");

        fatih.receiveSalary(fatih.getSalary());
        System.out.println(teacherList);


    }
}