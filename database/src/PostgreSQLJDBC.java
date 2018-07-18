import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PostgreSQLJDBC {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ashwin",
                            "ashwin", "123");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully\n");
            //Insert operations
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a id: ");
            int userId = reader.nextInt();

            System.out.println("Enter the name: ");
            String name = reader.next();

            System.out.println("Enter the age: ");
            int age = reader.nextInt();

            System.out.println("Enter the designation: ");
            String designation = reader.next();

            stmt = c.createStatement();
            String sql = "INSERT INTO employees VALUES ("+userId+",'"+name+"',"+age+",'"+designation+"');";
            stmt.executeUpdate(sql);
//            sql = "INSERT INTO employees VALUES (9, 'minnu', 25, 'manager');";
//            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}