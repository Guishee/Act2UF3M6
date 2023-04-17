package act2uf3.EspadasEspeciales;

public class Mejora implements MejoraInterf {
    private String nombre;//veneno,sangrado,filo etc...
    private String descripcion;//que hace la mejora
    private int dmgExtra=3;

    public Mejora(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getDmgExtra() {
        return dmgExtra;
    }

    public void setDmgExtra(int dmgExtra) {
        this.dmgExtra = dmgExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String accion() {
        String x="Esta mejora da un daño extra de :"+this.dmgExtra+ ". Ademas de: "+getDescripcion();
        return x;
    }
}
