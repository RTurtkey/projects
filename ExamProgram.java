import javax.swing.JOptionPane;

/** Runs the exam score program without conflicting with the repository's Runner class. */
public class ExamProgram {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("How many questions are on the exam?");
        int questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        int missed = Integer.parseInt(input);

        Exam exam = new Exam(questions, missed);

        String message = "Each question counts " + exam.getPointsEach();
        message += " points.\nThe exam score is " + exam.getScore();
        message += "\nThe exam grade is " + exam.getGrade();
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
