import java.lang.*;
public class Pythagoras {

    public static double pythagoras(double a, double b) {
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] arg) {
        double x = 1.0;
        double y = 1.0;
        double len;
        len = pythagoras(x,y);
        System.out.println("|("+x+","+y+")|="+len);
    }
}
