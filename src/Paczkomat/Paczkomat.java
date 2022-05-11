package Paczkomat;

import java.util.ArrayList;
import java.util.List;

public class Paczkomat {
    public String idPaczkomatu;
    public String nazwaPaczkomatu;
    public String adresPaczkomatu;

    public Paczkomat(String idPaczkomatu, String nazwaPaczkomatu, String adresPaczkomatu) {
        this.idPaczkomatu = idPaczkomatu;
        this.nazwaPaczkomatu = nazwaPaczkomatu;
        this.adresPaczkomatu = adresPaczkomatu;
    }

    public static  List<Paczka> paczki = new ArrayList<>();

    public void dodajPaczke(Paczka paczka){
        paczki.add(paczka);
    }
//    public static void usunPaczke(Paczka paczka){
//        paczki.remove(paczka);
//    }

    public static void wyswietlPaczki(Paczka paczka){
        System.out.println(paczki);
    }

    public String getIdPaczkomatu() {
        return idPaczkomatu;
    }

    public  void setIdPaczkomatu(String idPaczkomatu) {
        this.idPaczkomatu = idPaczkomatu;
    }

    public String getNazwaPaczkomatu() {
        return nazwaPaczkomatu;
    }

    public void setNazwaPaczkomatu(String nazwaPaczkomatu) {
        this.nazwaPaczkomatu = nazwaPaczkomatu;
    }

    public String getAdresPaczkomatu() {
        return adresPaczkomatu;
    }

    public void setAdresPaczkomatu(String adresPaczkomatu) {
        this.adresPaczkomatu = adresPaczkomatu;
    }

    @Override
    public String toString() {
        return "Paczkomat{" +
                "idPaczkomatu='" + idPaczkomatu + '\'' +
                ", nazwaPaczkomatu='" + nazwaPaczkomatu + '\'' +
                ", adresPaczkomatu='" + adresPaczkomatu + '\'' +
                '}';
    }

    public void dodajPaczke(String idPaczki, String rozmiarPaczki, Integer wagaPaczki, String odbiorcaPaczki, String nadawcaPaczki, String paczkomatOdbiorcy, String paczkomatNadawcy) {
    }
}

