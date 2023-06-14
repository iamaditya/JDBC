import java.sql.SQLException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("PRESS 1 TO ADD STUDENT");
            System.out.println("PRESS 2 TO DELETE STUDENT");
            System.out.println("PRESS 3 TO DISPLAY STUDENT");
            System.out.println("PRESS 4 TO EXIT");

            int n = sc.nextInt();
            sc.nextLine();
            if(n == 1){
                // add

                System.out.println("Student Name : ");
                String name = sc.nextLine();

                System.out.println("Student Phone : ");
                String phone = sc.nextLine();

                System.out.println("Student City : ");
                String city = sc.nextLine();


                Student s1 = new Student(name,phone,city);


                boolean check = StudentDao.insertStudentToDB(s1);

                if(check){
                    System.out.println("Added Sucessfully");
                }else{
                    System.out.println("Error Occured");
                }

                System.out.println(s1);
            }else if(n == 2){
                //

                System.out.println("Enter Student ID to delete : ");
                int x = sc.nextInt();
                sc.nextLine();

                boolean st = StudentDao.deleteStudentToDB(x);

                if(st){
                    System.out.println("Student Deleted Sucessfully");
                }else{
                    System.out.println("Error Occured");
                }

            }else if(n == 3){
                // display
                StudentDao.displayStudent();
            }else if(n == 4){
                break;
            }else{

            }
        }
    }

}
