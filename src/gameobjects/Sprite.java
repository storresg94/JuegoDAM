/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;
import static net.juanxxiii.j23gameengine.gui.JPGameScreen.frames;
import static net.juanxxiii.j23gameengine.gui.JPGameScreen.image_name;
import static net.juanxxiii.j23gameengine.gui.JPGameScreen.image_x;
import static net.juanxxiii.j23gameengine.gui.JPGameScreen.image_y;

/**
 *
 * @author dam
 */
public class Sprite {

    private int frames;
    private int image_x;
    private int image_y;
    private String image_name;

    public Sprite(int frames, int image_x, int image_y, String image_name) {
        this.frames = frames;
        this.image_x = image_x;
        this.image_y = image_y;
        this.image_name = image_name;
    }

    public void pintar(Graphics2D g2d) throws IOException {
        BufferedImage bg;

        try {
            bg = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/" + image_name));
            for (int i = 0; i < 5; i++) {
                if (i == 0) {

                    g2d.drawImage(bg, 0, 0, image_x, image_y, 0, 0, image_x, image_y, null);
                    sleep(frames);

                } else if (i == 4) {
                    g2d.drawImage(bg, 0, 0, image_x, image_y, image_x * 3, 0, image_x * 4, image_y, null);
                    sleep(frames);
                } else {
                    g2d.drawImage(bg, 0, 0, image_x, image_y, image_x * (i+1), 0, image_x * (i+1), image_y, null);
                    sleep(frames);

                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
