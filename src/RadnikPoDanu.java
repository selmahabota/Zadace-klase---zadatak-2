public class RadnikPoDanu extends Radnik{
    private int dani;
    private double dnevnica;
    public RadnikPoDanu(String ime, String prezime, String JMBG, String ziroRacun, int dani, double dnevnica) {
        super(ime, prezime, JMBG, ziroRacun);
        this.dani=dani;
        this.dnevnica=dnevnica;
    }
    @Override
    public void isplatiPlatu(){
        System.out.println("Plata za radnika "+ime+" "+prezime+" ciji je JMBG: "+JMBG+" i ziro racun: "+ziroRacun+" je: " +(dnevnica*dani));
    }

    @Override
    public String toString() {
        return "RadnikPoDanu{" +
                "dani=" + dani +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", JMBG='" + JMBG + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + (dnevnica*dani) +
                '}';
    }
}
