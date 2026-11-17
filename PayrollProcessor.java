import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/** Reads employee pay data from pay.csv and writes weekly pay to output.csv. */
public class PayrollProcessor {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String inputLine = reader.readLine();

            // Write headings for the output file.
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            // Skip the input heading row, if present.
            if (inputLine != null) {
                inputLine = reader.readLine();
            }

            while (inputLine != null) {
                if (!inputLine.trim().isEmpty()) {
                    String[] fields = inputLine.split(",");

                    String empID = fields[0].trim();
                    double payRate = Double.parseDouble(fields[1].trim());
                    double hoursWorked = Double.parseDouble(fields[2].trim());

                    double weeklyPay;
                    if (hoursWorked <= 40) {
                        weeklyPay = payRate * hoursWorked;
                    } else {
                        weeklyPay = (payRate * 40)
                                  + (payRate * 1.5 * (hoursWorked - 40));
                    }

                    String outputLine = empID + ","
                                      + payRate + ","
                                      + hoursWorked + ","
                                      + currency.format(weeklyPay);
                    writer.write(outputLine);
                    writer.newLine();
                }

                inputLine = reader.readLine();
            }

            System.out.println("Payroll processing complete. Output written to " + outputFile);
        } catch (IOException | NumberFormatException exception) {
            System.out.println("Error processing payroll: " + exception.getMessage());
        }
    }
}
