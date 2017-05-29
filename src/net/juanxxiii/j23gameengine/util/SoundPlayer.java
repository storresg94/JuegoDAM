/*
Ejemplo de uso:
SoundPlayer bomb = new SoundPlayer(getClass().getResource("/sounds/bomb.wav"));
bomb.start(false);
*/
package net.juanxxiii.j23gameengine.util;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Paniagua
 */
public class SoundPlayer {

    Clip clip;
    AudioInputStream ais;
    public SoundPlayer(URL url) {
        try {
            this.clip = AudioSystem.getClip();
            this.ais = AudioSystem.getAudioInputStream(url);
            clip.open(ais);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(SoundPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(SoundPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SoundPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void start(boolean continuosly){
        clip.start();
        if (continuosly==true){
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }
    public void stop(){
        clip.stop();
    }
}
