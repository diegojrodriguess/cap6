public class Peixe extends Animal{
    private int nBarbatanas;

    @Override
    public void fazBarulho() {
        System.out.println("glub glub");
    }

    public int getnBarbatanas() {
        return nBarbatanas;
    }

    public void setnBarbatanas(int nBarbatanas) {
        this.nBarbatanas = nBarbatanas;
    }
}
