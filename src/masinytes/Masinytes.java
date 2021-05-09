
package masinytes;


public class Masinytes {

    public Masinytes(String pavadinimas, int maxGretis) {
    }

  
    public static void main(String[] args) {
      
        Masina m = new Masina("fordas", "fiant" );
        Masina m1 = new Masina("fiat", "punto");
        Masina m2 = new Masina("audi", "a4");
        Masina m3 = new Masina("bmw", "x6");
        Masina m4 = new Masina("vw", "passat");
         
        Masina[] masinos = {m, m1, m2, m3, m4};
       
     
        for(int i = 0; i <masinos.length; i++) {
            System.out.println(masinos[i].getPavadinimas());
        }
        }
        
    }
    

