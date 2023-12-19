public class NhanVienFullTime extends NhanVien {
    private double bounty;
    private double fine;
    private double baseWage;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String emloyeeCode, String name, int age, int phoneNumber, String email, double bounty, double fine, double baseWage) {
        super(emloyeeCode, name, age, phoneNumber, email);
        this.bounty = bounty;
        this.fine = fine;
        this.baseWage = baseWage;
    }

    public double getBounty() {
        return bounty;
    }

    public double getFine() {
        return fine;
    }

    public double getBaseWage() {
        return baseWage;
    }

    public void setBounty(double bounty) {
        this.bounty = bounty;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public void setBaseWage(double baseWage) {
        this.baseWage = baseWage;
    }
    public double netWage () {
        return this.baseWage+(this.bounty-this.fine);
    }
}
