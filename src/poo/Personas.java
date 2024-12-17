package poo;

import javax.swing.JOptionPane;

public class Personas {
    private String nombre;
    private int edad;
    private String direccion;
    private static final String DIRECCION_PREDETERMINADA = "MI CASA";

    // Constructor con todos los atributos
    public Personas(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Constructor con dirección predeterminada
    public Personas(String nombre, int edad) {
        this(nombre, edad, DIRECCION_PREDETERMINADA);
    }

    // Getters y Setters
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

    // Método para determinar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método para ingresar datos
    private static Personas ingresarDatosPersona() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        int edad = 0;
        try {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la edad.");
            System.exit(0); // Salir en caso de error
        }
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección:");
        return new Personas(nombre, edad, direccion);
    }

    public static void main(String[] args) {
        // Crear y mostrar datos de una persona
        Personas persona = ingresarDatosPersona();

        String mensaje = String.format(
            "%s\nCON DIRECCIÓN: %s\nES %s DE EDAD",
            persona.getNombre(),
            persona.getDireccion(),
            persona.esMayorDeEdad() ? "MAYOR" : "MENOR"
        );

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
