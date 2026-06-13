/*
33. Transaction Handling in JDBC 
• Objective: Use JDBC transactions. 
• Task: Simulate a money transfer between two accounts. 
• Instructions: 
o Create accounts table with balances. 
o Implement a transfer method with Connection.setAutoCommit(false). 
o Commit if both debit and credit succeed, else rollback.
*/

import java.sql.*;

public class MoneyTransfer {

    public static void transfer(
            Connection con,
            int fromAccount,
            int toAccount,
            double amount) {

        try {
            con.setAutoCommit(false);

            PreparedStatement debit =
                con.prepareStatement(
                    "UPDATE accounts SET balance=balance-? WHERE id=?");

            debit.setDouble(1, amount);
            debit.setInt(2, fromAccount);
            debit.executeUpdate();

            PreparedStatement credit =
                con.prepareStatement(
                    "UPDATE accounts SET balance=balance+? WHERE id=?");

            credit.setDouble(1, amount);
            credit.setInt(2, toAccount);
            credit.executeUpdate();

            con.commit();
            System.out.println("Transfer Successful");

        } catch (Exception e) {
            try {
                con.rollback();
                System.out.println("Transaction Rolled Back");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}