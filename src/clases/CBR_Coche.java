package clases;

public class CBR_Coche {
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getNumeroPlazas() {
		return NumeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		NumeroPlazas = numeroPlazas;
	}
	public double getVelocidadMedia() {
		return VelocidadMedia;
	}
	public void setVelocidadMedia(double velocidadMedia) {
		VelocidadMedia = velocidadMedia;
	}
	public String getTipoCombustible() {
		return TipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		TipoCombustible = tipoCombustible;
	}
	public double getConsumo() {
		return Consumo;
	}
	public void setConsumo(double consumo) {
		Consumo = consumo;
	}
	private String matricula;
	@Override
	public String toString() {
		return "CBR_Coche [matricula=" + matricula + ", Modelo=" + Modelo + ", NumeroPlazas=" + NumeroPlazas
				+ ", VelocidadMedia=" + VelocidadMedia + ", TipoCombustible=" + TipoCombustible + ", Consumo=" + Consumo
				+ "]";
	}
	private String Modelo;
	private int NumeroPlazas;
	private double VelocidadMedia;
	private String TipoCombustible;
	private double Consumo;

}
