import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PracownikBadawczoDydaktyczny> Naukowcy = new ArrayList<PracownikBadawczoDydaktyczny>();
        ArrayList<PracownikAdministracyjny> Administracja = new ArrayList<PracownikAdministracyjny>();
        ArrayList<Student> Studenci = new ArrayList<Student>();


        Naukowcy.add(new PracownikBadawczoDydaktyczny("Profesor", 10, 80000, "Jan", "Kowalski", "183116788", 50, "M", "Kurczak", 15));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Adiunkt", 5, 4000, "Janina", "Bąk", "980651121", 40, "K", "Pierogi", 2));

        Administracja.add(new PracownikAdministracyjny("Specjalista", 10, 10000, "Janusz", "Nosacz", "199556789", 50, "M", "Kurczak", 15));
        Administracja.add(new PracownikAdministracyjny("Referent", 2, 2500, "Kasia", "Dąb", "10265937592", 20, "K", "Pierogi", 1));

        Studenci.add(new Student(21242, 1, false, true, true, "Jan", "Maciuk", "183116788", 20, "M", "Pierogi"));
        Studenci.add(new Student(21255, 2, true, true, false, "Karol", "Jękalski", "993116781", 22, "M", "Pierogi"));
        Studenci.add(new Student(25266, 2, false, false, true, "Kasia", "Kowalska", "383119122", 29, "K", "Pierogi"));


        System.out.println("Main pomyślnie wykonany");
    }
}
