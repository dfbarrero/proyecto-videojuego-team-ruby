package objetos.plantas;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Planta_rayo extends Planta{
    private String nombre = "Planta de rayo";
    private Image icono;
    
    public Planta_rayo() throws SlickException{
        super("./resources/objetos/plantas/Planta_rayo.png", 25);
        icono = new Image("./resources/objetos/plantas/Icono_planta_rayo.png");
    }

    @Override
    public void plantar(float pos_x, float pos_y){
        super.setCoordenadas(pos_x, pos_y);
        super.setPlantada(true);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public Image getIcono(){
        return icono;
    }
    
    public int getDanio(){
        return super.getDanio();
    }
}

