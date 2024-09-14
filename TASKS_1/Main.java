public class Main {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(fitCalc(15, 1));
        System.out.println(containers(3, 4, 2));
        System.out.println(triangleType(5, 5, 5));
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(factorial(3));
        System.out.println(gcd(48, 18));
        System.out.println(ticketSaler(70, 1500));
        System.out.println(tables(5, 2));
    }

    // Это первый таск
    public static double convert(int n) {
        return n * 3.785;
    }

    // А это второй таск
    public static int fitCalc(int m, int i) {
        return m * i;
    }

    // А это третий таск
    public static int containers(int k, int m, int b) {
        return k * 20 + m * 50 + b * 100;
    }

    // А это четвертый таск
    public static String triangleType(int x, int y, int z) {
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && x == z) {
                return "equilateral";
            } else if (x == y || x == z || y == z) {
                return "isosceles";
            } else {
                return "different-sided";
            }
        } else {
            return "not a triangle";
        }
    }

    // Ну а это пятый таск
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }

    // Это шестой
    public static int howManyItems(double n, double w, double h) {
        double total = n * 2;
        double size = w * h;

        return (int) (total / size) / 4;
    }

    // ЭТО СЕДЬМОЙ
    public static int factorial(int n) {

        return n == 0 || n == 1 ? 1 : n * factorial(n - 1);
    }

    // Восьмой
    public static int gcd(int a, int b) {
        while (b != 0) {
            int n = b;
            b = a % b;
            a = n;
        }
        return a;
    }

    // Девятый
    public static int ticketSaler(int q, int p) {
        double commission = 0.28;
        double totalPrice = p * (1 - commission);

        return (int) (q * totalPrice);
    }

    // Десятый
    public static int tables(int s, int t) {
        int required = (s + 1) / 2;

        return (required > t) ? required - t : 0;
    }

}
