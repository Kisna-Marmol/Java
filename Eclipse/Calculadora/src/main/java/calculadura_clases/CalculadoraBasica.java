/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadura_clases;

/**
 *
 * @author Kisna-Marmol
 */
public class CalculadoraBasica {
    private int num1 = 0, num2 = 0;
    private int suma = 0, resta = 0, multiplicacion = 0;
    private double division = 0.0, porcentaje = 0;
    
    public CalculadoraBasica(){
        
    }
    
    public CalculadoraBasica(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

     public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getSuma() {
        return suma = this.num1 + this.num2;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta= this.num2 - this.num1;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion = this.num1 * this.num2;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public double getDivision() {
        if (this.num2 != 0) {
            this.division = (double) this.num1 / this.num2;
        } else {
            System.out.println("Error: División por cero no permitida.");
            this.division = 0;
        }
        return this.division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public double getPorcentaje() {
        if (this.num2 != 0) {
            this.porcentaje = ((double) this.num1 / this.num2) * 100;
        } else {
            System.out.println("Error: División por cero no permitida.");
            this.porcentaje = 0;
        }
        return this.porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
