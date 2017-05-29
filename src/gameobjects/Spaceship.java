package gameobjects;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.GameEngine;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 * Nave espacial
 * @author Paniagua
 */
public class Spaceship implements Runnable{
    private static final int STOP=-1;
    private static final int UP=0;
    private static final int DOWN=1;
    private static final int RIGHT=2;
    private static final int LEFT=3;
    
    private int direccion=STOP;
    
    private BufferedImage nave;//Nave espacial
    private int xNave = 0;//Posición x de la nave
    private int yNave = 0;//Posición y de la nave
    private int speedNave = 3;//Velocidad de la nave
    
    public Spaceship() throws IOException{
        //Cargamos la imagen
        nave = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/spaceship.png"));
        //Inicializamos posiciones
        xNave = (GameEngine.screenWidth-nave.getWidth())/2;
        yNave = GameEngine.screenHeight-nave.getHeight()*2;
    }

    public BufferedImage getNave() {
        return nave;
    }

    public void setNave(BufferedImage nave) {
        this.nave = nave;
    }

    public int getxNave() {
        return xNave;
    }

    public void setxNave(int xNave) {
        this.xNave = xNave;
    }

    public int getyNave() {
        return yNave;
    }

    public void setyNave(int yNave) {
        this.yNave = yNave;
    }

    public int getSpeedNave() {
        return speedNave;
    }

    public void setSpeedNave(int speedNave) {
        this.speedNave = speedNave;
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

    @Override
    public void run() {
        while (true){
            switch(direccion){
                case UP:
                    yNave--;
                    break;
                case DOWN:
                    yNave++;
                    break;
                case RIGHT:
                    xNave++;
                    break;
                case LEFT:
                    xNave--;
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
