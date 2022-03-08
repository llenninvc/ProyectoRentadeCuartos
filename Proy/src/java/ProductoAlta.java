/*
NOMBRE:
FECHE CREACION:7 de marzo de 2022
FECHA MODIFICACION:7 de marzo de 2022
DESCRIPCION: REGISTRO DE PRODUCTOS 
 */
import java.util.ArrayList;
import java.util.List;


public class ProductoAlta extends Producto{

     public ProductoAlta( String nombreproducto, String descripcdion,int precio) {
        this.nombreproducto = nombreproducto;
        this.descripcdion = descripcdion;
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
    
    
            public static void main(String[] args) {
       
        ProductoAlta pro1=new ProductoAlta("Leche","producto lacteo",25);
          ProductoAlta pro2=new ProductoAlta("Carne","producto animal",75);
            ProductoAlta pro3=new ProductoAlta("Atun","producto animal",12);
            
        List<ProductoAlta> listaProd=new ArrayList<ProductoAlta>();    
        listaProd.add(pro1);
        listaProd.add(pro2);
        listaProd.add(pro3);
        
        
        for(ProductoAlta contador: listaProd){
            System.out.println("\n"); 
           System.out.println(contador.getNombreproducto());  
           System.out.println(contador.getDescripcdion()); 
           System.out.println(contador.getPrecio()); 
            System.out.println("\n"); 
        }

    
    
}
}