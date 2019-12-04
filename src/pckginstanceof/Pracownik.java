package pckginstanceof;

import java.util.Date;

public class Pracownik extends Osoba
{
    private double wynagrodzenie;
    private final Date dataZatrudnienia;
            
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
        this.dataZatrudnienia = new Date();
    }
    
    protected double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    void pobierzOpis()
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię: " + this.getImie());
        System.out.println("Nazwisko: " + this.getNazwisko());
        System.out.println("Wynagrodzenie: " + this.getWynagrodzenie());
    }
    
    void pracuj()
    {
        System.out.println("Już idę pracować!...");
    }
    
    Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
}
