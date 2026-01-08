public class Empleado {
    private String nombre; 
    private String apellido; 
    private double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido; 
        this.salarioMensual = salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido; 
    }

    public String getApellido(){
        return apellido;
    }

    public void setSalarioM(double salarioMensual) {
        if (salarioMensual>0) {
            this.salarioMensual = salarioMensual;
        }
        
    }

    public double getSalarioM() {
        return salarioMensual;
    }

}