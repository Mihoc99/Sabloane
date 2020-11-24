package testSP;

public class Main {

    public static void main(String[] args) {
        Phone p1= new Phone("P20 Lite","Salut",3000);
        Phone p2= new Phone("iPhone 12","Sarac",6000);

        Box b1 = new Box();
        b1.addProduct(p1);
        b1.addProduct(p2);

        Box b2 = new Box();
        Charger c1 = new Charger("de Huawei",50);
        Headphones h1 = new Headphones("de iPhone",100);
        b2.addProduct(c1);
        b2.addProduct(h1);

        b1.addProduct(b2);
        b1.showProducDetails();

        p1.setOs("Android");
        p2.setOs("iOS");

        p1.showMesaj();
        p2.showMesaj();

        b1.calculPret();
    }

}