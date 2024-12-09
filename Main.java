import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Pro ovládaní kalkulačky budeš pro domací mačka 1 a pro hosty mačka 2");

        int domaciHry = 0;
        int hosteHry = 0;
        int domaciGemy = 0;
        int hosteGemy = 0;
        int domaciSety = 0;
        int hosteSety = 0;
        int domaciPocitadloVyhod = 0;
        int hostePocitadloVyhod = 0;

        String vyhoda = "AD";

        int vstup;

        do{

//        Ovladani
        System.out.println("kdo získal bod? D - 1 nebo H - 2");
        vstup = scanner.nextInt();

        if(vstup != 1 && vstup != 2){
            System.out.println("spatne zadana hodnota");
        }

//        Pocitani bodu domaciho
        if(vstup == 1 && domaciHry != 30 && domaciHry <= 39){
            domaciHry = domaciHry + 15;
        }else if(vstup == 1 && domaciHry == 30 || vstup == 1 && domaciHry == 40){
            domaciHry = domaciHry + 10;
        }
        if(vstup == 2 && hosteHry != 30 && hosteHry <= 39){
            hosteHry = hosteHry + 15;
        }else if(vstup == 2 && hosteHry == 30 || vstup == 2 && hosteHry == 40){
            hosteHry = hosteHry + 10;
        }


//        Fucking vyhody - nefunkcni
        if(domaciHry == 50 && vstup == 1 && hosteHry == 40){
            domaciHry = 100;
        }
        if(hosteHry == 50 && vstup == 2 && domaciHry == 40){
            hosteHry = 100;
        }

        if (domaciHry == 100){
            domaciPocitadloVyhod++;
        }
        if (hosteHry == 100){
            hostePocitadloVyhod++;
        }

        if (domaciHry == 100 && hosteHry == 50){
            hostePocitadloVyhod = 0;
            domaciPocitadloVyhod = 0;
            hosteHry = 40;
            domaciHry = 40;
        }
        if (domaciHry == 50 && hosteHry == 100){
            hostePocitadloVyhod = 0;
            domaciPocitadloVyhod = 0;
            hosteHry = 40;
            domaciHry = 40;
        }

        if (vstup == 1 && domaciPocitadloVyhod == 2 || vstup == 1 && domaciHry == 50 && hosteHry != 40){
            domaciGemy++;
            domaciHry = 0;
            hosteHry = 0;
            domaciPocitadloVyhod = 0;
            hostePocitadloVyhod = 0;
        }

        if (vstup == 2 && hostePocitadloVyhod == 2 || vstup == 2 && hosteHry == 50 && domaciHry != 40){
            hosteGemy++;
            domaciHry = 0;
            hosteHry = 0;
            domaciPocitadloVyhod = 0;
            hostePocitadloVyhod = 0;
        }


////        Potvrzeni vyhody
        if (vstup == 1 && domaciHry == 100 && domaciPocitadloVyhod == 2){
            domaciGemy++;
            domaciHry = 0;
            hosteHry = 0;
        }else if(vstup == 2 && hosteHry == 100 && hostePocitadloVyhod == 2){
            hosteGemy++;
            domaciHry = 0;
            hosteHry = 0;
        }


//        GEMY

    if (domaciGemy >= 6 || hosteGemy >= 6){
        if (domaciGemy == 6 && hosteGemy <= 4){
            domaciSety++;
            domaciGemy = 0;
            hosteGemy = 0;
        }
        if (hosteGemy == 6 && domaciGemy <= 4){
            hosteSety++;
            domaciGemy = 0;
            hosteGemy = 0;
        }

        if ((domaciGemy - hosteGemy) > 1 ){
            domaciSety++;
            domaciGemy = 0;
            hosteGemy = 0;
        }
        if ((hosteGemy - domaciGemy) > 1 ){
            hosteSety++;
            domaciGemy = 0;
            hosteGemy = 0;
        }
    }







        System.out.print("  " + " Domací "+ " : " + "Hosté" + "\n");
        if(domaciHry == 100 && hosteHry == 100){
            System.out.print("Hry  " + vyhoda + " : " + vyhoda + "\n");
        }else if(domaciHry == 100){
            System.out.print("Hry  " + vyhoda + " : " + hosteHry + "\n");
        }else if(hosteHry == 100){
            System.out.print("Hry  " + domaciHry + " : " + vyhoda + "\n");
        }else if(domaciHry <= 40){
            System.out.println("Hry  " + domaciHry + " : " + hosteHry + "\n");
        }else if(hosteHry <= 40){
            System.out.println("Hry  " + domaciHry + " : " + hosteHry + "\n");
        }

        System.out.println("Gemy " + domaciGemy + " : " + hosteGemy + "\n");
        System.out.println("Sety " + domaciSety + " : " + hosteSety + "\n");


            //    Sety

            if (domaciSety == 2) {
                System.out.print("domaci vyhrali " + domaciSety + " : " + hosteSety + "\n");
                break;
            }

            if (hosteSety == 2){
                System.out.print("hoste vyhrali " + hosteSety + " : " + domaciSety + "\n");
                break;
            }

        }while (domaciSety != 2 || hosteSety != 2);




    }
}
