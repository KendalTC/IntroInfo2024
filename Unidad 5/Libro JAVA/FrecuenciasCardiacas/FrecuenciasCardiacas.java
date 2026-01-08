import java.time.LocalDate;
public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido; 
    private String mesNacimiento; 
    private int anoNacimiento; 
    private int diaNacimiento; 
    private int edad; 
    private int fCMax; 
    private double fCEsperada; 

    LocalDate date = LocalDate.now();
    int anoActual = date.getYear();

    //Contructor
    public FrecuenciasCardiacas(String nombre, String apellido, String mesNacimiento, int diaNacimiento, int anoNacimiento, int edad, int fCMax, double fCEsperada ) {
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.edad = edad; 
        this.fCMax = fCMax;
        this.fCEsperada = fCEsperada;

    }
    //Metodo establecer nombre 
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    //Metoddo para obtener nombre 
    public String getNombre() {
        return nombre; 
    }
    //Metodo para establecer apellido 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Metodo para obtener apellido 
    public String getApellido() {
        return apellido;
    }
    //Metodo para establecer dia nacimiento 
    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }
    //Metodo para obtener dia nacimiento  
    public int getDiaNacimiento() {
        return diaNacimiento;
    }
    //Metodo para establecer mes nacimiento 
    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }
    //Metodo para obtener mes nacimiento 
    public String getMesNacimiento() {
        return mesNacimiento;
    }
    //Metodo para establecer año nacimiento 
    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento; 
    }
    //Metodo para obtener año nacimiento
    public int getAnoNacimiento() {
        return anoNacimiento;
    }
    //Metodo que calcula la edad 
    public void setEdad(int edad) {
        edad = anoActual - anoNacimiento;
        this.edad = edad;
    }
    //Metodo que muestra la edad 
    public int getEdad() {
        return edad;
    }
    //Metodo que calcula la frecuencia cardiaca maxima
    public void setFCMax(int fCMax){
        fCMax = 220 - edad;
        this.fCMax = fCMax;
    }
    //Metodo que muestra la frecuencia cardiaca
    public int getFCMax() {
        return fCMax;
    }
    //Metodo que calcula la frecuencia esperada 
    public void setFCEsperada(double fCEsperada) {
        fCEsperada = fCMax * 0.70;
        this.fCEsperada = fCEsperada;
    }
    //Metodo que muestra la frecuencia esperada
    public double getFCEsperada() {
        return fCEsperada;
    }
}


