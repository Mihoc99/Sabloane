package testSP;

public class Headphones implements Product{
    public int pret;
    public String nume;
    Headphones(String nume, int pret)
    {
        this.nume=nume;
        this.pret=pret;
    }

    public void showProducDetails()
    {
        System.out.println("Casti "+nume+" ,pret: "+pret);
    }
}
