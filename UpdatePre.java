
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdatePre{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            //
            String sql ="UPDATE stud_2 SET name = ? WHERE grno = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            int grno=0;
            String name = "";

            System.out.print("Enter grno for which you want to Update : ");
            grno = sc.nextInt();
            System.out.println(" ");
            System.out.print("Enter new name : ");
            name = sc.next();
           
            pstmt.setString(1, name);
            pstmt.setInt(2, grno);

            int x = pstmt.executeUpdate();
            System.out.println("Number of row Inserted : " +x);
            cn.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}