/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.frankie.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankie.entidades.Ingrediente;
import mx.itson.frankie.entidades.Paso;
import mx.itson.frankie.entidades.Receta;
import mx.itson.frankie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setDuracion(62);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");

        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de agua");
        
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
        //Agregar pasos Tarea
        List<Paso> pasos = new ArrayList<>();
        
        Paso pasos1 = new Paso();
        pasos1.setDescripcion("1.  Horno precalentado a 180 °C.");

        Paso pasos2 = new Paso();
        pasos2.setDescripcion("2.  Mezcla la harina para brownies chocolate Fudge de Betty Crocker® con el agua, el aceite y los huevos. Vierte la mezcla en un molde cuadrado de 30 x 20 cm previamente en harinado y hornea a 180 °C durante 25 minutos. Retira del horno y enfría.");
        
        Paso pasos3 = new Paso();
        pasos3.setDescripcion("3.  Bate el queso crema con la Leche Condensada LA LECHERA®, la ralladura de limón, la mantequilla y un poco de colorante hasta integrar por completo y refrigera por 20 minutos.");
        
        pasos.add(pasos1);
        pasos.add(pasos2);
        pasos.add(pasos3);
        
        receta.setPasos(pasos);
        
        receta.setDificultad(Dificultad.LEGENDARIO);
        
    }
    }
    

