package dziedziczenie.potwory;

public abstract class Potwor {                      // Klasa abstrakcyjna; nie może utworzyć swoich instancji.
    protected double predkoscPoruszania = 10;
    protected double zywotnosc;
    
    public void atakuj()
    {
        /*
        BAZOWE INSTRUKCJE ATAKU
        */
        System.out.println("To jest metoda atakuj z klasy Potwor");
    }           
    
    abstract protected void opis();                 // Metoda abstrakcyjna; tzw. "wymóg". Zmusza sub-klasy dzieci do implementacji tej metody.
    
    public double getPredkoscPoruszania()
    {
        return predkoscPoruszania;
    }
    
    public double getZywotnosc()
    {
        return zywotnosc;
    }
    
    public Potwor()
    {
        System.out.println("Domyslny konstruktor z klasy Potwor");
    }
    
    public Potwor(double predkoscPoruszania, double zywotnosc)
    {
        this.predkoscPoruszania = predkoscPoruszania;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyslny konstruktor z klasy Potwor");
    }
}
