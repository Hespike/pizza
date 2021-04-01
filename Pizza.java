public class Pizza {
    static int pizzaszallitas(Rendeles[] rendelesek, int darabszam) {
    int osszeg = 0;

    for (int i = 0; i < darabszam; i++){
        int ido = 60 - rendelesek[i].elkeszitesiIdo;
        double szuksegessebesseg = rendelesek[i].tavolsag / (ido / 60.0);

        int mozgasiSebesseg = (rendelesek[i].idopont == 8 || rendelesek[i].idopont == 16 || rendelesek[i].idopont == 17) ? 25 : 40;
        if (szuksegessebesseg > mozgasiSebesseg) {
            osszeg -= 2 * rendelesek[i].ar;
        } else {
            osszeg += rendelesek[i].ar;
        }
    }

        return osszeg;
    }

}
