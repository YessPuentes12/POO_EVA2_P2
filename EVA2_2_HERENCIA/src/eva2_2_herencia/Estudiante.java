/*

 */
package eva2_2_herencia;


public class Estudiante {
 private String nombre;
 private String apellido;
 private int edad;
 private String noControl;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
       nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apell) {
      apellido = apell;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        edad = age;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noCo) {
        noControl = noCo;
    }
    
     public void datos(){
     System.out.println("Nombre: "+nombre);
     System.out.println("Apellido: "+apellido);
     System.out.println("Edad: "+edad);
     System.out.println("Número de control: " +noControl);
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
