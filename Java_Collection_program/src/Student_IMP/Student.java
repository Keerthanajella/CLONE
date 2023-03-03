package Student_IMP;

import java.util.List;

public class Student
{
    private int rollNo;
    private String name;
    private String branch;
    private String year;
    private FeeDetails feeDetails;
    private List<Subject> subject;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public FeeDetails getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public Student(int rollNo, String name, String branch, String year,FeeDetails feeDetails,List<Subject> subject)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.feeDetails=feeDetails;
        this.subject=subject;
    }

    public Student()
    {
    }


}
