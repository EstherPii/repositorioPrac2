package practica2;

/**
 * 
 * @author Esther Pizarro Soto
 *
 */

public class Main {
	
	public static void main(String[] args) {

        CCuenta cuentaUno;
        double saldoActual;

        
        float cantidad = 20;
        

        cuentaUno = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        saldoActual = cuentaUno.estado();

        System.out.println("El saldo actual es"+ saldoActual );
 
        
        operaCuenta(cuentaUno, cantidad);
        
    }
	
	
	/**
	 * Método operaCuenta: permite ingresar o retirar una cantidad.
	 * @param cuentaUno 
	 * @param cantidad 
	 */
	public static void operaCuenta(CCuenta cuentaUno, float cantidad) {
		
		try {
			cuentaUno.retirar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		
		try {
			System.out.println("Ingreso en cuenta");
			cuentaUno.ingresar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
	
}
