package testSP;

import java.util.*;
public class Box implements Product{

    public List <Product> productList = new ArrayList<Product>();

    public void addProduct(Product p)
    {
        productList.add(p);
    }

    public void showProducDetails()
    {
        for(Product p:productList)
            p.showProducDetails();
    }

    public void calculPret()
    {
        int tel=0,cas=0,inc=0;

        for(Product p:productList)
        {
            if( p instanceof Phone)
                tel+= p.pret;
            else if( p instanceof Headphones)
                cas+= p.pret;
            else if (p instanceof Charger)
                inc +=p.pret;
        }

        System.out.println("Pret telefoane: "+tel);
        System.out.println("Pret casti: "+cas);
        System.out.println("Pret incarcatoare: "+inc);
    }
}