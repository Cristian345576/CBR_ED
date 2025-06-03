package clases;

public class CBR_Coche {
	private String matricula;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return Modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	/**
	 * @return the numeroPlazas
	 */
	public int getNumeroPlazas() {
		return NumeroPlazas;
	}
	/**
	 * @param numeroPlazas the numeroPlazas to set
	 */
	public void setNumeroPlazas(int numeroPlazas) {
		NumeroPlazas = numeroPlazas;
	}
	/**
	 * @return the velocidadMedia
	 */
	public double getVelocidadMedia() {
		return VelocidadMedia;
	}
	/**
	 * @param velocidadMedia the velocidadMedia to set
	 */
	public void setVelocidadMedia(double velocidadMedia) {
		VelocidadMedia = velocidadMedia;
	}
	/**
	 * @return the tipoCombustible
	 */
	public String getTipoCombustible() {
		return TipoCombustible;
	}
	/**
	 * @param tipoCombustible the tipoCombustible to set
	 */
	public void setTipoCombustible(String tipoCombustible) {
		TipoCombustible = tipoCombustible;
	}
	/**
	 * @return the consumo
	 */
	public double getConsumo() {
		return Consumo;
	}
	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(double consumo) {
		Consumo = consumo;
	}
	private String Modelo;
	@Override
	public String toString() {
		return "CBR_Coche [matricula=" + matricula + ", Modelo=" + Modelo + ", NumeroPlazas=" + NumeroPlazas
				+ ", VelocidadMedia=" + VelocidadMedia + ", TipoCombustible=" + TipoCombustible + ", Consumo=" + Consumo
				+ "]";
	}
	private int NumeroPlazas;
	private double VelocidadMedia;
	private String TipoCombustible;
	private double Consumo;

}
