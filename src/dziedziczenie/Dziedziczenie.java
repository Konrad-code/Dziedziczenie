package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) 
    {
        Potwor pierwszySzkielet = new Szkielet(15, 100);
        System.out.println(pierwszySzkielet.getPredkoscPoruszania());
        
        Szkielet drugiSzkielet = new Szkielet(20, 50, "Luk");
        System.out.println(drugiSzkielet.getPredkoscPoruszania());
        Zombie pierwszyZombie = new Zombie();
        drugiSzkielet.atakuj();
        Szkielet trzeciSzkielet = new Szkielet();
        
        Potwor czwartySzkielet = new Szkielet(10, 100);
        czwartySzkielet.atakuj();
    }
}
