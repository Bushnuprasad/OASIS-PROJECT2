package atmpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deposite {
    public void deposite(Connection con, Scanner sc) {
        try {
        	sc.nextLine();
            System.out.println("Enter your account no:");
            String account_number = sc.next();
            System.out.println("Enter the amount to deposit:");
            double amount = sc.nextDouble();
            sc.nextLine(); 
            String sql = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setDouble(1, amount);
			statement.setString(2, account_number);

          
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Deposit failed. Account number not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

