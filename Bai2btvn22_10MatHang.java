public class Bai2btvn22_10MatHang {
    private String ma;
    private String ten;
    private double gia;
    private int ton;

    public Bai2btvn22_10MatHang(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Bai2btvn22_10MatHang(String ma, String ten, double gia, int ton) {
        this.ma = ma;
        this.ten = ten;
        setGia(gia);
        setTon(ton);
    }

    public String getMa() { return ma; }
    public String getTen() { return ten; }
    public double getGia() { return gia; }
    public int getTon() { return ton; }

    public void setGia(double gia) {
        if (gia >= 0) this.gia = gia;
    }

    public void setTon(int ton) {
        if (ton >= 0) this.ton = ton;
    }
}