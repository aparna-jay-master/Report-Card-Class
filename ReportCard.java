/**
 * {@link ReportCard} represents grades of students at a school.
 * It contains grades for Chemistry, Language Arts, Music, and Calculus.
 * It also records the student's name.
 */

public class ReportCard {

    //Student Name
    private String mName;

    //Chemistry grade
    private String mChemGrade;

    //Language Arts grade
    private String mLangGrade;

    //Music grade
    private String mMusicGrade;

    //Calculus grade
    private String mCalcGrade;

    //Constructor
    public ReportCard (String name, String chemGrade, String langGrade, String musicGrade, String calcGrade) {
        mName = name;
        mChemGrade = chemGrade;
        mLangGrade = langGrade;
        mMusicGrade = musicGrade;
        mCalcGrade = calcGrade;
    }

    /**
     * Sets Student Name
     * For the record, I do not think an app like this should allow setting student name like this
     * but the rubric requires it.
     *
     * @param is the updated grade
     */
    public void setStudentName (String studentName) {
        mName = studentName
    }

    /**
     * Sets Chemistry grade
     *
     * @param is the updated grade
     */
    public void setChemGrade (String newChemGrade) {
        mChemGrade = newChemGrade
    }

    /**
     * Sets Language Arts grade
     *
     * @param is the updated grade
     */
    public void setLangGrade (String newLangGrade) {
        mLangGrade = newLangGrade
    }

    /**
     * Sets Music grade
     *
     * @param is the updated grade
     */
    public void setMusicGrade (String newMusicGrade) {
        mMusicGrade = newMusicGrade
    }

    /**
     * Sets Calculus grade
     *
     * @param is the updated grade
     */
    public void setCalcGrade (String newCalcGrade) {
        mCalcGrade = newCalcGrade
    }

    /**
     * Gets student name
     *
     * @return student's name
     */
    public String getStudentName() {
        return mName;
    }

    /**
     * Gets Chemistry grade
     *
     * @return Chemistry grade
     */
    public String getChemGrade() {
        return mChemGrade;
    }

    /**
     * Gets Language Arts grade
     *
     * @return Chemistry grade
     */
    public String getLangGrade() {
        return mLangGrade;
    }

    /**
     * Gets Music grade
     *
     * @return Music grade
     */
    public String getMusicGrade() {
        return mMusicGrade;
    }

    /**
     * Gets Calculus grade
     *
     * @return Calculus grade
     */
    public String getCalcGrade() {
        return mCalcGrade;
    }

    /**
     * Returns the string representation of the {@link ReportCard} object.
     */
     @Override
      public String toString() {
       return "REPORT CARD " +
            "Name: " + mName + "\;" +
            "Chemistry: " + mChemGrade + "\;" +
            "Language Arts: " + mLangGrade + "\;" +
            "Music: " + mMusicGrade + "\;" +
            "Calculus: " + mCalcGrade;
     }

}
