/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.image.BufferedImage;

/**
 *
 * @author Nexodar
 */
public class Zombie extends Malo{
    
    public Zombie(int vida, int resistencia, int danyo, int x, int y, BufferedImage sprite) {
        super(vida, resistencia, danyo, x, y, sprite);
    }
    
}
