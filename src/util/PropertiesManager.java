/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import net.juanxxiii.j23gameengine.GameEngine;

/**
 *
 * @author Paniagua
 */
public class PropertiesManager {
    /**
     * Carga el fichero de properties y asigna valor a las variables del juego
     * 
     * @throws IOException Indica un error en la lectura del fichero (no encontrado)
     */
    public void loadProperties() throws IOException {
        InputStream inputStream=null;
        try {
            Properties prop = new Properties();
            String propFileName = "resources/config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream==null) {
                throw new IOException("Error al leer el fichero de properties");
            }
            prop.load(inputStream);
            GameEngine.screenTitle=prop.getProperty("screen_title");
            GameEngine.screenX = Integer.parseInt(prop.getProperty("screen_x"));
            GameEngine.screenY = Integer.parseInt(prop.getProperty("screen_y"));
            GameEngine.screenWidth = Integer.parseInt(prop.getProperty("screen_width"));
            GameEngine.screenHeight = Integer.parseInt(prop.getProperty("screen_height"));
        } catch (IOException e) {
            throw e;
        } finally {
            if (inputStream!=null) {
                inputStream.close();
            }
        }
    }
}
