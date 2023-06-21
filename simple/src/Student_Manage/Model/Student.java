package Student_Manage.Model;

public class Student {
    private int CandidateNumber;
    private String studentName;
    private String studentAddress;
    private int priority;

    public int getCandidateNumber() {
        return CandidateNumber;
    }

    public void setCandidateNumber(int candidateNumber) {
        CandidateNumber = candidateNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int candidateNumber, String studentName, String studentAddress, int priority) {
        this.CandidateNumber = candidateNumber;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return  " Số báo danh: " + CandidateNumber +
                ", tên thí sinh: " + studentName + '\'' +
                ", địa chỉ: " + studentAddress + '\'' +
                ", mức ưu tiên " + priority +  ' ';
    }
}
