/*metodai:
gazuok(kiek) negali virsyti maxGreitis
stabdyk(kiek) negali vaziuoti atbulai
vaziuok() - pavaziuoja tiek, koks siuo metu yra greitis
getteriai/setteriai (kue reikia)

*/
package masinytes;


public class Masinytes {

//public Masinytes(String pavadinimas, int maxGretis, int kelias, int greitis) {
//    }
  
    public static void main(String[] args) {
      
        Masina m = new Masina("fordas", 220, 100, 50 );
        Masina m1 = new Masina("fiat", 200, 90, 60);
        Masina m2 = new Masina("audi", 240, 80, 65);
        Masina m3 = new Masina("bmw", 250, 70, 80);
        Masina m4 = new Masina("vw", 220, 120, 78);
         
        Masina[] masinos = {m, m1, m2, m3, m4};
       
        for(int i = 0; i <masinos.length; i++) {
            System.out.println(masinos[i].getKelias());
        }
        }
        
    }
    

