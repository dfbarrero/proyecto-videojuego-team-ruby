package personajes;

import elementos.Hitbox;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Enemigo extends Personaje {

    private int nivel;
    private boolean combate;
    private Animacion_dinamica animacion;
    private int decisionMovAnteX = 0, decisionMovAnteY = 0;

    public Enemigo(String nombre, Hitbox hitbox, int nivel) throws SlickException {
        // TODO: modificar animación original por Animacion_dinamica cuando haya sprite
        super(nombre, hitbox, 100, 20);
        this.animacion = new Animacion_dinamica("./resources/sprites/Ruby.png"); //TODO pendiente de modificacion de la ruta
        this.nivel = nivel;
        this.combate = false;
    }

    public Enemigo(String nombre, Hitbox hitbox, Animacion_dinamica animacion, int vida, int dinero, int nivel) {
        super(nombre, hitbox, vida, dinero);
        this.nivel = nivel;
        this.combate = false;
        this.animacion = animacion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isCombate() {
        return combate;
    }

    public void setCombate(boolean combate) {
        this.combate = combate;
    }

    //Movimiento dinamico del enemigo
    public void movimientoEnemigo(GameContainer gc, int i) {
        switch ((int) (Math.random() * 3)) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }

    @Override
    public void renderPersonaje(GameContainer gc, float movEjeX, float movEjeY) {
        animacion.renderAnimacion(movEjeX, movEjeY, hitbox.getRectangulo().getX(), hitbox.getRectangulo().getY());
    }
}
