public abstract class Radnik
{
    String ime;
    String prezime;
    String JMBG;
    String ziroRacun;
    double plata;
    public Radnik(String ime, String prezime, String JMBG, String ziroRacun, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.ziroRacun = ziroRacun;
        this.plata = plata;
    }

    public Radnik(String ime, String prezime, String JMBG, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.ziroRacun = ziroRacun;
    }

    abstract void isplatiPlatu();
}
