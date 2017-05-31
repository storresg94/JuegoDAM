package gameobjects;

public class Prota {

    private int vida;
    private int danyo;
    private int y;
    private int x;
    private String sprite;

    public Prota(int vida, int danyo, int y, int x, String sprite) {
        this.vida = vida;
        this.danyo = danyo;
        this.y = y;
        this.x = x;
        this.sprite = sprite;
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

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public void aumentarDanyo(int arma) {
        this.danyo = this.danyo + arma;
    }

}
