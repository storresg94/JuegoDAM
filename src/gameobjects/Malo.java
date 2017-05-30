/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

/**
 *
 * @author dam
 */
public class Malo {
    private int vida;
    private int resistencia;
    private int danyo;
    private int x;
    private int y;
    private String sprite;

    public Malo(int vida, int resistencia, int danyo, int x, int y, String sprite) {
        this.vida = vida;
        this.resistencia = resistencia;
        this.danyo = danyo;
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDanyo() {
        return danyo;
    }

    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
    
    
}
