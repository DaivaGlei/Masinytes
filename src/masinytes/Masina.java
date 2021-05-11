/*
 Masinyciu lenktynes

Sukurti klase Masina su tokiom savybem:
pavadinimas (String)
maxGreitis (int)
kelias (int)
greitis (int)
metodai:
gazuok(kiek) negali virsyti maxGreitis
stabdyk(kiek) negali vaziuoti atbulai
vaziuok() - pavaziuoja tiek, koks siuo metu yra greitis
getteriai/setteriai (kue reikia)


main:
lenktynes (8 masinos)
kiekvieno ciklo metu
kiekvienai masinai nusprendiam ar ji gazuos (0.8) ar stabdys (0.2)
gazuoja 1..10
stabdo 1..5
kas 100 km atspausdinti lyderi
lenktynes baigiasi, kai kuri nors masina pasiekia 1000 km


surusiuoti visas masinas pagal nuvaziuota kelia
ir atspausdinti turnyrine lentele


*******
Sukurti klase SportineMasina (pavedeta nuo Masina)
papildomai turi savybe:
spoileris (pakeltas - true/ nuleistas - false)


jei spoileris pakeltas - masina stabdo 2x greiciau
jei spoileris nuleistas- masina stabdo kaip eiline masina


jei spoileris pakeltas - masina gazuoja kaip eiline masina
jei spoileris nuleistas- masina gazuoja 2x greiciau


main:
lenktyniauja 6 paprastos ir 2 sportine masinos
kiekvieno ciklo metu
jei tai yra sportine masina:
50/50 turi pakelti arba nuleist spoileri
 */
package masinytes;


public class Masina {
   

    private String pavadinimas;
    private int maxGreitis;
    private int greitis;
    private int kelias;

    public Masina(String pavadinimas, int maxGreitis) {
        this.pavadinimas = pavadinimas;
        this.maxGreitis = maxGreitis;
        this.greitis = 0;
        this.kelias = 0;
    }

    Masina(String fordas, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getMaxGreitis() {
        return maxGreitis;
    }

    public int getGreitis() {
        return greitis;
    }

    public int getKelias() {
        return kelias;
    }

    public void gazuok(int kiek) {
        if (kiek < 0) {
            return;
        }
        this.greitis += kiek;
        if (this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }
    }

    public void stabyk(int kiek) {
        if (kiek < 0) {
            return;
        }
        this.greitis -= kiek;
        if (this.greitis < 0) {
            this.greitis = 0;
        }
    }
    
    public void vaziuok() {
        this.kelias += this.greitis;
    }

    @Override
    public String toString() {
        return "Masina{" + "pavadinimas=" + pavadinimas + ", maxGreitis=" + maxGreitis + ", greitis=" + greitis + ", kelias=" + kelias + '}';
    }
    
}


//    
//    private String pavadinimas;
//    private int maxGreitis;
//    private int kelias;
//    private int greitis;
//    
//     public Masina(String pavadinimas, int maxGreitis, int kelias, int greitis) {
//        this.pavadinimas = pavadinimas;
//        this.maxGreitis = maxGreitis;
//        this.kelias = kelias;
//        this.greitis = greitis;
//    }
//
//    public String getPavadinimas() {
//        return pavadinimas;
//    }
//
//    public int getmaxGreitis() {
//        return maxGreitis;
//    }
//
//    public void setPavadinimas(String pavadinimas) {
//        this.pavadinimas = pavadinimas;
//    }
//
//    public void setMaxGreitis(int maxGreitis) {
//        this.maxGreitis = maxGreitis;
//    }
//
//    public int getKelias() {
//        return kelias;
//    }
//
//    public int getGreitis() {
//        return greitis;
//    }
//
//    public void setKelias(int kelias) {
//        this.kelias = kelias;
//    }
//
//    public void setGreitis(int greitis) {
//        this.greitis = greitis;
//    }
//
//   
//    }
//   

