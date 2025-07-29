package facturaApp;

public class Client {

    private String rfc;
    private String nombre;

    public Client(String rfc, String nombre) {
        this.rfc = rfc;
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public String getNombre() {
        return nombre;
    }
}
