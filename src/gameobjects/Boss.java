/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.image.BufferedImage;

/**
 *
 * @author rgc
 */
public class Boss extends Malo {
    
    public Boss(int vida, int resistencia, int danyo, int x, int y, BufferedImage sprite) {
        super(vida, resistencia, danyo, x, y, sprite);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
