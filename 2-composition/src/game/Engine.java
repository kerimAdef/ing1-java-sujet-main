package game;

import io.Console;
import io.Keyboard;
import java.util.ArrayList;
import java.util.List;


public class Engine {
    private Console console;
    private Keyboard keyboard;
    private List <Integer> nombres;

    public Engine() {
        this.console = new Console();
        this.keyboard = new Keyboard();
        this.nombres = new ArrayList<>();
    }
    public void debut(){
        console.print("Entrer des nombres");

        while (true){
            int nombre = keyboard.readInt();
            if (nombre<0){
                break;
            }
            nombres.add(nombre);
        }
        double moyenne = calculMoyenne();
        console.print("la moyenne est : " +moyenne);
    }

    private double calculMoyenne(){
        if(nombres.isEmpty()){
            return 0;
        }
        int somme =0;
        for (int nombre : nombres){
            somme+=nombre;
        }

        return (double) somme/ nombres.size();
    }
}
