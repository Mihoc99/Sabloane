package testSP;

public class Phone implements Product{
    public String OS;
    public String mesaj;
    public int pret;
    public String nume;
    public Phone(String nume, String mesaj, int pret)
    {
        this.nume=nume;
        this.mesaj=mesaj;
        this.pret=pret;
    }
    public void showProducDetails()
    {
        System.out.println("Phone "+nume+" ,pret: "+pret);
    }

    public void setOs(String s)
    {
        OS=s;
    }

    public void showMesaj()
    {
        System.out.println("@"+OS+": "+mesaj);
    }
}
