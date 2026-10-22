import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Bai2btvn22_10ChayThu {
    static final DecimalFormat FMT =
            new DecimalFormat("#,###", DecimalFormatSymbols.getInstance(Locale.GERMANY));

    static String tien(double v) { return FMT.format(v); }

    public static void main(String[] args) {
        Bai2btvn22_10MatHang sp1 = new Bai2btvn22_10MatHang("SP01", "Bàn phím cơ", 450000, 20);
        Bai2btvn22_10MatHang sp2 = new Bai2btvn22_10MatHang("SP02", "Chuột không dây", 200000, 50);

        Bai2btvn22_10MatHang sp3 = new Bai2btvn22_10MatHang("SP03", "Tai nghe");
        sp3.setGia(350000);
        sp3.setTon(10);

        List<Bai2btvn22_10HoaDon> dsDon = new ArrayList<>();
        dsDon.add(new Bai2btvn22_10HoaDon("An", sp1, 2));
        dsDon.add(new Bai2btvn22_10HoaDon("Bình", sp2, 5));
        dsDon.add(new Bai2btvn22_10HoaDon("Chi", sp3, 0));

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        for (Bai2btvn22_10MatHang sp : new Bai2btvn22_10MatHang[]{sp1, sp2, sp3}) {
            System.out.printf("%-6s%-18s%10s  tồn %d%n",
                    sp.getMa(), sp.getTen(), tien(sp.getGia()), sp.getTon());
        }

        System.out.println();
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-8s%-18s%-4s%12s%n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        for (Bai2btvn22_10HoaDon d : dsDon) {
            System.out.printf("%-8s%-18s%-4d%12s%n",
                    d.getKhach(), d.getSanPham().getTen(), d.getSoLuong(), tien(d.thanhTien()));
            if (d.duocGiam()) System.out.printf("%-8s(đã giảm 10%%)%n", "");
        }
    }
}