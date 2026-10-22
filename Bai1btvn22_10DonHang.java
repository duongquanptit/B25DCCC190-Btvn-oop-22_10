public class Bai1btvn22_10DonHang {
    private String tenKhach;
    private Bai1btvn22_10SanPham sanPham;
    private int soLuongMua;

    public Bai1btvn22_10DonHang(String tenKhach, Bai1btvn22_10SanPham sanPham, int soLuongMua) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        setSoLuongMua(soLuongMua);
    }
    public int getSoLuongMua() { return soLuongMua; }
    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = (soLuongMua < 1) ? 1 : soLuongMua;
    }

    // Thành tiền = đơn giá x số lượng; từ 5 cái trở lên giảm 10%
    public double tinhThanhTien() {
        double tong = sanPham.getDonGia() * soLuongMua;
        if (soLuongMua >= 5) {
            tong *= 0.9;
        }
        return tong;
    }
    public void inThongTin() {
        System.out.println("==== ĐƠN HÀNG =====");
        System.out.println("Khách hàng : " + tenKhach);
        System.out.println("Sản phẩm   : " + sanPham.getTen() + " (" + sanPham.getMa() + ")");
        System.out.println("Số lượng   : " + soLuongMua);
        if (sanPham.daCoGia()) {
            System.out.println("Thành tiền : " + String.format("%,.0f đ", tinhThanhTien())
                    + (soLuongMua >= 5 ? " (đã giảm 10%)" : ""));
        } else {
            System.out.println("Thành tiền : Chưa tính được (sản phẩm chưa có giá)");
        }
    }
}