/**
 * Stores a numeric assessment score and converts it to a letter grade.
 */
public class Assessment {
    private int score;

    /** Sets the numeric score. */
    public void setScore(int score) {
        this.score = score;
    }

    /** Returns the numeric score. */
    public int getScore() {
        return score;
    }

    /** Returns the letter grade for this score. */
    public char getGrade() {
        switch (score / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }
}
