/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 72873486
 */
public class Esagono {
    
    protected double  lato;
    protected double apotema;
    protected double perimetro;
    protected double area;

    public Esagono(double lato) {
        this.lato = lato;
        
    }

    public double getLato() {
        return lato;
    }

    public double getApotema() {
        return apotema;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public void calcolaApotema() {
        this.apotema =  lato * 0.866;
    }

    public void calcolaPerimetro() {
        this.perimetro = 6 * lato;
    }

    public void calcolaArea() {
        this.area = (perimetro * apotema)/2;
    }
    
    public void printEsa()
    {
        System.out.println("l'area dell'esagono vale : "+ this.area);
        System.out.println("l'apotema dell'esagono vale : "+ this.apotema);
        System.out.println("il perimetro dell'esagono vale : "+ this.perimetro);
    }
    
    
    
    
}
