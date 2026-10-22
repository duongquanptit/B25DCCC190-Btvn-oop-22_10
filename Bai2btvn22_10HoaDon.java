public class Bai2btvn22_10HoaDon {
    private String khach;
    private Bai2btvn22_10MatHang sanPham;
    private int soLuong;

    public Bai2btvn22_10HoaDon(String khach, Bai2btvn22_10MatHang sanPham, int soLuong) {
        this.khach = khach;
        this.sanPham = sanPham;
        setSoLuong(soLuong);
    }

    public String getKhach() { return khach; }
    public Bai2btvn22_10MatHang getSanPham() { return sanPham; }
    public int getSoLuong() { return soLuong; }

    public void setSoLuong(int soLuong) {
        this.soLuong = (soLuong > 0) ? soLuong : 1;
    }

    public boolean duocGiam() {
        return soLuong >= 5;
    }

    public double thanhTien() {
        double tong = sanPham.getGia() * soLuong;
        return duocGiam() ? tong * 0.9 : tong;
    }
}