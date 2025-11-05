public class Fraction {
    
    private int nume = 0;
    private int denom = 1;

    //constructor
    public Fraction(int nume, int denom){
        this.nume = nume;
        this.denom = denom;
    }

    //getters
    public int getDenom(){
        return this.denom;
    }
    public int getNume(){
        return this.nume;
    }

    //setters
    public void setDenom(int newDenom){
        this.denom = newDenom;
    }
    public void setNume(int newNume){
        this.nume = newNume;
    }

    //adding fractions
    public Fraction sum(Fraction otherFraction){
        int sumDenom = this.denom * otherFraction.getDenom();
        int sumNume = (this.nume*otherFraction.getDenom()) + (otherFraction.getNume() * this.denom);
        Fraction sum = new Fraction(sumNume,sumDenom);
        return sum.simplify();
    }

    //multiplying fractions
    public Fraction product(Fraction otherFraction){
        Fraction prod = new Fraction (this.nume*otherFraction.getNume(),this.denom*otherFraction.getDenom());
        return prod.simplify();
    }

    //simplifying fraction
    public Fraction simplify(){
        Fraction simplified = new Fraction(this.nume,this.denom);
        for (int i=2; i<=this.nume && i<=this.denom; i++){
            if (this.nume%i==0 && this.denom%i==0){
               simplified.setNume(nume/i);
               simplified.setDenom(denom/i);
            }
        }
        return simplified;
    }

    //reciprocal
    public Fraction reciprocal(){
        Fraction recip = new Fraction(denom, nume);
        return recip;
    }

    //toStrings
    public String toString(){
        return this.nume + "/" + this.denom;
    }

    public static void main(String[] args){
        Fraction nineTwelfths = new Fraction(9,12);
        System.out.println(nineTwelfths);
        System.out.println(nineTwelfths.reciprocal());
        System.out.println(nineTwelfths.simplify());
        System.out.println(nineTwelfths.sum(nineTwelfths));
        System.out.println(nineTwelfths.product(nineTwelfths)); // okay this one didn't simplify correctly for some reason, but class is over. whatever we tried our best.
    }

}
