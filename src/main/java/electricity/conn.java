package electricity;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "chaithu@38");

            // Create statement object
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace(); // Print detailed error log
        }
    }
}

