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
        Sach[] danhSach = null; // Mảng lưu trữ n cuốn sách
        int chon = -1;

        //Menu lặp đến khi chọn Thoát (sử dụng do-while)
        do {
            System.out.println("\n========== MENU THƯ VIỆN ==========");
            System.out.println("1. Nhập n sách bằng vòng lặp (Bài 1)");
            System.out.println("2. Tính tổng số lượng và tổng giá trị (Bài 2)");
            System.out.println("3. Tìm sách theo mã (Bài 4)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Vui lòng chọn chức năng (0-3): ");

            // Xử lý nhập số để tránh trôi lệnh khi dùng nextLine() sau đó
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    //Nhập n sách bằng vòng lặp
                    System.out.print("Nhập số lượng sách cần thêm (n): ");
                    int n = Integer.parseInt(scanner.nextLine());
                    danhSach = new Sach[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhập thông tin sách thứ " + (i + 1) + ":");
                        System.out.print("Nhập mã sách: ");
                        String ma = scanner.nextLine();
                        System.out.print("Nhập tên sách: ");
                        String ten = scanner.nextLine();
                        System.out.print("Nhập số lượng: ");
                        int sl = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập giá trị: ");
                        double gia = Double.parseDouble(scanner.nextLine());

                        danhSach[i] = new Sach(ma, ten, sl, gia);
                    }
                    System.out.println("=> Đã nhập xong dữ liệu sách!");
                    break;

                case 2:
                    //Tính tổng số lượng và tổng giá trị sách
                    if (danhSach == null || danhSach.length == 0) {
                        System.out.println("Danh sách trống. Vui lòng chọn chức năng 1 để nhập dữ liệu trước.");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTri = 0;

                        // Sử dụng vòng lặp để duyệt mảng và tính tổng
                        for (int i = 0; i < danhSach.length; i++) {
                            tongSoLuong += danhSach[i].soLuong;
                            tongGiaTri += (danhSach[i].soLuong * danhSach[i].giaTri);
                        }

                        System.out.println("\n--- KẾT QUẢ THỐNG KÊ ---");
                        System.out.println("Tổng số lượng sách: " + tongSoLuong + " cuốn");
                        System.out.println("Tổng giá trị thư viện sách: " + tongGiaTri);
                    }
                    break;

                case 3:
                    // Tìm sách theo mã
                    if (danhSach == null || danhSach.length == 0) {
                        System.out.println("Danh sách trống. Vui lòng chọn chức năng 1 để nhập dữ liệu trước.");
                    } else {
                        System.out.print("Nhập mã sách cần tìm: ");
                        String maTimKiem = scanner.nextLine();
                        boolean timThay = false;

                        // Vòng lặp tìm kiếm
                        for (int i = 0; i < danhSach.length; i++) {
                            if (danhSach[i].maSach.equalsIgnoreCase(maTimKiem)) {
                                System.out.println("=> Đã tìm thấy sách:");
                                danhSach[i].hienThi();
                                timThay = true;
                                break; // Dừng vòng lặp khi đã tìm thấy
                            }
                        }

                        if (!timThay) {
                            System.out.println("=> Không tìm thấy sách nào có mã: " + maTimKiem);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại (0-3).");
                    break;
            }
        } while (chon != 0); // Vòng lặp dừng khi người dùng nhập số 0

        scanner.close();
    }
}