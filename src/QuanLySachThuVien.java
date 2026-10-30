import java.util.Scanner;

public class QuanLySachThuVien {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // BÀI 1: Nhập thông tin sách và hiển thị lại
        // ==========================================
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");

        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // Hiển thị lại thông tin vừa nhập
        System.out.println("\n=== THÔNG TIN SÁCH VỪA NHẬP ===");
        System.out.printf("Mã sách      : %s\n", maSach);
        System.out.printf("Tên sách     : %s\n", tenSach);
        System.out.printf("Tác giả      : %s\n", tacGia);
        System.out.printf("Năm xuất bản : %d\n", namXuatBan);
        System.out.printf("Đơn giá      : %,.0f VNĐ\n", donGia);
        System.out.printf("Số lượng     : %d cuốn\n", soLuong);

        // ==========================================
        // BÀI 2, 3, 4: Tính toán giá trị nhập kho
        // ==========================================

        // Bài 2: Tính thành tiền = đơn giá * số lượng
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách (5% của thành tiền)
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả tính toán
        System.out.println("\n=== CHI TIẾT GIÁ TRỊ NHẬP KHO ===");
        System.out.printf("Thành tiền (Bài 2)     : %,.2f VNĐ\n", thanhTien);
        System.out.printf("Phí vận chuyển (Bài 3) : %,.2f VNĐ\n", phiVanChuyen);
        System.out.printf("Tổng tiền nhập (Bài 4) : %,.2f VNĐ\n", tongTienNhap);

        // Đóng Scanner
        sc.close();
    }
}