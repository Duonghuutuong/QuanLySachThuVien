import java.util.ArrayList;
import java.util.Scanner;

// Lớp đại diện cho đối tượng Sách
class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double giaTri;

    public Sach(String maSach, String tenSach, int soLuong, double giaTri) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.giaTri = giaTri;
    }

    public void hienThi() {
        System.out.println("Mã sách: " + maSach + " | Tên sách: " + tenSach + " | Số lượng: " + soLuong + " | Giá: " + giaTri);
    }
}

public class TUAN5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo ArrayList thay cho mảng để quản lý dữ liệu linh hoạt hơn
        ArrayList<Sach> danhSach = new ArrayList<>();
        int chon = -1;

        do {
            System.out.println("\n========== MENU THƯ VIỆN  ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Vui lòng chọn chức năng (1-8): ");

            System.out.print("Vui lòng chọn chức năng (1-8): ");

            // Kiểm tra xem dữ liệu người dùng nhập vào có phải là số nguyên không
            if (scanner.hasNextInt()) {
                chon = scanner.nextInt();
                scanner.nextLine(); // Dòng này rất quan trọng: Dùng để dọn dẹp ký tự 'Enter' thừa, chống trôi lệnh
            } else {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                scanner.nextLine(); // Bỏ qua phần dữ liệu bị nhập sai (chữ/ký tự)
                continue; // Quay lại đầu menu
            }

            switch (chon) {
                case 1: // Thêm sách
                    System.out.println("\n--- THÊM SÁCH MỚI ---");
                    System.out.print("Nhập mã sách: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int sl = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập giá trị: ");
                    double gia = Double.parseDouble(scanner.nextLine());

                    // Thêm phần tử mới vào danh sách bằng phương thức add()
                    danhSach.add(new Sach(ma, ten, sl, gia));
                    System.out.println("=> Thêm sách thành công!");
                    break;

                case 2: // Hiển thị sách
                    System.out.println("\n--- DANH SÁCH THƯ VIỆN ---");
                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sách hiện đang trống!");
                    } else {
                        for (Sach s : danhSach) {
                            s.hienThi();
                        }
                    }
                    break;

                case 3: // Tìm sách theo mã
                    System.out.print("\nNhập mã sách cần tìm: ");
                    String maTim = scanner.nextLine();
                    boolean timThay = false;
                    for (Sach s : danhSach) {
                        if (s.maSach.equalsIgnoreCase(maTim)) {
                            System.out.println("=> Đã tìm thấy:");
                            s.hienThi();
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("=> Không tìm thấy sách có mã: " + maTim);
                    }
                    break;

                case 4: // Xóa sách
                    System.out.print("\nNhập mã sách cần xóa: ");
                    String maXoa = scanner.nextLine();
                    boolean daXoa = false;

                    // Duyệt ArrayList bằng chỉ số (index) để sử dụng phương thức remove(index)
                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).maSach.equalsIgnoreCase(maXoa)) {
                            danhSach.remove(i);
                            System.out.println("=> Đã xóa sách thành công!");
                            daXoa = true;
                            break;
                        }
                    }
                    if (!daXoa) {
                        System.out.println("=> Không tìm thấy sách để xóa.");
                    }
                    break;

                case 5: // Sửa thông tin sách
                    System.out.print("\nNhập mã sách cần sửa: ");
                    String maSua = scanner.nextLine();
                    boolean daSua = false;
                    for (Sach s : danhSach) {
                        if (s.maSach.equalsIgnoreCase(maSua)) {
                            System.out.println("Nhập thông tin mới:");
                            System.out.print("Tên sách mới: ");
                            s.tenSach = scanner.nextLine();
                            System.out.print("Số lượng mới: ");
                            s.soLuong = Integer.parseInt(scanner.nextLine());
                            System.out.print("Giá trị mới: ");
                            s.giaTri = Double.parseDouble(scanner.nextLine());

                            System.out.println("=> Đã cập nhật thông tin sách thành công!");
                            daSua = true;
                            break;
                        }
                    }
                    if (!daSua) {
                        System.out.println("=> Không tìm thấy sách có mã: " + maSua);
                    }
                    break;

                case 6: // Tính tổng số lượng
                    int tongSL = 0;
                    for (Sach s : danhSach) {
                        tongSL += s.soLuong;
                    }
                    System.out.println("\n=> Tổng số lượng sách trong thư viện: " + tongSL);
                    break;

                case 7: // Tính tổng giá trị
                    double tongGia = 0;
                    for (Sach s : danhSach) {
                        tongGia += (s.soLuong * s.giaTri);
                    }
                    System.out.println("\n=> Tổng giá trị sách trong thư viện: " + tongGia);
                    break;

                case 8: // Thoát
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập số từ 1 đến 8!");
                    break;
            }
        } while (chon != 8);

        scanner.close();
    }
}