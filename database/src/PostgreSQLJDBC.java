import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
            stmt = c.createStatement();
            String sql = "INSERT INTO employees VALUES (8, 'manu', 32, 'Clerk');";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO employees VALUES (9, 'minnu', 25, 'manager');";
            stmt.executeUpdate(sql);

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