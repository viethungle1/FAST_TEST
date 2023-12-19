
public class Main {

    public static final int ZERO = 0;

    public static void main(String[] args) {
        NhanVien[] nhanViens = {
                new NhanVienFullTime("1", "FT1", 18, 113, "FT1@gmail.com", 100, 100, 5000000),
                new NhanVienFullTime("2", "FT2", 19, 114, "FT2@gmail.com", 200, 200, 5000000),
                new NhanVienFullTime("3", "FT3", 20, 115, "FT3@gmail.com", 300, 300, 5000000),
                new NhanVienPartTime("1", "PT1", 21, 911, "PT1@gmail.com", 20),
                new NhanVienPartTime("2", "PT2", 22, 999, "PT2@gmail.com", 25),
                new NhanVienPartTime("3", "PT3", 23, 666, "PT3@gmail.com", 30)
        };
        System.out.println("Lương trung bình của nhân viên cả công ty: " + averageWage(totalWagePT(nhanViens),totalWageFT(nhanViens),nhanViens));
        System.out.println("Lương trung bình của nhân viên full time: " + averageWageFT(countEmloyeeFT(nhanViens),totalWageFT(nhanViens)));
        System.out.println("Lương trung bình của nhân viên past time: " + averageWageFT(countEmloyeePT(nhanViens),totalWagePT(nhanViens)));
        System.out.println("Tổng lương phải trả cho nhân viên part time: " + totalWagePT(nhanViens));
        System.out.println("Số nhân viên lương cao hơn lương trung bình: " + higherAverage(averageWage(totalWageFT(nhanViens),totalWagePT(nhanViens),nhanViens),nhanViens));
        System.out.println("Số nhân viên được nhập vào từ bàn phím: "+ countName(nhanViens,"PT1"));
    }

    public static double totalWageFT (NhanVien[] arr) {
        double totalWageFT = ZERO;
        for (NhanVien i : arr) {
            if (i instanceof NhanVienFullTime) {
                NhanVienFullTime nhanVienFullTime = (NhanVienFullTime) i;
                totalWageFT += nhanVienFullTime.netWage();
                }
            }
        return totalWageFT;
    }
    public static double totalWagePT (NhanVien[] arr) {
        double totalWagePT = ZERO;
        for (NhanVien i : arr) {
            if (i instanceof NhanVienPartTime) {
                NhanVienPartTime nhanVienPartTime = (NhanVienPartTime) i;
                totalWagePT += nhanVienPartTime.netWage();
            }
        }
        return totalWagePT;
    }
    public static double averageWage (double pt, double ft, NhanVien[] arr ) {
        return (ft+pt)/arr.length;
    }
    public static int higherAverage (double avgWage, NhanVien[]arr) {
        int count = ZERO;
        for (NhanVien i : arr) {
            if (i instanceof NhanVienFullTime) {
                NhanVienFullTime nhanVienFullTime = (NhanVienFullTime) i;
                if (nhanVienFullTime.netWage()>avgWage) {
                    count++;
                }
            }
            if (i instanceof NhanVienPartTime) {
                NhanVienPartTime nhanVienPartTime = (NhanVienPartTime) i;
                if (nhanVienPartTime.netWage()>avgWage) {
                    count++;
                }
            }
        }
        return count++;
    }
    public static int countEmloyeeFT (NhanVien[] arr) {
        int count= ZERO;
        for (NhanVien i: arr) {
            if (i instanceof NhanVienFullTime) {
                count++;
            }
        }
        return count++;
    }
    public static int countEmloyeePT (NhanVien[] arr) {
        int count= ZERO;
        for (NhanVien i: arr) {
            if (i instanceof NhanVienPartTime) {
                count++;
            }
        }
        return count++;
    }
    public static double averageWageFT (int c , double totalWage) {
        return totalWage/c;
    }
    public static double averageWagePT (int c , double totalWage) {
        return totalWage/c;
    }
    public static int countName (NhanVien[]arr, String name) {
        int count = 0;
        for (NhanVien i : arr) {
            if (i.getName().equals(name)) {
                count++;
            }
        }
        return count++;
    }

}


