package pckginstanceof;

public class Main
{
    public static void main(String[] args)
    {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Konrad", "Żołyński", 10000);
        osoba[1] = new Student("Michał", "Chwaściński");
        
        osoba[0].pobierzOpis();
        
        for(int i = 0; i < osoba.length; i++)
        {
            if(osoba[i] instanceof Osoba)
                osoba[i].pobierzOpis();
            else
                break;
        }
        
        /*  Alternatywna wersja z petla enhanced for
        for (Osoba licznik: osoba)
        {
            if(licznik instanceof Osoba)
                licznik.pobierzOpis();
            else
                break;
        }
        */
    }
}
