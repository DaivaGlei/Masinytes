/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masinytes;

/**
 *
 * @author daiva
 */

  public class SportineMasina extends Masina {
    
    private boolean spoileris;

    public SportineMasina(String pavadinimas, int maxGreitis) {
        super(pavadinimas, maxGreitis);
        this.spoileris = false;
    }

    public boolean isSpoileris() {
        return spoileris;
    }

    public void setSpoileris(boolean spoileris) {
        this.spoileris = spoileris;
    }
    
    public void gazuok(int kiek) {
        if (this.spoileris) {
            super.gazuok(kiek);
        } else {
            super.gazuok(kiek * 2);
        }
    }
    
    public void stabyk(int kiek) {
        if (this.spoileris) {
            super.stabyk(kiek * 2);
        } else {
            super.stabyk(kiek);
        }
    }
}
  

