/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38
 */

import javax.swing.*;
import java.text.DecimalFormat;

/*
    1. get input - hourly rate, hours worked, sales commission percent, total sales
    2. calculate pay without commission
    3. calculate commission
    4. calculate total
    5. output results
 */
    public class SalesCommission {

        public static void main(String[] args) {
            double hourlyRate = getInput("What is your hourly rate?");
            double hoursWorked = getInput("How many hours have you worked?");
            double commissionPercent = getInput("What is your commission percent?");
            double totalSales = getInput("What is your total sales?");

            double payNoCom = payNoCom(hourlyRate, hoursWorked);
            double commission = commission(commissionPercent, totalSales);

            double totalEarnings = totalEarnings(payNoCom, commission);

            output(totalEarnings);

        }

        public static double getInput(String prompt){

            return Double.parseDouble(JOptionPane.showInputDialog(prompt));

        }

        public static double payNoCom(double hourlyRate, double hoursWorked){
            return hourlyRate * hoursWorked;
        }

        public static double commission(double commissionPercent, double totalSales){
            return totalSales * commissionPercent / 100.0;
        }

        public static double totalEarnings(double payNoCom, double commission){
            return payNoCom + commission;
        }

        public static void output(double totalEarnings){

            DecimalFormat round = new DecimalFormat("#,###.00");
            JOptionPane.showMessageDialog(null, "Your total earnings: " + round.format(totalEarnings));
        }

}
