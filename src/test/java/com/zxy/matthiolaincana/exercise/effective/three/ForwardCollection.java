package com.zxy.matthiolaincana.exercise.effective.three;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/22 11:36
 * @Description:
 */
public class ForwardCollection implements Comparable<StudentGrade> {
    private double mathematicsGrade;
    private double languageGrade;
    private double englishGrade;
    private double physicsGrade;
    private double biologyGrad;
    private double chemistryGrade;
    private double historyGrade;

    ForwardCollection(Builder builder) {
        this.biologyGrad = builder.biologyGrad;
        this.chemistryGrade = builder.chemistryGrade;
        this.englishGrade = builder.englishGrade;
        this.historyGrade = builder.historyGrade;
        this.languageGrade = builder.languageGrade;
        this.mathematicsGrade = builder.mathematicsGrade;
        this.physicsGrade = builder.physicsGrade;
    }

    static class Builder {
        private final double mathematicsGrade;
        private final double languageGrade;
        private final double englishGrade;
        private double physicsGrade;
        private double biologyGrad;
        private double chemistryGrade;
        private double historyGrade;

        public Builder(double mathematicsGrade, double languageGrade, double englishGrade) {
            this.mathematicsGrade = mathematicsGrade;
            this.languageGrade = languageGrade;
            this.englishGrade = englishGrade;
        }

        public Builder physicsGrade(double physicsGrade) {
            this.physicsGrade = physicsGrade;
            return this;
        }

        public Builder biologyGrad(double biologyGrad) {
            this.biologyGrad = biologyGrad;
            return this;
        }

        public Builder chemistryGrade(double chemistryGrade) {
            this.chemistryGrade = chemistryGrade;
            return this;
        }

        public Builder historyGrade(double historyGrade) {
            this.historyGrade = historyGrade;
            return this;
        }

        public ForwardCollection builder() {
            return new ForwardCollection(this);
        }
    }


    @Override
    public int compareTo(StudentGrade o) {
        if (this.languageGrade == o.getLanguageGrade()) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        ForwardCollection forwardCollection = new ForwardCollection(
                new Builder(120.5, 100.5, 132)
                        .biologyGrad(94));
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.setLanguageGrade(100.5);
        studentGrade.setEnglishGrade(110);
        studentGrade.setMathematicsGrade(115);

        System.out.println(forwardCollection.compareTo(studentGrade));

    }
}
