package TUAN9;

import java.util.Scanner;

public class SachThamKhao extends SACH {
    private double thue;

    public double getThue() {
        return thue;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public SachThamKhao(SachThamKhao stk) {
        super(stk);
        this.thue = stk.thue;
    }

    @Override
    public double tinhThanhTien() {
        return this.soLuong * this.donGia + this.thue;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Thue: ");
        this.thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void Xuat() {
        System.out.println("[Sach Tham Khao]");
        super.Xuat();
        System.out.println("Thue: " + this.thue);
        System.out.println("Thanh tien: " + this.tinhThanhTien());
        System.out.println("-------------------------");
    }
}//end class SachThamKhao