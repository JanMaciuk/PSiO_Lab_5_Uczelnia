import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PracownikBadawczoDydaktyczny> Naukowcy = new ArrayList<PracownikBadawczoDydaktyczny>();
        ArrayList<PracownikAdministracyjny> Administracja = new ArrayList<PracownikAdministracyjny>();
        ArrayList<Student> Studenci = new ArrayList<Student>();
        ArrayList<Kurs> Kursy = new ArrayList<Kurs>();


        Naukowcy.add(new PracownikBadawczoDydaktyczny("Profesor zwyczajny", 10, 75000, "Jan", "Kowalski", "183116788", 50, "M", "Kurczak", 15));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Adiunkt", 5, 4000, "Janina", "Bąk", "980651121", 40, "K", "Pierogi", 2));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Wykładowca", 1, 3000, "Karol", "Kowalski", "785556788", 50, "M", "Słodycze", 10));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Profesor nadzwyczajny", 30, 8500, "Magda", "Mądra", "683416558", 70, "K", "Kurczak", 35));

        Administracja.add(new PracownikAdministracyjny("Specjalista", 20, 10000, "Janusz", "Nosacz", "199556789", 50, "M", "Kurczak", 15));
        Administracja.add(new PracownikAdministracyjny("Referent", 2, 2500, "Kasia", "Dąb", "10265937592", 20, "K", "Pierogi", 1));

        Kursy.add(new Kurs("Programowanie", Naukowcy.get(0), 4));
        Kursy.add(new Kurs("Matematyka ogólna", Naukowcy.get(1), 8));
        Kursy.add(new Kurs("Fizyka 1", Naukowcy.get(2), 6));
        Kursy.add(new Kurs("Analiza matematyczna", Naukowcy.get(3), 8));
        Kursy.add(new Kurs("Statystyka", Naukowcy.get(3), 6));
        Kursy.add(new Kurs("Teoria prawdopodobieństwa", Naukowcy.get(3), 1));
        Kursy.add(new Kurs("Projektowanie maszyn", Naukowcy.get(2), 4));




        ArrayList<Kurs> KursyStudenta1 = new ArrayList<Kurs>(Kursy); // ten student jest zapisany na wszystkie kursy, ambitnie.
        Studenci.add(new Student(21242, 1, false, true, true, "Jan", "Maciuk", "183116788", 20, "M", "Pierogi",KursyStudenta1));

        ArrayList<Kurs> KursyStudenta2 = new ArrayList<Kurs>();
        KursyStudenta2.add(Kursy.get(0));
        KursyStudenta2.add(Kursy.get(1));
        KursyStudenta2.add(Kursy.get(2));
        Studenci.add(new Student(21255, 2, true, true, false, "Karol", "Jękalski", "993116781", 22, "M", "Pierogi", KursyStudenta2));

        ArrayList<Kurs> KursyStudenta3 = new ArrayList<Kurs>();
        KursyStudenta3.add(Kursy.get(0));
        KursyStudenta3.add(Kursy.get(3));
        KursyStudenta3.add(Kursy.get(4));
        KursyStudenta3.add(Kursy.get(5));
        KursyStudenta3.add(Kursy.get(6));
        Studenci.add(new Student(25266, 2, false, false, true, "Kasia", "Kowalska", "383119122", 29, "K", "Pierogi",KursyStudenta3));

        ArrayList<Kurs> KursyStudenta4 = new ArrayList<Kurs>(); // ten student nie jest obecnie zapisany na żadne kursy, nie zapisał się w systemie.
        Studenci.add(new Student(31351, 2, false, true, false, "Karol", "Mały", "981116311", 22, "M", "Pierogi",KursyStudenta4 ));

        ArrayList<Kurs> KursyStudenta5 = new ArrayList<Kurs>(Kursy); // ten student jest zapisany na wszystkie kursy, ambitnie.
        Studenci.add(new Student(31232, 1, false, true, true, "Jan", "Duda", "222156918", 20, "M", "Pierogi",KursyStudenta5));

        System.out.println("Main pomyślnie wykonany");
    }
}
