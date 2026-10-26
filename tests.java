import java.util.Scanner;

public class tests {
    private double ave;
    private int count;
    private int score;

    public tests() {
        ave = 0.0;
        count = 0;
        score = 0;
    }

    public void getAverage() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        count = 0;

        System.out.print("Enter a test score (-1 to quit): ");
        score = input.nextInt();

        while (score != -1) {
            sum += score;
            count++;
            System.out.print("Enter a test score (-1 to quit): ");
            score = input.nextInt();
        }

        ave = count == 0 ? Double.NaN : (double) sum / count;
        input.close();
    }

    @Override
    public String toString() {
        return "The average of the " + count + " scores entered is " + String.format("%.2f", ave) + ".";
    }
}
