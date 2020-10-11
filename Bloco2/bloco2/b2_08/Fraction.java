public class Fraction {

    public int num;
    public int den;

    public Fraction(int num, int den){
        assert den != 0 : "O denominador não pode ser 0;";
        this.num = num;
        this.den = den;
    }

    public Fraction(int num){
        this(num,1);
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void reduce() {
        int gcd = gcd(num,den);
        num = num / gcd;
        den = den / gcd;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        String s = "";
        if(den == 1) s += this.num;
        else if(num == 0) s += 0;
        else s += this.num + "/" + this.den;
        return s;
    }
}
