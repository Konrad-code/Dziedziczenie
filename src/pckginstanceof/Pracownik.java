package pckginstanceof;

public class Pracownik extends Osoba
{
    private double wynagrodzenie;
    
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
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
}
