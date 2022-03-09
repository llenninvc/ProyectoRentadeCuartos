
/*
NOMBRE:
FECHE CREACION:8 de marzo de 2022
FECHA MODIFICACION:8 de marzo de 2022
DESCRIPCION: conectar a BD
git:https://github.com/llenninvc/RentaCuartos.git
 */
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class BD {

    private String url;
    private String pwd;
    private String user;
    private String conexion;
    
    public BD(){
        
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public Connection conectar() {
        Connection conexion = null;
        String host = "localhost";
        String user = "postgres";
        String pwd = "cristian20";
        String bd = "Casos";
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://" + host + "/" + bd, user, pwd);
        } catch (Exception ex) {
            System.out.println("error:" + ex.getMessage());
        }
        return conexion;

    }

    private void desconectar() throws SQLException {
        BD conexion = new BD();
        conexion.conectar().close();
    }

    public static void main(String[] args) {

        BD conexion = new BD();

        try {

            PreparedStatement ps = conexion.conectar().prepareStatement("insert into  productos(nombre,descripcion,precio) values(?,?,?);");

            ps.setString(1, "Leche");
            ps.setString(2, "producto lacteo");
            ps.setInt(3, 25);
            ps.execute();
            ps.setString(1, "Carne");
            ps.setString(2, "producto animal");
            ps.setInt(3, 75);
            ps.execute();
            ps.setString(1, "Atun");
            ps.setString(2, "producto animal");
            ps.setInt(3, 12);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            conexion.desconectar();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Object[] ob = new Object[3];
        try {
            Statement ps = conexion.conectar().createStatement();
            ResultSet rs = ps.executeQuery("select * from productos");
            System.out.println("-------------TABLA DE PRODUCTOS----------------------\n");
            while (rs.next()) {
                ob[0] = rs.getObject("nombre");
                ob[1] = rs.getObject("descripcion");
                ob[2] = rs.getObject("precio");
                System.out.println("" + Arrays.toString(ob) + " : ");
                System.out.println("\n");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        ////////////////////////////////////////

        try {

            PreparedStatement ps = conexion.conectar().prepareStatement("insert into  usuarios(nombre,sexo,edad) values(?,?,?);");

            ps.setString(1, "Mateos");
            ps.setString(2, "hombre");
            ps.setInt(3, 57);
            ps.execute();
            ps.setString(1, "Shina");
            ps.setString(2, "mujer");
            ps.setInt(3, 18);
            ps.execute();
            ps.setString(1, "Juan");
            ps.setString(2, "hombre");
            ps.setInt(3, 21);
            ps.execute();
            conexion.desconectar();
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Object[] obj = new Object[3];
        try {
            Statement ps = conexion.conectar().createStatement();
            ResultSet rs = ps.executeQuery("select * from usuarios");
            System.out.println("<<<-------------TABLA DE USUARIOS---------------------->>>>\n");
            while (rs.next()) {
                obj[0] = rs.getObject("nombre");
                obj[1] = rs.getObject("sexo");
                obj[2] = rs.getObject("edad");
                System.out.println("" + Arrays.toString(obj) + " : ");
                System.out.println("\n");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
