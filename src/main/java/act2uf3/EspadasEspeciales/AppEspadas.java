package act2uf3.EspadasEspeciales;

import java.sql.SQLOutput;

public class AppEspadas {
    public static void main(String[] args) {


        System.out.println("*************************//PARTE 1//***************************");
        System.out.println("///SIN DI///");
        EspadaNormal en=new EspadaNormal("Incinerator",25);

        System.out.println(en.accion());

        System.out.println("*************************//PARTE 2//***************************");
        System.out.println("///CON DI 1///");
        Efecto efect=new Efecto("Frost","Congela al enemigo");
        Espada2 es2=new Espada2("Frostfang",23,efect);

        System.out.println(es2.accion());


        System.out.println("*************************//PARTE 3//***************************");
        System.out.println("///CON DI 2///");
        Mejora m1=new Mejora("Sangrado","Provoca hemorragia");
        Mejora m2=new Mejora("Oscuridad","Ciega temporalmente al oponente");
        Espada3 es3=new Espada3("Eternity",21,m1);

        System.out.println(es3.accion());

        es3.setMejora(m2);

        System.out.println("nueva mejora:"+m2.getNombre());
        System.out.println(es3.accion());
    }
}
