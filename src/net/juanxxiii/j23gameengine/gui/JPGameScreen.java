/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.gui;

import gameobjects.Boss;
import gameobjects.EnemigoMediano;
import gameobjects.Mapa;
import gameobjects.Prota;
import gameobjects.Spaceship;
import gameobjects.Zombie;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.GameEngine;
import net.juanxxiii.j23gameengine.util.SoundPlayer;

/**
 *
 * @author Profesor
 */
public class JPGameScreen extends javax.swing.JPanel implements Runnable, MouseListener {

    Graphics2D g2d;
    BufferedImage bg;//Imagen de fondo
    Spaceship nave;//Imagen de fondo
    
    Zombie zombie;
    Boss jefe;
    EnemigoMediano mediano;
    Prota prota;
    Mapa map;
    

    /**
     * Creates new form JPGameScreen
     */
    public JPGameScreen() {
      
        
        
        initComponents();
        //Cargamos los recursos
        loadResources();
        //Hacemos que el panel sea 'focusable' para aceptar eventos
        this.setFocusable(true);
        //Creamos los listener
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //El keyboard no dispara este evento
                switch (e.getKeyCode()){
                    case 38:
                        //Key up
                        break;
                    case 40:
                        //Key down
                        break;
                    case 39:
                        //Key right
                        break;
                    case 37:
                        //Key left
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case 38:
                        //Key up
                        map.setX(map.getX()+10);
                        prota.moveUp();
                        break;
                    case 40:
                        //Key down
                        map.setX(map.getX()-10);
                        prota.moveDown();
                        break;
                    case 39:
                        //Key right
                        map.setY(map.getY()+10);
                        prota.moveRight();
                        break;
                    case 37:
                        //Key left
                        map.setY(map.getY()-10);
                        prota.moveLeft();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()){
                    case 38:
                        //Key up
                        prota.stop();
                        break;
                    case 40:
                        //Key down
                        prota.stop();
                        break;
                    case 39:
                        //Key right
                        prota.stop();
                        break;
                    case 37:
                        //Key left
                        prota.stop();
                        break;
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setPaint(Color.WHITE);
        //Pinta la pantalla de blanco
        g2d.fillRect(0, 0, this.getBounds().width, this.getBounds().height);
        //Pinta el fondo
        g2d.drawImage(bg, 0, 0, null);
        //Pinta los elementos
        jefe.pintar(g2d);
        mediano.pintar(g2d);
        zombie.pintar(g2d);
        prota.pintar(g2d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        //Asigna el foco si es necesario
        if (requestFocusInWindow()==false) {
            setFocusable(true);
        }
        //GAME LOOP - REPINTA A 60FPS
        while (true) {
            repaint();
            try {
                sleep(16);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    /**
     * Carga los recursos del videojuego
     */
    private void loadResources(){
        try {
            bg=ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/doom.gif"));      
            prota = new Prota(100, 20, 350, 10, bg );
            bg=ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloMaloso.png"));      
            jefe = new Boss(100, 100, 100, 100, 100, bg );
            bg=ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/Zombie.png"));      
            zombie = new Zombie(10, 0, 80, 300, 300, bg );
            bg=ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/CaballeroOscuro.png"));      
            mediano = new EnemigoMediano(50, 50, 50, 50, 50, bg );
            bg = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/bg.png"));
            map= new Mapa(30, 200, bg);
            new Thread(prota).start();
            new Thread(jefe).start();
            new Thread(mediano).start();
            new Thread(zombie).start();
            new Thread(map).start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mediano.pintar(g2d);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
