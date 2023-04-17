package act2uf3.EspadasEspeciales;

public class Espada2 {
    private String nombre;
    private String descripcion="Soy un mandoble normal";
    private int dmg=0;
    private Efecto ef;

    public Espada2(String nombre, int dmg, Efecto ef) {
        this.nombre = nombre;
        this.dmg = dmg;
        this.ef = ef;
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

    public Efecto getEf() {
        return ef;
    }

    public void setEf(Efecto ef) {
        this.ef = ef;
    }

    public String accion(){//utiliza la funcion dentro del efecto para enseñar sus estadisticas.
        System.out.println("Se ha sumado +"+ef.getDmgExtra()+"al daño base de "+this.nombre);
        setDmg(getDmg()+ef.getDmgExtra());
        String x=this.nombre+" tiene "+this.ef.getNombre()+", "+this.ef.accion();
        return x;
    }
}
