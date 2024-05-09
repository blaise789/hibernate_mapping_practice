package  com.hibernate_demo.coder;
import com.hibernate_demo.coder.Entity.Laptop;
import com.hibernate_demo.coder.Entity.Names;
import com.hibernate_demo.coder.Entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.hibernate_demo.coder.Entity.Student;
import com.hibernate_demo.coder.Utility.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
//
//        try  {
//            performUserOperation();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    private static void performUserOperation() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//            Session session = sessionFactory.openSession();
//            while (true) {
//                System.out.println("Choose operation:");
//                System.out.println("1. Create");
//                System.out.println("2. Read");
//                System.out.println("3. Update");
//                System.out.println("4. Delete");
//                System.out.println("5. Exit");
//
//                int choice = scanner.nextInt();
//                scanner.nextLine(); // Consume newline
//
//                switch (choice) {
//                    case 1:
//                        createStudent(session);
//                        break;
//                    case 2:
//                        readStudent(session);
//                        break;
//                    case 3:
//                        updateStudent(session);
//                        break;
//                    case 4:
//                        deleteStudent(session);
//                        break;
//                    case 5:
//                        return;
//                    default:
//                        System.out.println("Invalid choice. Please enter a valid option.");
//                }
//            }
//        }
//
//
//    }
//
//    private static void createStudent(Session session) {
//        Transaction transaction = session.beginTransaction();
//
//        Student student = new Student();
//        student.setStudentId(5); // Assuming you want to create a student with ID 5
//        student.setFirstName("karim");
//        student.setLastName("blaise");
//        student.setEmail("blaise@gmail.com");
//
//        session.persist(student);
//
//        transaction.commit();
//        System.out.println("Student created successfully.");
//    }
//
//    private static void readStudent(Session session) {
//        Student student = session.get(Student.class, 5); // Assuming you want to read a student with ID 5
//        if (student != null) {
//            System.out.println("Student details:");
//            System.out.println("ID: " + student.getStudentId());
//            System.out.println("First Name: " + student.getFirstName());
//            System.out.println("Last Name: " + student.getLastName());
//            System.out.println("Email: " + student.getEmail());
//        } else {
//            System.out.println("Student not found.");
//        }
//    }
//
//    private static void updateStudent(Session session) {
//        Transaction transaction = session.beginTransaction();
//
//        Student student = session.get(Student.class, 5); // Assuming you want to update a student with ID 5
//        if (student != null) {
//            student.setFirstName("UpdatedFirstName");
//            session.merge(student);
//            transaction.commit();
//            System.out.println("Student updated successfully.");
//        } else {
//            System.out.println("Student not found.");
//        }
//    }
//
//    private static void deleteStudent(Session session) {
//        Transaction transaction = session.beginTransaction();
//
//        Student student = session.get(Student.class, 5); // Assuming you want to delete a student with ID 5
//        if (student != null) {
//            session.delete(student);
//            transaction.commit();
//            System.out.println("Student deleted successfully.");
//        } else {
//            System.out.println("Student not found.");
//        }

//    }

//   students
   Student st1=new Student();
   st1.setFirstName("kbrown");
   st1.setEmail("kbrown@gmail.com");
   st1.setLastName("kbrown");
   Student st2=new Student();
   st2.setFirstName("remy");
   st2.setLastName("gitoli");
   st2.setEmail("gitoli@gmail.com");
   List<Student> students=List.of(st1,st2);
//        laptopps
        Names teacherNames=new Names();
        teacherNames.setFirstName("blaise");
        teacherNames.setMiddleName("patience");
        teacherNames.setLastName("bigirabagabo");
        Names teacher2Names=new Names();
        teacherNames.setFirstName("nduwayo");
        teacherNames.setMiddleName("nathan");
        teacherNames.setLastName("hooper");
        Teacher teacher1=new Teacher();
        teacher1.setNames(teacherNames);
        teacher1.setStudents(students);
//        laptops
        Laptop laptop1 = new Laptop();
        laptop1.setLapBrand("Lenovo");
        laptop1.setTeacher(teacher1);
        Laptop laptop2 = new Laptop();
        laptop2.setLapBrand("hp");
        laptop2.setTeacher(teacher1);
        Laptop laptop3= new Laptop();
        laptop3.setLapBrand("mac book");
        laptop3.setTeacher(teacher1);
        ArrayList<Laptop> laptopList= new ArrayList<>(List.of(laptop1,laptop2,laptop3));
//        laptop lists
        teacher1.setLaptops(laptopList);
        ////
        Teacher teacher2=new Teacher();
        teacher2.setNames(teacher2Names);
        laptop1.setLapBrand("Lenovo");
        laptop1.setTeacher(teacher2);
        Laptop laptop= new Laptop();
        laptop2.setLapBrand("hp");
        laptop2.setTeacher(teacher2);
        laptop3.setLapBrand("mac book");
        laptop3.setTeacher(teacher2);
        teacher2.setLaptops(laptopList);
        teacher2.setStudents(students);

        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(teacher1);
        session.persist(teacher2);

        transaction.commit();

    }


}