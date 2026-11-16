/**
 * An assessment scored by the number of questions answered correctly.
 */
public class Exam extends Assessment {
    private final double pointsEach;

    /**
     * Creates an exam and computes its score.
     *
     * @param questions total number of questions on the exam
     * @param missed number of questions answered incorrectly
     * @throws IllegalArgumentException if the question counts are invalid
     */
    public Exam(int questions, int missed) {
        if (questions <= 0) {
            throw new IllegalArgumentException("The exam must have at least one question.");
        }
        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException("Missed questions must be between 0 and the total.");
        }

        pointsEach = 100.0 / questions;
        setScore((int) Math.round((questions - missed) * pointsEach));
    }

    /** Returns the number of points assigned to each question. */
    public double getPointsEach() {
        return pointsEach;
    }
}
