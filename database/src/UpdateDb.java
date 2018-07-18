import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class UpdateDb {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/ashwin",
                            "ashwin", "123");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a id: ");
            int n = reader.nextInt();
            System.out.println("Enter the new name: ");
            String s = reader.next();

            stmt = c.createStatement();
            String sql = "UPDATE employees set name='"+s+"' where id='"+n+"'";
            stmt.executeUpdate(sql);
            c.commit();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM employees;" );
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  name = rs.getString("name");
                int age  = rs.getInt("age");
                String  designation = rs.getString("designation");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "AGE = " + age );
                System.out.println( "DESIGNATION = " + designation );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
