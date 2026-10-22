
public class Bai4btvn22_10HoaDon {
    private String tenKhach;
    private Bai4btvn22_10MatHang sanPham;
    private int soLuong;

    public Bai4btvn22_10HoaDon(String tenKhach, Bai4btvn22_10MatHang sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        this.soLuong = (soLuong < 1) ? 1 : soLuong; // số lượng < 1 thì gán 1
    }

    public String getTenKhach() { return tenKhach; }
    public void setTenKhach(String tenKhach) { this.tenKhach = tenKhach; }

    public Bai4btvn22_10MatHang getSanPham() { return sanPham; }
    public void setSanPham(Bai4btvn22_10MatHang sanPham) { this.sanPham = sanPham; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) {
        this.soLuong = (soLuong < 1) ? 1 : soLuong;
    }

    public double tinhThanhTien() {
        double tong = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) tong *= 0.9;
        return tong;
    }

    public void inDonHang() {
        System.out.printf("%-8s%-18s%-4d%12s%n",
                tenKhach, sanPham.getTenSP(), soLuong,
                Bai4btvn22_10MatHang.dinhDangTien(tinhThanhTien()));
        if (soLuong >= 5) {
            System.out.printf("%-8s(đã giảm 10%%)%n", "");
        }
    }
}