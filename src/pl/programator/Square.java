package pl.programator;

public class Square {
    private int a;
    private int field;
    private int obw;

    public Square(int a) {
        calculateSquareAttributes(a);
        System.out.println(this);
    }

    public Square(int a, int field, int obw) {
        this.a = a;
        this.field = field;
        this.obw = obw;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        calculateSquareAttributes(a);
    }

    private void calculateSquareAttributes(int a) {
        this.a = a;
        this.field = a*a;
        this.obw = 4*a;
    }


    public int getField() {
        return field;
    }

    /*public void setField(int field) {
        this.field = field;
    }*/

    public int getObw() {
        return obw;
    }

    /*public void setObw(int obw) {
        this.obw = obw;
    }*/
}
