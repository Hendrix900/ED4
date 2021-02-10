
 /**@author carlos castillo fernandez
    @version  1.0
 */   
public class Main {
	
	/**Clase principal*/
    public static void main(String[] args) {
        operativa_cuenta();
    }
    
    /**método operativa_cuenta
     * @return texto informativo acerca del proceso de gestión de la cuenta.
     *  */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;
        
        /**Se instancia una calse ccuenta*/
        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        /**Se llevan a cabo unas excepciones en para los posibles errores.*/
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
