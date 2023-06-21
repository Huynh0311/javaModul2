package Student_Manage.Model;

public class StudentBlockA extends Student {
    private double mathScores;
    private double physicsScores;
    private double chemistryScores;


    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getPhysicsScores() {
        return physicsScores;
    }

    public void setPhysicsScores(double physicsScores) {
        this.physicsScores = physicsScores;
    }

    public double getChemistryScores() {
        return chemistryScores;
    }

    public void setChemistryScores(double chemistryScores) {
        this.chemistryScores = chemistryScores;
    }

    public StudentBlockA(int candidateNumber, String studentName, String studentAddress, int priority, double mathScores, double physicsScores, double chemistryScores) {
        super(candidateNumber, studentName, studentAddress, priority);
        this.mathScores = mathScores;
        this.physicsScores = physicsScores;
        this.chemistryScores = chemistryScores;
    }

    @Override
    public String toString() {
        return  "Sinh viên khối A: " + super.toString() +
                " điểm toán: " + mathScores +
                ", điểm vật lý: " + physicsScores +
                ", điểm hóa: " + chemistryScores + " ";
    }
}
