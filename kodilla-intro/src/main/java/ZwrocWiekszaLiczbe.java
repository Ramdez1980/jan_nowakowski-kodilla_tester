public class ZwrocWiekszaLiczbe {

    public static void main(String[] args) {
        int x = ktoraWieksza(100, 50, 150);
        int y = ktoraWieksza(-5, -20, -40 );
        System.out.println("x wynosi " + x); // wypisze 200
        System.out.println("y wynosi " + y); // wypisze -5
    }
    public static int ktoraWieksza(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (a>b && c>b) {
            return c;
        }  else {
            return b;
        }
    }
}
