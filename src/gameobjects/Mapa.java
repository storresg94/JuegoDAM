/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.image.BufferedImage;
import static java.lang.Thread.sleep;

/**
 *
 * @author dam
 */
public class Mapa implements Runnable{
    private static final int STOP=-1;
    private static final int UP=0;
    private static final int DOWN=1;
    private static final int RIGHT=2;
    private static final int LEFT=3;
    
    private int direccion=STOP;
    
    private int x;
    private int y;
    protected BufferedImage sprite;

    public Mapa(int x, int y, BufferedImage sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
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

    @Override
    public void run() {
       while (true){
            switch(direccion){
                case UP:
                    y++;
                    break;
                case DOWN:
                    y--;
                    break;
                case RIGHT:
                    x--;
                    break;
                case LEFT:
                    x++;
                    break;
            }
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                //Irrelevante, no hacemos nada
            }
        }
    }
}
    
    

