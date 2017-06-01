/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.image.BufferedImage;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nexodar
 */
public class Zombie extends Malo implements Runnable{
    
    public Zombie(int vida, int resistencia, int danyo, int x, int y, BufferedImage sprite) {
        super(vida, resistencia, danyo, x, y, sprite);
    }

    
    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        while(true){
            if (x > 820){
                x= -300;   
            }else{
                x++;
            }
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Zombie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
