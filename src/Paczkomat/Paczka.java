package Paczkomat;

public class Paczka {
    private String idPaczki;
    private String rozmiarPaczki;
    private Integer wagaPaczki;
    private String odbiorcaPaczki;
    private String nadawcaPaczki;
    private String paczkomatNadawcy;
    private String paczkomatOdbiorcy;


    public Paczka(String idPaczki, String rozmiarPaczki, Integer wagaPaczki, String odbiorcaPaczki, String nadawcaPaczki, String paczkomatNadawcy, String paczkomatOdbiorcy) {
        this.idPaczki = idPaczki;
        this.rozmiarPaczki = rozmiarPaczki;
        this.wagaPaczki = wagaPaczki;
        this.odbiorcaPaczki = odbiorcaPaczki;
        this.nadawcaPaczki = nadawcaPaczki;
        this.paczkomatNadawcy = paczkomatNadawcy;
        this.paczkomatOdbiorcy = paczkomatOdbiorcy;
    }

    public String getIdPaczki() {
        return idPaczki;
    }

    public void setIdPaczki(String idPaczki) {
        this.idPaczki = idPaczki;
    }

    public String getRozmiarPaczki() {
        return rozmiarPaczki;
    }

    public void setRozmiarPaczki(String rozmiarPaczki) {
        this.rozmiarPaczki = rozmiarPaczki;
    }

    public Integer getWagaPaczki() {
        return wagaPaczki;
    }

    public void setWagaPaczki(Integer wagaPaczki) {
        this.wagaPaczki = wagaPaczki;
    }

    public String getOdbiorcaPaczki() {
        return odbiorcaPaczki;
    }

    public void setOdbiorcaPaczki(String odbiorcaPaczki) {
        this.odbiorcaPaczki = odbiorcaPaczki;
    }

    public String getNadawcaPaczki() {
        return nadawcaPaczki;
    }

    public void setNadawcaPaczki(String nadawcaPaczki) {
        this.nadawcaPaczki = nadawcaPaczki;
    }

    public String getPaczkomatNadawcy() {
        return paczkomatNadawcy;
    }

    public void setPaczkomatNadawcy(String paczkomatNadawcy) {
        this.paczkomatNadawcy = paczkomatNadawcy;
    }

    public String getPaczkomatOdbiorcy() {
        return paczkomatOdbiorcy;
    }

    public void setPaczkomatOdbiorcy(String paczkomatOdbiorcy) {
        this.paczkomatOdbiorcy = paczkomatOdbiorcy;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "idPaczki='" + idPaczki + '\'' +
                ", rozmiarPaczki='" + rozmiarPaczki + '\'' +
                ", wagaPaczki=" + wagaPaczki +
                ", odbiorcaPaczki='" + odbiorcaPaczki + '\'' +
                ", nadawcaPaczki='" + nadawcaPaczki + '\'' +
                ", paczkomatNadawcy='" + paczkomatNadawcy + '\'' +
                ", paczkomatOdbiorcy='" + paczkomatOdbiorcy + '\'' +
                '}';
    }
}