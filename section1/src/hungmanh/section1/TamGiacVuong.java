package hungmanh.section1;

import static java.lang.Math.sqrt;

public class TamGiacVuong {
    public static double chuVi(double canh1, double canh2){
        return  (canh1+canh2+sqrt(canh1*canh1+canh2*canh2));
    }
    public static double dienTich(double canh1, double canh2){
        return canh1*canh2/2;
    }
}
