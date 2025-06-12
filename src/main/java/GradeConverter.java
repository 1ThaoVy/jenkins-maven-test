public class GradeConverter {

    private static final int MAX_SCORE = 100;
    private static final int A_GRADE_MIN = 90;
    private static final int B_GRADE_MIN = 80;
    private static final int C_GRADE_MIN = 70;
    private static final int D_GRADE_MIN = 60;
    private static final int F_GRADE_MAX = 59;

    public String convert(int score) {
        if (score <= MAX_SCORE && score >= A_GRADE_MIN) {
                return "A";
            } else if (score >= B_GRADE_MIN) {
                return "B";
            } else if (score >= C_GRADE_MIN) {
                return "C";
            } else if (score >= D_GRADE_MIN) {
                return "D";
            } else if (score <= F_GRADE_MAX) {
                return "F";
            } else {
                return "Invalid score";
            }
        }
}
