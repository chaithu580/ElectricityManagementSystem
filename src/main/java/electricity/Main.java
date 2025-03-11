package electricity;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Establish database connection
        conn connection = new conn();

        // Example: Print a message if the connection is successful
        if (connection.c != null) {
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
