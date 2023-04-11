package serializacion;

import java.util.LinkedList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class Serializacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        generarListaPrueba();
        
        // Para leer una lista enlazada de objetos en memoria
        LinkedList<Articulo> miRopa = leerObjeto();
        System.out.println(miRopa.size());
    }
    
    public static void generarListaPrueba() {
        Superior obj;
        LinkedList<Articulo> ropa = new LinkedList<>();
        String[] materiales = {"Algodon", "Poliester", "Lino", "Lana",
            "Seda", "Nylon", "Lycra", "Jean"};
        String[] ocaciones = {"diario", "formal", "deportiva", "dormir", "fiesta",
            "playa", "calor", "frio"};
        String[] tipos = {"Blusas", "Chaquetas", "Camiseta", "Top", "Jersey",
            "Sueter", "Esqueletos", "Camisas", "Sudaderas", "Polos", "Chalecos"};
        Random rand = new Random();
        int limite = 10;
        int i = 1;
        while (i <= limite) {
            obj = new Superior(
                    i,
                    "Articulo Numero: " + Integer.toString(i),
                    materiales[rand.nextInt(materiales.length)],
                    ocaciones[rand.nextInt(ocaciones.length)],
                    tipos[rand.nextInt(tipos.length)],
                    ""
            );
            ropa.addLast(obj);
            i++;
        }
        guardarObjeto(ropa);
    }
    
    public static void guardarObjeto(LinkedList<Articulo> ropa) {
        try {
            try (var writeFile = new ObjectOutputStream(new FileOutputStream("./src/datos1.dat"))) {
                writeFile.writeObject(ropa);
                System.out.println("Objeto guardado con exito.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static LinkedList<Articulo> leerObjeto() {
        LinkedList<Articulo> ropa;
        try {
            
            try (var readFile = new ObjectInputStream(new FileInputStream("./src/datos.dat"))) {
                ropa = (LinkedList)readFile.readObject();
            }
            return ropa;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            ropa = new LinkedList<>();
            return ropa;
        }
    }
    
}


