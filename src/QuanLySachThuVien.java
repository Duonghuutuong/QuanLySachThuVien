import java.util.Scanner;
import java.time.Year;
public class QuanLySachThuVien {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu
        Scanner sc = new Scanner(System.in);


        // BÀI 1: Nhập thông tin sách và hiển thị lại

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

        // Bổ sung nhập loại sách cho Bài 4
        System.out.println("\nChọn loại sách:");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Nhập lựa chọn của bạn (1-4): ");
        int loaiSach = sc.nextInt();


        System.out.println("   KẾT QUẢ KIỂM TRA & PHÂN LOẠI    ");



        // BÀI 1: Kiểm tra tính hợp lệ của dữ liệu

        int namHienTai = Year.now().getValue(); // Lấy năm hiện tại
        boolean isGiaHopLe = donGia > 0;
        boolean isSoLuongHopLe = soLuong >= 0;
        boolean isNamXBHopLe = namXuatBan > 0 && namXuatBan <= namHienTai;

        System.out.print("- Tình trạng hợp lệ: ");
        if (isGiaHopLe && isSoLuongHopLe && isNamXBHopLe) {
            System.out.println("Thông tin sách HỢP LỆ.");
        } else {
            System.out.println("KHÔNG HỢP LỆ (Sai giá, số lượng hoặc năm xuất bản).");
        }

        // BÀI 2: Phân loại sách theo giá

        System.out.print("- Phân loại giá: ");
        if (donGia < 50000) {
            System.out.println("Sách giá thấp");
        } else if (donGia <= 100000) {
            System.out.println("Sách giá trung bình");
        } else if (donGia <= 200000) {
            System.out.println("Sách giá cao");
        } else {
            System.out.println("Sách giá đặc biệt");
        }


        // BÀI 3: Phân loại tình trạng tồn kho

        System.out.print("- Tình trạng tồn kho: ");
        if (soLuong == 0) {
            System.out.println("Hết sách");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("Sắp hết");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("Còn ít");
        } else if (soLuong > 20) {
            System.out.println("Còn nhiều");
        } else {
            System.out.println("Số lượng âm (Không hợp lệ)");
        }


        // BÀI 4: Chọn loại sách bằng câu lệnh switch

        System.out.print("- Thể loại: ");
        switch (loaiSach) {
            case 1:
                System.out.println("Sách giáo khoa");
                break;
            case 2:
                System.out.println("Sách tham khảo");
                break;
            case 3:
                System.out.println("Sách chuyên ngành");
                break;
            case 4:
                System.out.println("Sách khác");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ (Vui lòng chọn 1-4)");
                break;
        }

        sc.close();
    }
}