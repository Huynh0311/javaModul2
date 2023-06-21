package Student_Manage.Model;

public class StudentBlockB extends Student {
    private double mathScores;
    private double chemistryScores;
    private double biologyScore;

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getChemistryScores() {
        return chemistryScores;
    }

    public void setChemistryScores(double chemistryScores) {
        this.chemistryScores = chemistryScores;
    }

    public double getBiologyScore() {
        return biologyScore;
    }

    public void setBiologyScore(double biologyScore) {
        this.biologyScore = biologyScore;
    }

    public StudentBlockB(int candidateNumber, String studentName, String studentAddress, int priority, double mathScores, double chemistryScores, double biologyScore) {
        super(candidateNumber, studentName, studentAddress, priority);
        this.mathScores = mathScores;
        this.chemistryScores = chemistryScores;
        this.biologyScore = biologyScore;
    }

    @Override
    public String toString() {
        return "Sinh viên khối B: "+ super.toString() +
                " điểm toán: " + mathScores +
                ", điểm hóa: " + chemistryScores +
                ", điểm sinh: " + biologyScore;
    }
}
