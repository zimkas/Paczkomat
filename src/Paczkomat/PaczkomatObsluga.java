package Paczkomat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaczkomatObsluga {


    static List<Paczkomat> paczkomaty = new ArrayList<>();
    public static void dodajPaczkomat(Paczkomat paczkomat){
            paczkomaty.add(paczkomat);

    }

    public static void usunPaczkomat(Paczkomat paczkomat){
            paczkomaty.remove(paczkomat);
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
                            "[4]. Dodac paczkomat\n" +
                            "[5]. Usunac paczkomat\n" +
                            "[6]. Wyswietlic paczkomaty\n" +
                            "[0]. Exit program");

             wybor = scannerInt.nextInt();

            switch (wybor) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
//                    System.out.print("Podaj ID paczkomatu, ktory chcesz usunac: ");
//                    idPaczkomatu = scanner.nextLine();
//                    System.out.println("Podaj nazwe paczkomatu: ");
//                    nazwaPaczkomatu = scanner.nextLine();
//                    System.out.println("Podaj adres paczkomatu: ");
//                    adresPaczkomatu = scanner.nextLine();
////                    usunPaczkomat(Paczkomat(idPaczkomatu, nazwaPaczkomatu, adresPaczkomatu));
//                    System.out.println("Twoj paczkomat zostal usuniety");
                    break;
                case 6:
                    System.out.println("Aktualnie dostepne paczkomaty to: " + paczkomaty);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wybierz od 0 do 6");


            }

        } while (wybor >0 );

    }
}


