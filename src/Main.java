import java.util.ArrayList;

public class Main {
    protected static ArrayList<PracownikBadawczoDydaktyczny> Naukowcy = new ArrayList<>();
    protected static ArrayList<PracownikAdministracyjny> Administracja = new ArrayList<>();
    protected static ArrayList<Student> Studenci = new ArrayList<>();
    protected static ArrayList<Kurs> Kursy = new ArrayList<>();
    public static void main(String[] args) {

        // Pracownicy naukowi
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Profesor zwyczajny", 10, 75000, "Jan", "Kowalski", "183116788", 50, "M", "Pierogi", 15));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Adiunkt", 5, 4000, "Janina", "Bąk", "980651121", 40, "K", "Pierogi", 2));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Wykładowca", 1, 3000, "Karol", "Kowalski", "785556788", 50, "M", "Słodycze", 10));
        Naukowcy.add(new PracownikBadawczoDydaktyczny("Profesor nadzwyczajny", 30, 8500, "Magda", "Mądra", "683416558", 70, "K", "Kurczak", 35));

        // Pracownicy administracji
        Administracja.add(new PracownikAdministracyjny("Specjalista", 20, 10000, "Janusz", "Nosacz", "199556789", 50, "M", "Kurczak", 15));
        Administracja.add(new PracownikAdministracyjny("Referent", 2, 2500, "Kasia", "Dąb", "10265937592", 20, "K", "Pierogi", 1));

        // Kursy
        Kursy.add(new Kurs("Programowanie", Naukowcy.get(0), 4));
        Kursy.add(new Kurs("Matematyka ogólna", Naukowcy.get(1), 8));
        Kursy.add(new Kurs("Fizyka 1", Naukowcy.get(2), 6));
        Kursy.add(new Kurs("Analiza matematyczna", Naukowcy.get(3), 8));
        Kursy.add(new Kurs("Statystyka", Naukowcy.get(3), 6));
        Kursy.add(new Kurs("Teoria prawdopodobieństwa", Naukowcy.get(3), 1));
        Kursy.add(new Kurs("Projektowanie maszyn", Naukowcy.get(2), 4));

        // Studenci
        ArrayList<Kurs> KursyStudenta1 = new ArrayList<>(Kursy); // ten student jest zapisany na wszystkie kursy, ambitnie.
        Studenci.add(new Student(21242, 1, false, true, true, "Jan", "Maciuk", "183116788", 20, "M", "Pierogi",KursyStudenta1));

        ArrayList<Kurs> KursyStudenta2 = new ArrayList<>();
        KursyStudenta2.add(Kursy.get(0));
        KursyStudenta2.add(Kursy.get(1));
        KursyStudenta2.add(Kursy.get(2));
        Studenci.add(new Student(21255, 2, true, true, false, "Karol", "Jękalski", "993116781", 22, "M", "Pierogi", KursyStudenta2));

        ArrayList<Kurs> KursyStudenta3 = new ArrayList<>();
        KursyStudenta3.add(Kursy.get(0));
        KursyStudenta3.add(Kursy.get(3));
        KursyStudenta3.add(Kursy.get(4));
        KursyStudenta3.add(Kursy.get(5));
        KursyStudenta3.add(Kursy.get(6));
        Studenci.add(new Student(25266, 2, false, false, true, "Kasia", "Kowalska", "383119122", 29, "K", "Pierogi",KursyStudenta3));

        ArrayList<Kurs> KursyStudenta4 = new ArrayList<>(); // ten student nie jest obecnie zapisany na żadne kursy, nie zapisał się w systemie.
        Studenci.add(new Student(31351, 2, false, true, false, "Karol", "Mały", "981116311", 22, "M", "Pierogi",KursyStudenta4 ));

        ArrayList<Kurs> KursyStudenta5 = new ArrayList<>(Kursy); // ten student jest zapisany na wszystkie kursy, ambitnie.
        Studenci.add(new Student(31232, 1, false, true, true, "Jan", "Duda", "222156918", 20, "M", "Pierogi",KursyStudenta5));

        System.out.println("Wyszukiwanie:");
        ArrayList<PracownikBadawczoDydaktyczny> wyszukaniNaukowcy = new ArrayList<>(szukajNaukowcow("Kurczak", "ulubione jedzenie"));
        printNaukowcy(wyszukaniNaukowcy);

        ArrayList<PracownikAdministracyjny> wyszukaniAdministratorzy = new ArrayList<>(szukajAdministracji("Specjalista", "stanowisko"));
        printAdministracja(wyszukaniAdministratorzy);

        ArrayList<Student> wyszukaniStudenci = new ArrayList<>(szukajStudentow("Fizyka 1", "kurs"));
        printStudenci(wyszukaniStudenci);

        ArrayList<Kurs> wyszukaneKursy = new ArrayList<>(szukajKursow("Jan", "prowadzący"));
        printKursy(wyszukaneKursy);

        System.out.println("Teraz wszyscy i wszystko:");
        printNaukowcy(Naukowcy);
        printAdministracja(Administracja);
        printStudenci(Studenci);
        printKursy(Kursy);
    }

    //wyszukiwanie:
    public static ArrayList<PracownikBadawczoDydaktyczny> szukajNaukowcow(String fraza, String selektor)  {
        ArrayList<PracownikBadawczoDydaktyczny> wynik = new ArrayList<>();
        switch(selektor) {
            case "imie":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getImie().equals(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "nazwisko":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getNazwisko().equals(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "pesel":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getPesel().equals(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "stanowisko":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getStanowisko().equals(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "staż pracy":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (fraza.equals(Integer.toString(naukowiec.getStazPracy()))) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "pensja":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getPensja() == Integer.parseInt(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "wiek":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getWiek() == Integer.parseInt(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "liczba publikacji":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getLiczbaPublikacji() == Integer.parseInt(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "ulubione jedzenie":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getJedzenie().equals(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            case "Płeć":
                for (PracownikBadawczoDydaktyczny naukowiec : Naukowcy) {
                    if (naukowiec.getPlec().equals(fraza)) {
                        wynik.add(naukowiec);
                    }
                }
                break;
            }
        return wynik;
    }

    public static ArrayList<PracownikAdministracyjny> szukajAdministracji(String fraza, String selektor) {
        ArrayList<PracownikAdministracyjny> wynik = new ArrayList<>();
        switch(selektor) {
            case "imie":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getImie().equals(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            case "nazwisko":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getNazwisko().equals(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            case "pesel":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getPesel().equals(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            case "stanowisko":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getStanowisko().equals(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            case "staż pracy":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (fraza.equals(Integer.toString(admin.getStazPracy()))) {
                        wynik.add(admin);
                    }
                }
                break;
            case "pensja":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getPensja() == Integer.parseInt(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            case "wiek":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getWiek() == Integer.parseInt(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            case "ulubione jedzenie":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getJedzenie().equals(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;

            case "płeć":
                for (PracownikAdministracyjny admin : Administracja) {
                    if (admin.getPlec().equals(fraza)) {
                        wynik.add(admin);
                    }
                }
                break;
            }
        return wynik;
    }

    public static ArrayList<Student> szukajStudentow(String fraza, String selektor) {
        ArrayList<Student> wynik = new ArrayList<>();
        switch(selektor) {
            case "imie":
                for (Student student : Studenci) {
                    if (student.getImie().equals(fraza)) {
                        wynik.add(student);
                    }
                }
                break;
            case "nazwisko":
                for (Student student : Studenci) {
                    if (student.getNazwisko().equals(fraza)) {
                        wynik.add(student);
                    }
                }
                break;
            case "pesel":
                for (Student student : Studenci) {
                    if (student.getPesel().equals(fraza)) {
                        wynik.add(student);
                    }
                }
                break;
            case "rok studiów":
                for (Student student : Studenci) {
                    if (fraza.equals(Integer.toString(student.getRokStudiow()))) {
                        wynik.add(student);
                    }
                }
                break;
            case "wiek":
                for (Student student : Studenci) {
                    if (student.getWiek() == Integer.parseInt(fraza)) {
                        wynik.add(student);
                    }
                }
                break;
            case "ulubione jedzenie":
                for (Student student : Studenci) {
                    if (student.getJedzenie().equals(fraza)) {
                        wynik.add(student);
                    }
                }
                break;

            case "płeć":
                for (Student student : Studenci) {
                    if (student.getPlec().equals(fraza)) {
                        wynik.add(student);
                    }
                }
                break;
            case "kurs":
                for (Student student : Studenci) {
                    for (Kurs kurs : student.getListaKursow()) {
                        if (kurs.getNazwaKursu().equals(fraza)) {
                            wynik.add(student);
                        }
                    }
                }
                break;
            }

        return wynik;
    }

    public static ArrayList<Kurs> szukajKursow(String fraza, String selektor) {
        ArrayList<Kurs> wynik = new ArrayList<>();
        switch(selektor) {
            case "nazwa kursu":
                for (Kurs kurs : Kursy) {
                    if (kurs.getNazwaKursu().equals(fraza)) {
                        wynik.add(kurs);
                    }
                }
                break;
            case "ECTS":
                for (Kurs kurs : Kursy) {
                    if (fraza.equals(Integer.toString(kurs.getLiczbaECTS()))) {
                        wynik.add(kurs);
                    }
                }
                break;
            case "prowadzący":
                for (Kurs kurs : Kursy) {
                    if (kurs.getProwadzacy().getImie().equals(fraza) || kurs.getProwadzacy().getNazwisko().equals(fraza)) {
                        wynik.add(kurs);
                    }
                }
                break;

            }
        return wynik;
    }

    public static void printAdministracja(ArrayList<PracownikAdministracyjny> lista) {
        System.out.println("Żądana lista pracowników administracyjnych:");
        for (PracownikAdministracyjny admin : lista) {
            System.out.println(admin.getImie() + " " + admin.getNazwisko() + ", " + admin.getPesel() + ", " + admin.getStanowisko() + ", Staż: " + admin.getStazPracy() + " miesięcy, " + admin.getPensja() + ", " + admin.getWiek() + ", " + admin.getJedzenie() + ", " + admin.getPlec() + ", " + admin.getLiczbaNadgodzin() + " nadgodzin");
        }
        System.out.println();
    }
    public static void printNaukowcy(ArrayList<PracownikBadawczoDydaktyczny> lista) {
        System.out.println("Żądana lista pracowników naukowych:");
        for (PracownikBadawczoDydaktyczny naukowiec : lista) {
            System.out.println(naukowiec.getImie() + " " + naukowiec.getNazwisko() + ", " + naukowiec.getPesel() + ", " + naukowiec.getStanowisko() + ", Staż: " + naukowiec.getStazPracy() + " miesięcy, " + naukowiec.getPensja() + ", " + naukowiec.getWiek() + ", " + naukowiec.getJedzenie() + ", " + naukowiec.getPlec() + ", liczba publikacji: " + naukowiec.getLiczbaPublikacji());
        }
        System.out.println();
    }

    public static void printStudenci(ArrayList<Student> lista) {
        System.out.println("Żądana lista studentów:");
        for (Student student : lista) {

            System.out.println(student.getImie() + " " + student.getNazwisko() + ", " + student.getPesel() + ", " + student.getRokStudiow() + "r. wiek: " + student.getWiek() + ", " + student.getJedzenie() + ", " + student.getPlec()+ ", liczba kursów: " + student.getListaKursow().size());
        }
        System.out.println();
    }

    public static void printKursy(ArrayList<Kurs> lista) {
        System.out.println("Żądana lista kursów:");
        for (Kurs kurs : lista) {
            System.out.println(kurs.getNazwaKursu() + " " + kurs.getLiczbaECTS() + " ECTS, Prowadzący: " + kurs.getProwadzacy().getImie() + " " + kurs.getProwadzacy().getNazwisko());
        }
        System.out.println();
    }






}
