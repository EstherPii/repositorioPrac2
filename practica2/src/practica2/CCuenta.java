package practica2;

/**
 * 
 * @author Esther Pizarro Soto
 * @date 02/06/2021
 * 
 */

public class CCuenta {
	
	/**
	 * Atributos de la clase CCuenta
	 */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta(){
    }

    /**
     * Constructor parametrizado de la clase CCuenta
     * @param nom 
     * @param cue 
     * @param sal 
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @param nom
     */
    public void asignarNombre(String nom){
        setNombre(nom);
    }

    /**
     * 
     * @return
     */
    public String obtenerNombre(){
        return getNombre();
    }

    /**
     * 
     * @return
     */
    public double estado(){
        return saldo;
    }

    /**
     * Método ingresar: permite ingresar una cantidad
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método retirar: permite retirar una cantidad
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * 
     * @return
     */
    public String obtenerCuenta(){
        return cuenta;
    }

    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * 
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    
    /**
     * 
     * @return
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
