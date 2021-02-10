
 /**@author carlos castillo fernandez
    @version  1.0
 */   

/**Clase principal*/
public class CCuenta {

	/**M�todo getter del atributo Nombre
	 * 
	 * @return nombre
	 */
    public String getNombre() {
		return nombre;
	}

    /**M�todo setter del atributo Nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**M�todo getter del atributo cuenta
	 * 
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	 /**M�todo setter del atributo cuenta
		 * 
		 * @param cuenta
		 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**M�todo getter del atributo saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	 /**M�todo setter del atributo saldo
		 * 
		 * @param saldo
		 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**M�todo getter del atributo tipoInterés
	 * 
	 * @return tipoInterés
	 */
	public double getTipoInter�() {
		return tipoInter�;
	}

	 /**M�todo setter del atributo tipoInter�
		 * 
		 * @param tipoInter�
		 */
	public void setTipoInter�(double tipoInter�) {
		this.tipoInter� = tipoInter�;
	}

	/**Variables encapsuladas*/
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**Constructor b�sico*/
    public CCuenta()
    {
    }
    
    /**Constructor con par�metros por consola*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**M�todo getter de saldo 
     * 
     * @return saldo
     * */
    public double estado()
    {
        return saldo;
    }

    /**M�todo setter de ingresar
     * 
     * 
     * @param ingresar
     * @exception En caso de que la cantidad a ingresar sea inferior a 0 devuelve un mensaje.
     * En caso contrario lanza actualiza el saldo con la cantidad ingresada.
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**M�todo setter de retirar 
     * 
     * @param saldo
     * @exception En caso de que la cantidad a retirar sea inferior a 0 devuelve un mensaje.
     * O si la cantidad es menor al saldo tambi�n lanza una excepci�n
     * En caso contrario lanza actualiza el saldo con la cantidad ingresada.
     * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
