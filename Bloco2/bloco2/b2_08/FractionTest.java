public class FractionTest {

    public static void main(String[] args) {

        Fraction f1 = new Fraction(4,2);
        System.out.println(f1);
        f1.reduce();
        System.out.println(f1);
    }
}
