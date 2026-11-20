package TUAN9;

import java.util.ArrayList;
import java.util.Scanner;

public class tuan9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SACH> dsSach = new ArrayList<SACH>();

        // 1. Nhap danh sach cac loai sach
        System.out.print("Nhap so luong sach can quan ly: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sach thu " + (i + 1) + ":");
            System.out.print("Chon loai sach (1 - Sach giao khoa, 2 - Sach tham khao): ");
            int loai = Integer.parseInt(sc.nextLine());

            SACH s;
            if (loai == 1) {
                s = new SachGiaoKhoa();
            } else {
                s = new SachThamKhao();
            }
            s.Nhap(sc);
            dsSach.add(s);
        }

        // 2. Xuat danh sach cac loai sach
        System.out.println("\n=== DANH SACH CAC LOAI SACH ===");
        for (int i = 0; i < dsSach.size(); i++) {
            dsSach.get(i).Xuat();
        }

        // 3. Tinh tong thanh tien cho tung loai & tinh trung binh cong don gia STK
        double tongTienSGK = 0;
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        int demSTK = 0;

        for (int i = 0; i < dsSach.size(); i++) {
            SACH s = dsSach.get(i);
            if (s instanceof SachGiaoKhoa) {
                tongTienSGK += s.tinhThanhTien();
            } else if (s instanceof SachThamKhao) {
                tongTienSTK += s.tinhThanhTien();
                tongDonGiaSTK += s.getDonGia();
                demSTK++;
            }
        }

        System.out.println("Tong thanh tien Sach giao khoa: " + tongTienSGK);
        System.out.println("Tong thanh tien Sach tham khao: " + tongTienSTK);

        // 4. Xuat trung binh cong don gia cua cac sach tham khao
        if (demSTK > 0) {
            System.out.println("Trung binh cong don gia Sach tham khao: " + (tongDonGiaSTK / demSTK));
        } else {
            System.out.println("Khong co sach tham khao nao trong danh sach.");
        }

        // 5. Xuat ra cac sach giao khoa cua nha xuat ban X
        System.out.print("\nNhap ten nha xuat ban X can tim (Sach giao khoa): ");
        String nxbX = sc.nextLine();

        System.out.println("=== SACH GIAO KHOA CUA NXB " + nxbX + " ===");
        boolean timThay = false;
        for (int i = 0; i < dsSach.size(); i++) {
            SACH s = dsSach.get(i);
            if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(nxbX)) {
                s.Xuat();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach giao khoa nao cua NXB " + nxbX);
        }
    }
}//end class TUAN9