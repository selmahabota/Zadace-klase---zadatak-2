public class RadnikFiksno extends Radnik {

    public RadnikFiksno(String ime, String prezime, String JMBG, String ziroRacun, double plata) {
        super(ime, prezime, JMBG, ziroRacun, plata);
    }
    @Override
    public void isplatiPlatu(){
        System.out.println("Plata za radnika "+ime+" "+prezime+" ciji je JMBG: "+JMBG+" i ziro racun: "+ziroRacun+" je: " +plata);
    }

    @Override
    public String toString() {
        return "RadnikFiksno{" +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", JMBG='" + JMBG + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}
