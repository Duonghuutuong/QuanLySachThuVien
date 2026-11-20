package TUAN9;

import java.util.Scanner;

public class SACH {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public SACH() {

    }

    public SACH(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public SACH(SACH s) {
        this.maSach = s.maSach;
        this.ngayNhap = s.ngayNhap;
        this.donGia = s.donGia;
        this.soLuong = s.soLuong;
        this.nhaXuatBan = s.nhaXuatBan;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("Ngay nhap (ngay/thang/nam): ");
        this.ngayNhap = sc.nextLine();
        System.out.print("Don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.print("So luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nha xuat ban: ");
        this.nhaXuatBan = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Ngay nhap: " + this.ngayNhap);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Nha xuat ban: " + this.nhaXuatBan);
    }
}//end class Sach