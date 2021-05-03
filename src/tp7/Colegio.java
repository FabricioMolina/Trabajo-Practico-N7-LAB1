
package tp7;

import Entidades.*;

public class Colegio {

 
    public static void main(String[] args) {
        Materia ej = new Materia(1, "Ingles",1);
        Materia ej2 = new Materia(2, "Matematicas",1);
        Materia ej3 = new Materia(3, "Laboratorio 1",1);
        
        Alumnos al = new Alumnos(1001, "Lopez", "Martin");
        Alumnos al2 = new Alumnos(1002, "Martinez", "Brenda");
        
        al.agregarMateria(ej);
        al.agregarMateria(ej2);
        al.agregarMateria(ej3);
        System.out.println("Lopez esta inscripto en: " +al.cantidadMaterias());
        System.out.println(al.buscarMateria(ej));
        
        al2.agregarMateria(ej);
        al2.agregarMateria(ej2);
        al2.agregarMateria(ej3);
        al2.agregarMateria(ej3);
        System.out.println("Martinez esta inscripto en: "+al2.cantidadMaterias());
    }
    
}
