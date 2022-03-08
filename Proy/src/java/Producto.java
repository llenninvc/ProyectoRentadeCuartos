/*
NOMBRE:
FECHE CREACION:7 de marzo de 2022
FECHA MODIFICACION:7 de marzo de 2022
DESCRIPCION: REGISTRO DE PRODUCTOS 
 */
public class Producto  {
        String nombre, sexo, nombreproducto, descripcdion;
        int edad, precio;   
    
    public Producto(String nombre, String sexo, String nombreproducto, String descripcdion, int edad, int precio) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nombreproducto = nombreproducto;
        this.descripcdion = descripcdion;
        this.edad = edad;
        this.precio = precio;
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

    public Producto() {
    }
    
    
     

    
    
}
