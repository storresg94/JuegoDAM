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
      public int getVida() {
        return vida;
    }
    public void setVida(int Vida){
        this.vida = 5;
    }
    
     public void setDanyo(int Danyo){
        this.danyo = 0;
    }
     
      public void setX(int X){
        this.x = 5;
    }
       public void setY(int Y){
        this.y = 5;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }
       
   
    
 
    
   
    
}
