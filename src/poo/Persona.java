
package poo;

public class Persona {
    
    String nombre;
    int edad;
    String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        persona1.nombre = "WELLIS GILBERTO AREVALO CORDOVA";
        persona1.edad=29;
        persona1.direccion=" JIRON ALFONSO UGARTE N° 175 - JUANJUICILLO PARTE BAJA";
        
        Persona persona2 = new Persona();
        
        persona2.nombre = "CONSUELO CORDOVA LOZANO";
        persona2.edad=62;
        persona2.direccion=" JIRON ALFONSO UGARTE N° 175 - JUANJUICILLO PARTE BAJA";
        
        System.out.println("Datos de la Persona 1");
        System.out.println("Nombre complero: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Dirección: "+persona1.getDireccion());
        
        System.out.println("Datos de la Persona 2");
        System.out.println("Nombre complero: "+persona2.getNombre());
        System.out.println("Edad: "+persona2.getEdad());
        System.out.println("Dirección: "+persona2.getDireccion());
    }

 
    
    
}
