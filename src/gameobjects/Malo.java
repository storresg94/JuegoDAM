/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.image.BufferedImage;

/**
 *
 * @author dam
 */
public abstract class Malo {
    protected int vida;
    protected int resistencia;
    protected int danyo;
    protected int x;
    protected int y;
    protected BufferedImage sprite;

    public Malo(int vida, int resistencia, int danyo, int x, int y, BufferedImage sprite) {
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

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }
    
    public abstract void recibirImpacto();
}
