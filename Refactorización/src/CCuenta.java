
 /**@author carlos castillo fernandez
    @version  1.0
 */   

/**Clase principal*/
public class CCuenta {

	/**MÈtodo getter del atributo Nombre
	 * 
	 * @return nombre
	 */
    public String getNombre() {
		return nombre;
	}

    /**MÈtodo setter del atributo Nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**MÈtodo getter del atributo cuenta
	 * 
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	 /**MÈtodo setter del atributo cuenta
		 * 
		 * @param cuenta
		 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**MÈtodo getter del atributo saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	 /**MÈtodo setter del atributo saldo
		 * 
		 * @param saldo
		 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**MÈtodo getter del atributo tipoInter√©s
	 * 
	 * @return tipoInter√©s
	 */
	public double getTipoInter√() {
		return tipoInter√;
	}

	 /**MÈtodo setter del atributo tipoInter√
		 * 
		 * @param tipoInter√
		 */
	public void setTipoInter√(double tipoInter√) {
		this.tipoInter√ = tipoInter√;
	}

	/**Variables encapsuladas*/
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter√©s;

    /**Constructor b·sico*/
    public CCuenta()
    {
    }
    
    /**Constructor con par·metros por consola*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**MÈtodo getter de saldo 
     * 
     * @return saldo
     * */
    public double estado()
    {
        return saldo;
    }

    /**MÈtodo setter de ingresar
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
    
    /**MÈtodo setter de retirar 
     * 
     * @param saldo
     * @exception En caso de que la cantidad a retirar sea inferior a 0 devuelve un mensaje.
     * O si la cantidad es menor al saldo tambiÈn lanza una excepciÛn
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
