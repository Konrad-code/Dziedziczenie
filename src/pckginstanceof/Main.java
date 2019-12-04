package pckginstanceof;

public class Main
{
    public static void main(String[] args)
    {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Konrad", "Żołyński", 10000);
        osoba[1] = new Student("Michał", "Chwaściński");
        osoba[3] = new Pracownik("Paweł", "Cieśliński", 20000);
        
        osoba[0].pobierzOpis();
        
        for(int i = 0; i < osoba.length; i++)              // Pętla pobierająca standardowy opis z metody abstrakcyjnej.
        {
            if(osoba[i] instanceof Osoba)
                osoba[i].pobierzOpis();
            else
                break;
        }
        
        for(Osoba licznik: osoba)                           // Pętla ulepszona pobierająca opis metodą abstrakcyjną dla wszystkich instancji klasy potomnej Pracownik.
        {
            if(licznik instanceof Pracownik)
                ((Pracownik)licznik).pobierzOpis();
        }

        for(Osoba licznik: osoba)                           // Pętla ulepszona wywołująca metodę "pracuj" klasy potomnej Pracownik oraz "uczSie" klasy potomnej Student.
        {
            if(licznik instanceof Pracownik)
                ((Pracownik) licznik).pracuj();
            else if(licznik instanceof Student)
                ((Student)licznik).uczSie();
        }
        
        System.out.println("Oto pętla testowa alternatywnej implemetacji downcastingu");
        
        for(Osoba licznik: osoba)                           // Pętla alternatywnej implemetacji rzutowania w dół
        {
            if(licznik instanceof Pracownik)
            {
                Pracownik tmp = (Pracownik) licznik;
                tmp.pracuj();
            }
            else if(licznik instanceof Student)
            {
                Student tmp = (Student) licznik;
                tmp.uczSie();
            }
        }
    }
}
