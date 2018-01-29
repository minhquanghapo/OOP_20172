class SinhVien {

    private String hoTen;
    private int namSinh;
    private float diemTb;
    private String lop;

    public SinhVien() {
                System.out.println("Lớp: " );
    }

    public SinhVien(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = "At7a";
        System.out.println("Họ tên: " + this.hoTen + " Năm sinh: " + this.namSinh);
        System.out.println("Lớp: " + this.lop);
    }

    //Overloading constructor method
    public SinhVien(String hoTen, int namSinh, float diemTb) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTb = diemTb;
        this.lop = "At7a";
        System.out.println("Họ tên: " + this.hoTen + " Năm sinh: " + this.namSinh + " Điểm Trung Bình: " + this.diemTb);
        System.out.println("Lớp: " + this.lop);
    }
}

public class JavaAndroidVn {

    public static void main(String[] args) {
            SinhVien Quang = new SinhVien();
/*        SinhVien a = new SinhVien("Vũ Văn T", 1992);
*/        SinhVien b = new SinhVien("Trần Thu P", 1996, 9.0f);
    }
}