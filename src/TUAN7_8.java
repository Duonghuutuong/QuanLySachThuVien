import java.util.ArrayList;

class Sach {
    // Yeu cau 1 (Tuan 8): Tat ca thuoc tinh khai bao private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Yeu cau 2 & 3 (Tuan 8): Public Getters va Setters co kiem tra dieu kien
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = 2026;
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Loi: Nam xuat ban khong hop le!");
        }
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Loi: So luong khong duoc am!");
        }
    }

    // Constructor mac dinh
    public Sach() {

    }

    // Yeu cau 4 (Tuan 8): Constructor co tham so day du
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.setNamXuatBan(namXuatBan);
        this.setSoLuong(soLuong);
    }

    // Constructor sao chep
    public Sach(Sach s) {
        this.maSach = s.maSach;
        this.tieuDe = s.tieuDe;
        this.tacGia = s.tacGia;
        this.namXuatBan = s.namXuatBan;
        this.soLuong = s.soLuong;
    }

    // Yeu cau 2 (Tuan 7): Phuong thuc hien thi thong tin chi tiet
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Tieu de: " + this.tieuDe);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Nam xuat ban: " + this.namXuatBan);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("-------------------------");
    }
}//end class Sach

public class TUAN7_8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Khoi tao doi tuong bang Constructor co tham so
        Sach s1 = new Sach("S01", "Lap trinh Java", "Nguyen Van A", 2024, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu", "Tran Thi B", 2023, 15);

        // Khoi tao bang Constructor sao chep
        Sach s3 = new Sach(s2);
        s3.setMaSach("S03");

        // Khoi tao bang Constructor mac dinh va dung Setter (kiem thu tinh dong goi Tuan 8)
        Sach s4 = new Sach();
        s4.setMaSach("S04");
        s4.setTieuDe("Co so du lieu");
        s4.setTacGia("Le Van C");
        s4.setNamXuatBan(2025); // Hop le
        s4.setSoLuong(20);      // Hop le

        // Thu truyen gia tri sai de kiem tra rang buoc o Yeu cau 3 (Tuan 8)
        s4.setNamXuatBan(2030); // Se bao loi vi lon hon nam hien tai
        s4.setSoLuong(-5);      // Se bao loi vi so luong am

        // Quan ly danh sach Sach bang ArrayList (Yeu cau 4 - Tuan 7)
        ArrayList<Sach> dsSach = new ArrayList<Sach>();
        dsSach.add(s1);
        dsSach.add(s2);
        dsSach.add(s3);
        dsSach.add(s4);

        System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
        for (int i = 0; i < dsSach.size(); i++) {
            dsSach.get(i).hienThiThongTin();
        }
    }
}//end class TUAN7_8