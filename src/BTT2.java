
import java.util.Scanner;

public class BTT2 {
    public static void main(String[] args) {
        // Tạo đối tượng để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập họ tên
        System.out.print("Nhap ho va ten cua ban: ");
        String hoTen = sc.nextLine();

        // In họ tên ra màn hình
        System.out.println("Ho va ten cua ban la: " + hoTen);

        // Đóng Scanner
        sc.close();
    }
}
