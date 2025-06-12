package org.example;

public final class GradeConverter {

    private static final int MAX_SCORE = 100;
    private static final int A_GRADE_MIN = 90;
    private static final int B_GRADE_MIN = 80;
    private static final int C_GRADE_MIN = 70;
    private static final int D_GRADE_MIN = 60;
    private static final int F_GRADE_MAX = 59;

    /**
     * Chuyển đổi điểm số thành xếp loại chữ.
     *
     * @param score điểm số cần chuyển đổi (0 - 100)
     * @return xếp loại chữ tương ứng
     */
    public static String convert(final int score) {
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

/*public class GradeConverter {
    public String convert(int score)
    {
        if(score <= 100 && score >= 90) {      
            return "A";
        } else if(score <= 89 && score >= 80) {    
            return "B";
        } else if(score <= 79 && score >= 70) {
            return "C";
        } else if(score <= 69 && score >= 60) {
            return "D";
        } else if(score <= 59 && score > 0) {
            return "E";
        } else {
            return "Invalid";
        }
    }


}*/
