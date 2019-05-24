/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 72873486
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Esagono es = new Esagono(5);
        es.calcolaApotema();
        es.calcolaPerimetro();
        es.calcolaArea();
        es.printEsa();
        
        prismaEsagonale a = new prismaEsagonale(5 , 4);
        a.calcolaApotema();
        a.calcolaPerimetro();
        a.calcolaArea();
        a.calcolaSupLaterale();
        a.calcolaSupTotale();
        a.calcolaVolume();
        a.printPris();
        
        
    }
    
}
