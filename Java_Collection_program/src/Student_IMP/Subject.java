package Student_IMP;

import java.util.List;

public class Subject
{
    private String subjectCode;
    private String subjectName;
    private int marks;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Subject(String subjectCode, String subjectName, int marks) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public Subject() {
    }
}
