/*
NOMBRE:
FECHE CREACION:7 de marzo de 2022
FECHA MODIFICACION:7 de marzo de 2022
DESCRIPCION: REGISTRO DE PRODUCTOS 
 */
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.SourceVersion;

public class Persona extends usuario {

    public Persona() {

    }

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcdion() {
        return descripcdion;
    }

    public void setDescripcdion(String descripcdion) {
        this.descripcdion = descripcdion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {

        Persona usu1 = new Persona("Mateos", "hombre", 57);
        Persona usu2 = new Persona("Shina", "mujer", 18);
        Persona usu3 = new Persona("Juan", "hombre", 21);

        List<Persona> listaUsuarios = new ArrayList<Persona>();
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);

        for (Persona contador : listaUsuarios) {
            System.out.println("\n");
            System.out.println("NOMBRE:" + contador.getNombre());
            System.out.println("SEXO:" + contador.getSexo());
            System.out.println("EDAD:" + contador.getEdad());
            System.out.println("\n");
        }

        ProductoAlta pro1 = new ProductoAlta("Leche", "producto lacteo", 25);
        ProductoAlta pro2 = new ProductoAlta("Carne", "producto animal", 75);
        ProductoAlta pro3 = new ProductoAlta("Atun", "producto animal", 12);

        List<ProductoAlta> listaProd = new ArrayList<ProductoAlta>();
        listaProd.add(pro1);
        listaProd.add(pro2);
        listaProd.add(pro3);

        for (ProductoAlta contador : listaProd) {
            System.out.println("\n");
            System.out.println("NOMBRE:" + contador.getNombreproducto());
            System.out.println("DESCRIPCION:" + contador.getDescripcdion());
            System.out.println("PRECIO:$" + contador.getPrecio() + " pesos.");
            System.out.println("\n");
        }

    }

}
