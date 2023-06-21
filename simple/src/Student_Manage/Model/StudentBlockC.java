package Student_Manage.Model;

public class StudentBlockC extends Student {
    private double literaryScore;
    private double historyScore;
    private double geographyScore;

    public double getLiteraryScore() {
        return literaryScore;
    }

    public void setLiteraryScore(double literaryScore) {
        this.literaryScore = literaryScore;
    }

    public double getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(double historyScore) {
        this.historyScore = historyScore;
    }

    public double getGeographyScore() {
        return geographyScore;
    }

    public void setGeographyScore(double geographyScore) {
        this.geographyScore = geographyScore;
    }

    public StudentBlockC(int candidateNumber, String studentName, String studentAddress, int priority, double literaryScore, double historyScore, double geographyScore) {
        super(candidateNumber, studentName, studentAddress, priority);
        this.literaryScore = literaryScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
    }

    @Override
    public String toString() {
        return "Sinh viên khối C: " + super.toString() +
                " điểm văn: " + literaryScore +
                ", điểm lịch sử: " + historyScore +
                ", điểm địa lý: " + geographyScore;
    }
}
