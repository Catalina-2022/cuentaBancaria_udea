public class cuentaBancaria {

    private String numero; //encapsulamiento
    private String tipo ="";
    private double saldoActual=0;
    private double saldoMinimo=0;
    private double valorInicial=0;

    public cuentaBancaria(String numero, String tipo, double saldoActual, double saldoMinimo, double valorInicial) {
        this.numero = numero;
        if (tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("credito")) {
            this.tipo = tipo;
            this.valorInicial = valorInicial;
            this.saldoActual = valorInicial;
            this.saldoMinimo = valorInicial * 0.1;
        }
    }
    public string getNumero() {
        return numero;
    }

    public void setNumero(string numero) {
        this.numero = numero;
    }

    public string getTipo() {
        return tipo;
    }

    public void setTipo(string tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void consignar(double monto) {
        this.saldoActual += monto;
    }

    public void retirar(double monto){

        if ((this.saldoActual-monto)<this.saldoMinimo){
            system.out.println("saldo Insuficiente");
            system.out.println("El valor retirado es:"+(this.saldoActual-this.saldoMinimo));
            this.saldoActual=this.saldoMinimo;
        }else{
            system.out.println("El valor retirado es: "+monto);
            this.saldoActual-=monto;
            }
        }

    @java.lang.Override
    public java.lang.String toString() {
        return "cuentaBancaria{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldoActual=" + saldoActual +
                ", saldoMinimo=" + saldoMinimo +
                ", valorInicial=" + valorInicial +
                '}';
    }
}

