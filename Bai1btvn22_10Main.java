public class Bai1btvn22_10Main {
    public static void main(String[] args) {

        Bai1btvn22_10SanPham chuot = new Bai1btvn22_10SanPham("SP01", "Chuột không dây", 150000, 50);
        Bai1btvn22_10SanPham banPhim = new Bai1btvn22_10SanPham("SP02", "Bàn phím cơ", 500000, 20);
        Bai1btvn22_10SanPham tai = new Bai1btvn22_10SanPham("SP03", "Tai nghe Bluetooth", 30);

        chuot.inThongTin();
        banPhim.inThongTin();
        tai.inThongTin();


        tai.setDonGia(350000);
        System.out.println("\nSau khi cập nhật giá:");
        tai.inThongTin();


        Bai1btvn22_10DonHang dh1 = new Bai1btvn22_10DonHang("Duong Khac Quan", chuot, 2);
        Bai1btvn22_10DonHang dh2 = new Bai1btvn22_10DonHang("Duong Quan Khac", banPhim, 5);
        Bai1btvn22_10DonHang dh3 = new Bai1btvn22_10DonHang("Quan Quan Quan", tai, 0);

        System.out.println();
        dh1.inThongTin();
        System.out.println();
        dh2.inThongTin();
        System.out.println();
        dh3.inThongTin();
    }
}