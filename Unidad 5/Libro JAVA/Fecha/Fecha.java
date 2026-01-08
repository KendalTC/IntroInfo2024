public class Fecha {
    private int dia; 
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes; 
    }

    public void establecerAno(int ano) {
        this.ano = ano;
    }

    public int obtenerAno() {
        return ano;
    }

    public String mostrarFecha() {
        return dia+"/"+mes+"/"+ano;
    
    }
 }