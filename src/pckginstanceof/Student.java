package pckginstanceof;

public class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
    }
    
    void pobierzOpis()
    {
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + this.getImie());
        System.out.println("Nazwisko: " + this.getNazwisko());
    }
    
    void uczSie()
    {
        System.out.println("Już idę się uczyć!...");
    }
}
