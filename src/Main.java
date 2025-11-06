public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Michał", "Kowalski", 'M', "Informatyka", 6.0);
        Student s2 = new Student("Kamila", "Nowak", 'K', "Programowanie", 4.0);
        Student s3 = new Student("Piotr", "Kozłowski", 'M', "Chemia", 2.0);

        System.out.println("\n-------- TESTY --------\n");

        //Zmiana imienia i nazwiska
        s1.ZmienImie("Piotr");
        s1.ZmienNazwisko("Kowal");
        s1.WyswietlInformacje();

        //Zmiana płci i kierunku
        s2.UstawPlec('M');
        s2.ZmienKierunek("Informatyka");

        //Zmiana oceny
        s3.ZmienOcene(1.0);

        //Sprawdzenie zaliczenia
        if (s3.SprawdzZaliczenie()){
            System.out.println(s3.getImie() + " " + s3.getNazwisko() + " zaliczył przedmiot");
        } else {
            System.out.println(s3.getImie() + " " + s3.getNazwisko() + " nie zaliczył przedmiotu");
        }

        //Średnia ocen kierunku
        Student.WyswietlSredniaOcenaKierunku("Informatyka");

        //Średnia ocen kierunku, który nie istnieje
        Student.WyswietlSredniaOcenaKierunku("Fizyka");
    }
}
