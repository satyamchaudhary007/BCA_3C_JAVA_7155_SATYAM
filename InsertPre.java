
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertPre{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            //
            String sql ="INSERT INTO stud_2 (grno,name) VALUES ( ? ,? )";
            PreparedStatement pstmt = cn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            int grno=0;
            String name = "";

            System.out.print("Enter grno : ");
            grno = sc.nextInt();
            System.out.println(" ");
            System.out.print("Enter name : ");
            name = sc.next();
           
            pstmt.setInt(1, grno);
            pstmt.setString(2, name);

            int x = pstmt.executeUpdate();
            System.out.println("Number of row Inserted : " +x);
            cn.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}