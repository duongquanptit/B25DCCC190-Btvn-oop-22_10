import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class Bai3btvn22_10MatHang {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;


    public Bai3btvn22_10MatHang() {
    }


    public Bai3btvn22_10MatHang(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public Bai3btvn22_10MatHang(String maSP, String tenSP, double donGia, int soLuongTon) {
        this(maSP, tenSP);
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }


    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }

    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) {
        if (donGia >= 0) this.donGia = donGia;
    }

    public int getSoLuongTon() { return soLuongTon; }
    public void setSoLuongTon(int soLuongTon) {
        if (soLuongTon >= 0) this.soLuongTon = soLuongTon;
    }

    public static String dinhDangTien(double v) {
        DecimalFormat f = new DecimalFormat("#,###",
                DecimalFormatSymbols.getInstance(Locale.GERMANY));
        return f.format(v);
    }

    public void hienThi() {
        System.out.printf("%-6s%-18s%10s  tồn %d%n",
                maSP, tenSP, dinhDangTien(donGia), soLuongTon);
    }
}