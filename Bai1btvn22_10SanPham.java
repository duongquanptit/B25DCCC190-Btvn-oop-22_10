public class Bai1btvn22_10SanPham {
    private String ma;
    private String ten;
    private double donGia;
    private int soLuongTon;

    public Bai1btvn22_10SanPham(String ma, String ten, double donGia, int soLuongTon) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }
    public Bai1btvn22_10SanPham(String ma, String ten, int soLuongTon) {
        this(ma, ten, 0, soLuongTon);
    }

    public String getMa() { return ma; }
    public String getTen() { return ten; }
    public double getDonGia() { return donGia; }
    public int getSoLuongTon() { return soLuongTon; }

    public void setDonGia(double donGia) { this.donGia = donGia; }

    public boolean daCoGia() { return donGia > 0; }

    public void inThongTin() {
        System.out.println("Mã: " + ma
                + " | Tên: " + ten
                + " | Đơn giá: " + (daCoGia() ? String.format("%,.0f đ", donGia) : "Chưa có giá")
                + " | Tồn: " + soLuongTon);
    }
}