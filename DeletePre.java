
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletePre{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            //
            String sql ="DELETE FROM stud_2 WHERE grno = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            int grno=0;
            System.out.print("Enter grno for which you want to delete : ");
            grno = sc.nextInt();
            pstmt.setInt(1, grno);
            int x = pstmt.executeUpdate();
            System.out.println("Number of row Inserted : " +x);
            cn.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}