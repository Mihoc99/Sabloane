package testSP;

public class Charger implements Product{
    public String nume;
    public int pret;
    Charger(String nume, int pret)
    {
        this.nume=nume;
        this.pret=pret;
    }

    public void showProducDetails()
    {
        System.out.println("Incarcator "+nume+" ,pret: "+pret);
    }
}
