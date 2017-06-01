package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static java.lang.Thread.sleep;

public class Prota implements Runnable{
    private static final int STOP=-1;
    private static final int UP=0;
    private static final int DOWN=1;
    private static final int RIGHT=2;
    private static final int LEFT=3;
    
    private int direccion=STOP;

    private int vida;
    private int danyo;
    private int y;
    private int x;
    private BufferedImage sprite;

    public Prota(int vida, int danyo, int y, int x, BufferedImage sprite) {
        this.vida = vida;
        this.danyo = danyo;
        this.y = y;
        this.x = x;
        this.sprite = sprite;
    }
    public void pintar(Graphics2D g2d){
        g2d.drawImage(sprite, x, y, null);
    }

    public void moveUp(){
        direccion=UP;
    }
    public void moveDown(){
        direccion=DOWN;
    }
    public void moveRight(){
        direccion=RIGHT;
    }
    public void moveLeft(){
        direccion=LEFT;
    }
    
    public void stop(){
        direccion=STOP;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanyo() {
        return danyo;
    }

    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public void aumentarDanyo(int arma) {
        this.danyo = this.danyo + arma;
    }

    @Override
    public void run() {
        while (true){
            switch(direccion){
                case UP:
                    y--;
                    break;
                case DOWN:
                    y++;
                    break;
                case RIGHT:
                    x++;
                    break;
                case LEFT:
                    x--;
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
