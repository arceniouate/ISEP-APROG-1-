/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author arccenio
 */
public class Tempo {
    private static final int  VALORoMISSAO=0;
    private int  min;
    private int horas;
    private int segundos;

    public Tempo() {
    }

    public Tempo(int min, int horas, int segundos) {
        this.min = VALORoMISSAO;
        this.horas = VALORoMISSAO;
        this.segundos = VALORoMISSAO;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
}
