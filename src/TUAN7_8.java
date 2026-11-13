import java.util.ArrayList;

class Sach {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

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
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach() {

    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Yeu cau 2: Phuong thuc hien thi thong tin chi tiet cua cuon sach
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Tieu de: " + this.tieuDe);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Nam xuat ban: " + this.namXuatBan);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("-------------------------");
    }
}//end class Sach

// Yeu cau 3: Xay dung lop Test
public class TUAN7_8 {

    public static void main(String[] args) {
        // Yeu cau 3: Tao cac doi tuong tu lop Sach
        Sach s1 = new Sach("S01", "Lap trinh Java", "Nguyen Van A", 2023, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu", "Tran Thi B", 2022, 15);

        Sach s3 = new Sach();
        s3.setMaSach("S03");
        s3.setTieuDe("Co so du lieu");
        s3.setTacGia("Le Van C");
        s3.setNamXuatBan(2024);
        s3.setSoLuong(20);

        // Yeu cau 4: Tao va quan ly danh sach Sach bang ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<Sach>();

        // 1. Them sach vao danh sach
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        // 2. Hien thi toan bo danh sach sach trong thu vien
        System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            danhSachSach.get(i).hienThiThongTin();
        }

        // 3. Cap nhat thong tin sach trong danh sach (vi du: sua so luong cuon sach dau tien)
        danhSachSach.get(0).setSoLuong(25);

        // 4. Xoa mot cuon sach khoi danh sach (vi du: xoa cuon sach thu 2)
        danhSachSach.remove(1);

        // Hien thi lai danh sach sau khi cap nhat va xoa
        System.out.println("=== DANH SACH SACH SAU KHI CAP NHAT ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            danhSachSach.get(i).hienThiThongTin();
        }
    }
}//end class Test