/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigovasquez_lab5p2;

/**
 *
 * @author Rui
 */
public class Personaje {
    private String name, poder, debilidad, universo;
    private int fuerza, agilidadMental, agilidadFisica, HP;

    public Personaje() {
    }

    public Personaje(String name, String poder, String debilidad, String universo, int fuerza, int agilidadMental, int agilidadFisica, int HP) {
        this.name = name;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidadMental = agilidadMental;
        this.agilidadFisica = agilidadFisica;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String toString2() {
        return "[Poder -> " + poder + ']' + 
                "[Debilidad -> " + debilidad + ']' +
                "[Universo -> " + universo + ']' +
                "[Fuerza -> " + fuerza + ']' +
                "[Agilidad Mental -> " + agilidadMental + ']' +
                "[Agilidad Física -> " + agilidadFisica + ']' +
                "[HP -> " + HP + ']';
    }
    
    public String toString() {
        return name;
    }
}
