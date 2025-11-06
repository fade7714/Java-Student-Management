Napisz program w języku JAVA do zarządzania danymi studentów. W tym celu utwórz klasę o nazwie STUDENT z następującymi polami:

imie - typu String;
nazwisko - typu String;
ocena - typu double;
plec - typu char;
kierunek - typu String;

Do wykonania:

Wyposaż klasę w konstruktor, który wywoła działanie metod:

1.1 WyswietlInformacje();
1.2 ZmienKierunek(String nowyKierunek);
1.3 ZmienOcene(double nowaOcena);

Metody, które dokonują zmiany kierunku oraz oceny, po zmianie mają wywołać metodę WyswietlInformacje();

Dodatkowe metody do zaimplementowania:
Metoda ObliczSredniaOcen(), która oblicza średnią ocenę studenta na podstawie dostępnych ocen i ją zwraca.
Metoda ZmienImie(String noweImie), która umożliwia zmianę imienia studenta i aktualizuje to pole.
Metoda ZmienNazwisko(String noweNazwisko), która umożliwia zmianę nazwiska studenta i aktualizuje to pole.
Metoda SprawdzZaliczenie(), która sprawdza, czy student zaliczył dany przedmiot na podstawie ocen i zwraca true, jeśli zaliczył, lub false, jeśli nie.
Metoda UstawPlec(char nowaPlec), która umożliwia zmianę płci studenta i aktualizuje to pole.
Metoda WyswietlSredniaOcenaKierunku(String kierunek), która przyjmuje nazwę kierunku i oblicza średnią ocenę wszystkich studentów na tym kierunku.
