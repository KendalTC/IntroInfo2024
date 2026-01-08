public class Cuenta
  {
    private String nombre; // variable de instancia
    private double saldo;
    private double retiro;

    //Se crea el contructor con el nombre del parametro
    public Cuenta(String nombre, double saldo) {
      this.nombre = nombre;

      if (saldo > 0.0) 
        this.saldo = saldo; 
      
      }
    //Metodo que suma o deposita al saldo
    public void depositar(double montoDeposito) {
      if (montoDeposito > 0.0) {
        saldo = saldo + montoDeposito;
      }
    }

    public double obtenerSaldo() {
      return saldo;
    }
 
    // método para establecer el nombre en el objeto
    public void establecerNombre(String nombre){
    this.nombre = nombre; // almacenar el nombre
    }

    // método para obtener el nombre del objeto
    public String obtenerNombre(){
    return nombre; // devuelve el valor de nombre a quien lo invocó
    }

    public void retirar(double retiro) {
      if (retiro <= saldo) {
        this.retiro = retiro; 
        saldo = saldo - retiro;
      }
    }
 } 
