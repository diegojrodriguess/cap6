public class Coruja extends Animal{
    private int alturaVoo;

    @Override
    public void fazBarulho() {
        System.out.println("pruuu pruuuu");
    }

    public int getAlturaVoo() {
        return alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }
}
