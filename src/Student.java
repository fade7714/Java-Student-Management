import java.util.ArrayList;
import java.util.List;

public class Student {
    private String imie;
    private String nazwisko;
    private char plec;
    private String kierunek;
    private double ocena;

    private List<Double> oceny;
    private static List<Student> wszyscyStudenci = new ArrayList<>();

    private static final double PROG_ZALICZENIA = 1.71;

    public Student(String imie, String nazwisko, char plec, String kierunek, double ocena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.kierunek = kierunek;
        this.ocena = ocena;

        this.oceny = new ArrayList<>();
        this.oceny.add(ocena);

        wszyscyStudenci.add(this);

        WyswietlInformacje();
        /*Poniższe metody nie zostaną wykonane, aby uniknąć dublowania danych
        ZmienKierunek(kierunek);
        ZmienOcene(ocena);*/
    }

    public void WyswietlInformacje(){
        System.out.println("--- Informacje o studencie ---");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Plec: " + plec);
        System.out.println("Kierunek: " + kierunek);
        System.out.println("Biezaca ocena: " + ocena);
        System.out.println("Liczba ocen: " + oceny.size());
        System.out.println("Srednia ocen studenta: " + ObliczSredniaOcen());
        System.out.println("------------------------------");
    }

    public void ZmienKierunek(String nowyKierunek){
        this.kierunek = nowyKierunek;
        System.out.println("Zmiana kierunku na: " + nowyKierunek);
        WyswietlInformacje();
    }

    public void ZmienOcene(double nowaOcena){
        this.ocena = nowaOcena;
        this.oceny.add(nowaOcena);
        System.out.println("Zmiana oceny na: " + nowaOcena);
        WyswietlInformacje();
    }

    public double ObliczSredniaOcen(){
        if (oceny.isEmpty()) return 0.0;
        double suma = 0.0;
        for (double x : oceny) suma += x;
        return suma / oceny.size();
    }

    public void ZmienImie(String noweImie){
        this.imie = noweImie;
        System.out.println("Zmiana imienia na: " + noweImie);
    }

    public void ZmienNazwisko(String noweNazwisko){
        this.nazwisko = noweNazwisko;
        System.out.println("Zmiana nazwiska na: " + noweNazwisko);
    }

    public boolean SprawdzZaliczenie(){
        return ObliczSredniaOcen() >= PROG_ZALICZENIA;
    }

    public void UstawPlec(char nowaPlec){
        this.plec = nowaPlec;
        System.out.println("Ustawiona plec: " + nowaPlec);
    }

    public static void WyswietlSredniaOcenaKierunku(String kierunek){
        double suma = 0.0;
        int i = 0;
        for (Student s : wszyscyStudenci){
            if (s.kierunek.equals(kierunek)){
                suma += s.ObliczSredniaOcen();
                i++;
            }
        }
        if (i == 0){
            System.out.println("Brak studentów na kierunku: " + kierunek);
        } else {
            double srednia = suma / i;
            System.out.println("Średnia ocen na kierunku " + kierunek + " jest równa: " + srednia);
        }
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
}
