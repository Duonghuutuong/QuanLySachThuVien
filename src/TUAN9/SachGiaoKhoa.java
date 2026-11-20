package TUAN9;

import java.util.Scanner;

    public class SachGiaoKhoa extends SACH {
    private String tinhTrang; // "moi" hoac "cu"

    public String getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(SachGiaoKhoa sgk) {
        super(sgk);
        this.tinhTrang = sgk.tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (this.tinhTrang.equalsIgnoreCase("moi") || this.tinhTrang.equalsIgnoreCase("mới")) {
            return this.soLuong * this.donGia;
        } else {
            return this.soLuong * this.donGia * 0.5;
        }
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Tinh trang (moi/cu): ");
        this.tinhTrang = sc.nextLine();
    }

    @Override
    public void Xuat() {
        System.out.println("[Sach Giao Khoa]");
        super.Xuat();
        System.out.println("Tinh trang: " + this.tinhTrang);
        System.out.println("Thanh tien: " + this.tinhThanhTien());
        System.out.println("-------------------------");
    }
}//end class SachGiaoKhoa