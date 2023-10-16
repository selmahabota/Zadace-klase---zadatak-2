public class RadnikPoSatu extends Radnik{
    private double sati;
    private double satnica;
    public RadnikPoSatu(String ime, String prezime, String JMBG, String ziroRacun,  double sati, double satnica) {
        super(ime, prezime, JMBG, ziroRacun);
        this.sati=sati;
        this.satnica=satnica;
    }

    @Override
    public void isplatiPlatu(){
        System.out.println("Plata za radnika "+ime+" "+prezime+" ciji je JMBG: "+JMBG+" i ziro racun: "+ziroRacun+" je: " +(satnica*sati));
    }

    @Override
    public String toString() {
        return "RadnikPoSatu{" +
                "sati=" + sati +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", JMBG='" + JMBG + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + (satnica*sati) +
                '}';
    }
}
