package act2uf3.EspadasEspeciales;

public class Efecto {
    private String nombre;// nombre del efecto(fuego hielo etc)
    private String descripcion;// que hace
    private int dmgExtra=5;


    public Efecto(String nombre, String descripcion) {
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
    public String accion(){
        String x="Este efecto da un daño extra de :"+this.dmgExtra+ ". Ademas de: "+getDescripcion();
        return x;
    }
}
