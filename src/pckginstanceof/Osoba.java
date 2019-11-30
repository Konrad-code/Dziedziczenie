package pckginstanceof;

abstract class Osoba
{
    private String imie;
    private String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    protected String getImie()
    {
        return this.imie;
    }
    
    protected String getNazwisko()
    {
        return this.nazwisko;
    }
    
    abstract void pobierzOpis();
}
