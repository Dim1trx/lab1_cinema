package cinema;

import ui.Mapa;
import ui.Menu;

import java.util.Map;

public class Opcoes {
    Menu menu;
    Mapa mapa;
    public Opcoes(){
        this.menu = new Menu();
        this.mapa = new Mapa();
    }

    public void imprimeMenu(){
        menu.imprimeMenu();
    }

    public void imprimeMapa(){
        mapa.imprimeAssentos();
    }
    public boolean compraIngresso(){
        return false;
    }
    public boolean cancelaIngresso(){
        return false;
    }

    public void imprimeQuantidade(){
        mapa.imprimeQuantidade();
    }

    public int converter(char letra){
        return -1;
    }
}
