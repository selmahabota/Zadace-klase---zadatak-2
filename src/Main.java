// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main {
    public static void isplatiPlatuRadnicima(Radnik []radnici){
        for (int i=0;i<radnici.length;i++)
            radnici[i].isplatiPlatu();
    }
    public static void main(String[] args) {

        RadnikPoSatu radnikPoSatu=new RadnikPoSatu("Amina", "Mujkic", "2203961121456", "1111222454545",3000,20);
        RadnikPoDanu radnikPoDanu=new RadnikPoDanu("Esma","Macic", "1201994111555","12345678912",28,150);
        RadnikFiksno radnikFiksno=new RadnikFiksno("Edin","Mesic","1405997154789","456454587878978",3500);
        RadnikPoSatu radnikPoSatu1=new RadnikPoSatu("Lejla", "Palalic", "2101994546123", "3333222454545",2500,25);
        RadnikPoDanu radnikPoDanu1=new RadnikPoDanu("Emir","Begic", "1502997156555","76543218912",30,170);
        RadnikFiksno radnikFiksno1=new RadnikFiksno("Tarik","Habota","2602994154789","123456787878978",4500);
        Radnik [] radnici = {radnikPoSatu,radnikPoDanu, radnikFiksno,radnikPoSatu1,radnikPoDanu1,radnikFiksno1};
        isplatiPlatuRadnicima(radnici);
    }
}