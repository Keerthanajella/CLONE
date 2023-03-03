package Student_IMP;

public class FeeDetails
{
    private int fee;
    private String date;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public FeeDetails(int fee, String date) {
        this.fee = fee;
        this.date = date;
    }

    public FeeDetails() {
    }
}
