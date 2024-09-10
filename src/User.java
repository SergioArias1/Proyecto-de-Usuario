public class User {

    private String nombre;

    private String telefono;

    private String email;

    private int ID;

    public User (String nombre, String telefono, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getEmail(){
        return this.email;  //otro push
    }
    public int getID(){
        return ID;
    }

    // un nuevo push




}