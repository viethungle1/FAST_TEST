public class NhanVienPartTime extends NhanVien{
    private double workTime;

    public NhanVienPartTime(double workTime) {
        this.workTime = workTime;
    }

    public NhanVienPartTime(String emloyeeCode, String name, int age, int phoneNumber, String email, double workTime) {
        super(emloyeeCode, name, age, phoneNumber, email);
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }
    public double netWage() {
        return this.workTime*100000;
    }
}
