package unidad4.utils;

public class Direccion {
    private String calle;
    private String ciudad;
    
    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
        }
    public void getGullAddress(){
        System.out.println(calle + ", " + ciudad);
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
