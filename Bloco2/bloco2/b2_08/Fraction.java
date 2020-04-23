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

    @Override
    public String toString() {
        return num + "/" + den;
    }
}
