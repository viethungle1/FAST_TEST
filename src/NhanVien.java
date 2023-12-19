public class NhanVien {
    private String emloyeeCode;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;
    public NhanVien() {
    }
    public NhanVien(String emloyeeCode, String name, int age, int phoneNumber, String email) {
        this.emloyeeCode = emloyeeCode;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmloyeeCode() {
        return emloyeeCode;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmloyeeCode(String emloyeeCode) {
        this.emloyeeCode = emloyeeCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
