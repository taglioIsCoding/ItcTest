/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 72873486
 */
public class prismaEsagonale extends Esagono {
    
    private double h;
    private double supLaterale;
    private double supTotale;
    private double volume;
    
     prismaEsagonale(double lato, double h) {
        super(lato);
        this.h = h;
    }

    

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    

    public double getH() {
        return h;
    }

    public double getSupLaterale() {
        return supLaterale;
    }

    public double getSupTotale() {
        return supTotale;
    }

    public double getVolume() {
        return volume;
    }public void calcolaSupLaterale() {
        this.supLaterale = this.perimetro * h ;
    }

    public void calcolaSupTotale() {
        this.supTotale = (this.area * 2) * this.supLaterale ;
    }

    public void calcolaVolume() {
        this.volume = this.area * h;
    }
    
    
    public void printPris()
    {
        System.out.println("l'area del prisma vale : "+ this.area);
        System.out.println("l'apotema del prisma vale : "+ this.apotema);
        System.out.println("il perimetro del prisma vale : "+ this.perimetro);
        System.out.println("l'area laterale del prisma vale : "+ this.supLaterale);
        System.out.println("l'area totale del prisma vale : "+ this.supTotale);
        System.out.println("il volume del prisma vale : "+ this.volume);
    }
    
    
    
    
}
