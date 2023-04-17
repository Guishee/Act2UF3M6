package act2uf3.EspadasEspeciales;

public class Espada3 {
    private String nombre;
    private String descripcion="Soy un mandoble normal";
    private int dmg=0;
    private Mejora mejora;

    public Espada3(String nombre, int dmg, Mejora mejora) {
        this.nombre = nombre;
        this.dmg = dmg;
        this.mejora = mejora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public Mejora getMejora() {
        return mejora;
    }

    public void setMejora(Mejora mejora) {
        this.mejora = mejora;
    }

    public String accion(){//utiliza la funcion dentro del efecto para enseñar sus estadisticas.
        System.out.println("Se ha sumado +"+mejora.getDmgExtra()+"al daño base de "+this.nombre);
        setDmg(getDmg()+mejora.getDmgExtra());
        String x=this.nombre+" tiene "+this.mejora.getNombre()+", "+this.mejora.accion();
        return x;
    }
}
