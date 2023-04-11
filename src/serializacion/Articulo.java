package serializacion;

import java.io.Serializable;

/**
 * Clase basica de un articulo de ropa
 * id: Identiicador unico del objeto
 * nombre: Nombre personalizado del articulo
 * material: Material del que esta hecho
 * ocasion: Para que ocasion se usa el articulo, por ejemplo formal, deportiva, etc
 * tipo: La subclase que diferencia al articulo de los demas, por ejemplo camisa, chaqueta, etc
 * ubicacion: La dirrecion al archivo que contiene la imagen del articulo
 * @author Camilo Londoño Moreno
 */
abstract public class Articulo implements Serializable {
    private int id;
    private String nombre;
    private String material;
    private String ocasion;
    private String tipo;
    private String ubicacion;

    // Constructor si se dan todos los parametros
    public Articulo(int id, String nombre, String material, String ocasion,
            String tipo, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.material = material;
        this.ocasion = ocasion;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOcasion() {
        return ocasion;
    }

    public void setOcasion(String ocasion) {
        this.ocasion = ocasion;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return id + ": " + tipo + " de " + material + " para " + ocasion;
    }
    
    
    
}
