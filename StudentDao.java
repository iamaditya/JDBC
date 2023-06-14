import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {

    public static boolean insertStudentToDB(Student st)  {
//        code to insert student
        boolean flag = false;
        try {
            Connection c = ConnectionP.createC();

            String query = "insert into student(sname,sphone,scity) values(?,?,?)";

//        using prepared statement

            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, st.getStudentName());
            ps.setString(2, st.getStudentPhone());
            ps.setString(3, st.getStudentCity());

            ps.executeUpdate();

            flag = true;
        }catch(Exception e){
            System.out.println(e);
        }
        return flag;
    }

    public static boolean deleteStudentToDB(int ixd){
        // delete student
        boolean flag = false;
        try{
            Connection c = ConnectionP.createC();
            String query = "delete from student where sid = ?";

            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1,ixd);

            int x = ps.executeUpdate();
           if(x == 0){
               flag = false;
           }else{
               flag = true;
           }

        }catch(Exception e){
            System.out.println(e);
        }

        return flag;
    }


    public static void displayStudent(){

        try{

            Connection c = ConnectionP.createC();
            String query = "select * from student";
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs=  ps.executeQuery();

            System.out.println("ID:\t"+ "Name:\t"+"Phone:\t"+"    City:");
            while(rs.next()){
                int id = rs.getInt("sid");
                String name = rs.getString("sname");
                String phone = rs.getString("sphone");
                String city = rs.getString("scity");


                System.out.println(id+"\t"+ name+"\t"+phone+"\t"+city);

            }




        }catch(Exception e){
            System.out.println(e);
        }

    }
}
