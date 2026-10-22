public class Bai3btvn22_10ChayThu {
    public static void main(String[] args) {
        Bai3btvn22_10MatHang sp1 = new Bai3btvn22_10MatHang("SP01", "Bàn phím cơ", 450000, 20);
        Bai3btvn22_10MatHang sp2 = new Bai3btvn22_10MatHang("SP02", "Chuột không dây", 200000, 50);

        Bai3btvn22_10MatHang sp3 = new Bai3btvn22_10MatHang("SP03", "Tai nghe");
        sp3.setDonGia(350000);
        sp3.setSoLuongTon(10);

        Bai3btvn22_10HoaDon d1 = new Bai3btvn22_10HoaDon("An", sp1, 2);
        Bai3btvn22_10HoaDon d2 = new Bai3btvn22_10HoaDon("Bình", sp2, 5);
        Bai3btvn22_10HoaDon d3 = new Bai3btvn22_10HoaDon("Chi", sp3, 0);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        sp1.hienThi();
        sp2.hienThi();
        sp3.hienThi();

        System.out.println();
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-8s%-18s%-4s%12s%n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        d1.inDonHang();
        d2.inDonHang();
        d3.inDonHang();
    }
}
