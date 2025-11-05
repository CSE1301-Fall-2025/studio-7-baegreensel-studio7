public class Die {

    private int numSides = 0;

    //constructor
    public Die(int numSides){
        this.numSides = numSides;
    }

    //throwing die method
    public int throwDie(){
        return (int)(Math.random()*numSides+1);
    }

    //toString method
    public String toString(){
        return ("A die with " + numSides + " sides.");
    }

    //main method
    public static void main(String[] args){
        Die sixSided = new Die(6);
        System.out.println(sixSided);
        System.out.println(sixSided.throwDie());
    }

}
