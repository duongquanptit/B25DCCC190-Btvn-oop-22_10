
public class Bai4btvn22_10ChayThu {
    public static void main(String[] args) {

        Bai4btvn22_10MatHang banPhim = new Bai4btvn22_10MatHang("SP01", "Bàn phím cơ", 450000, 20);
        Bai4btvn22_10MatHang chuot = new Bai4btvn22_10MatHang("SP02", "Chuột không dây", 200000, 50);
        // - Tai nghe: constructor 2 tham số (mã, tên)
        Bai4btvn22_10MatHang taiNghe = new Bai4btvn22_10MatHang("SP03", "Tai nghe");

        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();

        Bai4btvn22_10HoaDon don1 = new Bai4btvn22_10HoaDon("An", banPhim, 2);   // 2 x 450.000 = 900.000
        Bai4btvn22_10HoaDon don2 = new Bai4btvn22_10HoaDon("Bình", chuot, 5);   // 5 x 200.000, giảm 10% = 900.000
        Bai4btvn22_10HoaDon don3 = new Bai4btvn22_10HoaDon("Chi", taiNghe, 0);  // nhập nhầm 0 -> tự sửa thành 1

        System.out.println();
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-8s%-18s%-4s%12s%n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}
