package dziedziczenie.potwory;

public class Szkielet extends Potwor
{
    String typBroni;
    
    public void atakuj()
    {
        super.atakuj();
        /*
        DODATKOWE INSTRUKCJE ATAKU
        */
        System.out.println("To jest metoda atakuj z klasy Szkielet");
    }
    
    public Szkielet()
    {
        System.out.println("Domyslny konstruktor z klasy Szkielet");        
    }
    
    public Szkielet(double predkoscPoruszania, double zywotnosc)
    {
        super(predkoscPoruszania, zywotnosc);
        System.out.println("Niedomyslny konstruktor z klasy Szkielet z dwoma argumentami");        
    }
    
    public Szkielet(double predkoscPoruszania, double zywotnosc, String typBroni)
    {
        super(predkoscPoruszania, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyslny konstruktor z klasy Szkielet z trzema argumentami");        
    }

    protected void opis() 
    {
        // Metoda stanowiaca wymog utworzenia klasy narzucony przez super-klase.
    }
}
