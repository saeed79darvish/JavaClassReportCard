package com.example.saeed.javaclassreportcard;


public class ReportCard {

    public static final int TOTAL = 5;


    private String name;
    private int idNumber;
    private int mathGrad;
    private int englishGrad;
    private int historyGrade;
    private int chemistryGrade;
    private int biologyGrade;
    private int sum;
    private int percentage;

    public ReportCard (int biologyGrade,
                     int chemistryMarks,
                     int mathGrad,
                     int historyGrade,
                     int englishGrad,
                     String name,
                     int idNumber) {
        this.biologyGrade = biologyGrade;
        this.chemistryGrade = chemistryGrade;
        this.historyGrade = historyGrade;
        this.mathGrad = mathGrad;
        this.englishGrad = englishGrad;
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getMathGrad() {
        return mathGrad;
    }

    public void setMathGrad(int mathGrad) {
        this.mathGrad = mathGrad;
    }

    public int getEnglishGrad() {
        return englishGrad;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishGrad = englishMarks;
    }

    public int gethistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }


    private String getGrade(int eng,
                            int mth,
                            int his,
                            int chem,
                            int bio) {
        String grade;
        sum = eng + mth + his + chem + bio;
        percentage = sum / TOTAL;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage < 90 && percentage >= 80) {
            grade = "B";
        } else if (percentage < 80 && percentage >= 70) {
            grade = "C";
        } else if (percentage < 70 && percentage >= 60) {
            grade = "D";
        } else if (percentage < 60) {
            grade = "C";
        } else {
            grade = "error";
        }
        return grade;
    }

    public String displayResult() {
        return
                "Name : " + name + '\n' +
                        "Id Number: " + idNumber + '\n' + '\n' +
                        "English : " + englishGrad + '\n' +
                        "Math    : " + mathGrad + '\n' +
                        "History : " + historyGrade + '\n' +
                        "Chemistry : " + chemistryGrade + '\n' +
                        "Biology : " + biologyGrade + '\n' + '\n' +
                        "Grade: " + getGrade(englishGrad, mathGrad, historyGrade, chemistryGrade, biologyGrade);
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", englishGrad=" + englishGrad +
                ",mathGrad =" + mathGrad +
                ", historyGrade=" + historyGrade +
                ", chemistryMarks=" + chemistryGrade +
                ", biologyGrade=" + biologyGrade +
                ", grade='" + getGrade(englishGrad, mathGrad, historyGrade, chemistryGrade, biologyGrade) + '\'' +
                '}';
    }


}
