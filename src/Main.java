public class Main {
    public static void main(String[] args) {

        //Instanciar la clase
        cuentaBancaria micuenta= new Cuenta (numero:"123456",tipo:"Ahorro",valorInicial:150000);
        System.out.println("Saldo minimo: "+micuenta.getSaldoMinimo());
        miCuenta.consignar(monto:80000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        micuenta.retirar (monto: 250000);
        System.out.println ("saldoActual: "+miCuenta.getSaldoActual());
        System.out.println (miCuenta.toString());
        System.out.prontln ("----------------------------------------");

        Cuenta pedroCuenta= new cuentaBancaria (numero: "585858" , tipo: "prestamo" , valorInicial: 5000);
        System.out.println(pedroCuenta.toString ());

    }
}