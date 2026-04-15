import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root123";

        Scanner sc = new Scanner(System.in);

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Input from user
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // SQL Query
            String query = "INSERT INTO student VALUES (?, ?, ?)";

            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Record Inserted Successfully");
            } else {
                System.out.println("Insert Failed");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}