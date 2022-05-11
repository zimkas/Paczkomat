package Paczkomat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaczkomatObsluga {


    static List<Paczkomat> paczkomaty = new ArrayList<>();
    static List<Paczka> paczki = new ArrayList<>();
    public static void dodajPaczkomat(Paczkomat paczkomat){
            paczkomaty.add(paczkomat);
    }

    public static void usunPaczkomat(){
            Paczkomat paczkomat = null;
            for (int i=0; i<paczkomaty.size(); i++){
                if (paczkomaty.get(i).getIdPaczkomatu().equals(paczkomat.idPaczkomatu)){
                    paczkomat = paczkomaty.remove(i);
                }
            }
    }

    public static void wyswietlPaczkomaty(){
        System.out.println(paczkomaty);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);


        int wybor;

        do {

            System.out.println(
                    " Co chcesz zrobic? \n" +
                            "[1]. Dodac paczke\n" +
                            "[2]. Usunac paczke\n" +
                            "[3]. Wyswietlic wszystkie paczki\n" +
                            "[4 ok]. Dodac paczkomat\n" +
                            "[5]. Usunac paczkomat\n" +
                            "[6 ok]. Wyswietlic paczkomaty\n" +
                            "[0 ok]. Exit program\n" +
                            "Chce: ");

             wybor = scannerInt.nextInt();

            switch (wybor) {
                case 1:
                    //trzeba dodac ifa - jesli paczkomat istnieje to continue a jesli nie to trzeba dodac
                    System.out.println("Podaj ID paczki");
                    String idPaczki = scanner.nextLine();
                    System.out.println("Podaj rozmiar paczki");
                    String rozmiarPaczki = scanner.nextLine();
                    System.out.println("Podaj wage paczki");
                    Integer wagaPaczki = scannerInt.nextInt();
                    System.out.println("Podaj odbiorce paczki");
                    String odbiorcaPaczki = scanner.nextLine();
                    System.out.println("Podaj nadawce paczki");
                    String nadawcaPaczki = scanner.nextLine();
                    System.out.println("Podaj paczkomat nadawcy paczki");
                    //tu trzeba dodac ifa na paczkomat
                    String paczkomatNadawcy = scanner.nextLine();
                    System.out.println("Podaj paczkomat odbiorcy paczki");
                    String paczkomatOdbiorcy = scanner.nextLine();

                    for (int i = 0; i<paczkomaty.size(); i++){
                        if (paczkomaty.get(i).getIdPaczkomatu().equals(paczkomatNadawcy)){
                            paczkomaty.get(i).dodajPaczke(new Paczka(idPaczki, rozmiarPaczki, wagaPaczki, odbiorcaPaczki, nadawcaPaczki, paczkomatOdbiorcy,paczkomatNadawcy));
                        }
                    }


//                    paczkomaty.get(0).dodajPaczke(new Paczka(idPaczki, rozmiarPaczki, wagaPaczki, odbiorcaPaczki, nadawcaPaczki, paczkomatOdbiorcy,paczkomatNadawcy));
                    System.out.println("Twoja paczka została dodana");


                    break;
                case 2:
                    System.out.println("Podaj ID paczki, ktora chcesz usunac");
                    idPaczki = scanner.nextLine();
                    String idPaczkiDoUsuniecia = idPaczki;

                    for (int i = 0; i <paczkomaty.size(); i++){
                        if (paczkomaty.get(i).getIdPaczkomatu().equals(idPaczkiDoUsuniecia)){

                        }
                    }

//                    for (Paczka paczka : paczki){
//                        if (idPaczki.equals(idPaczkiDoUsuniecia)){
//                            paczki.remove(paczka);
//                        }
//                    }

                    break;
                case 3:
                    System.out.println(paczki);
                    break;

                case 4:
                    System.out.println("Podaj ID paczkomatu: ");
                    String idPaczkomatu = scanner.nextLine();
                    System.out.println("Podaj nazwe paczkomatu: ");
                    String nazwaPaczkomatu = scanner.nextLine();
                    System.out.println("Podaj adres paczkomatu: ");
                    String adresPaczkomatu = scanner.nextLine();
                    dodajPaczkomat(new Paczkomat(idPaczkomatu, nazwaPaczkomatu, adresPaczkomatu));
                    System.out.println("Paczkomat zostal dodany");
                    break;
                case 5:
                    System.out.println("Podaj id paczkomatu do usuniecia: ");
                    idPaczkomatu = scanner.nextLine();
                    usunPaczkomat();
                    System.out.println("Twoj paczkomat zostal usuniety");
                    break;
                case 6:
                    System.out.println("Aktualnie dostepne paczkomaty to: " + paczkomaty);
                    break;
                case 0:
                    System.out.println("Do zobaczenia innym razem");
                    break;
                default:
                    System.out.println("Wybierz od 0 do 6");


            }

        } while (wybor >0 );

    }
}


