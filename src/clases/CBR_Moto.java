package clases;

public class CBR_Moto {
	private String Modelo;
	private int NumeroPlazas;
	private int VelocidadMedia;
	private String TipoCombustible;
	private double Consumo;
	private String Matricula;
	
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
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
	public int getVelocidadMedia() {
		return VelocidadMedia;
	}
	public void setVelocidadMedia(int velocidadMedia) {
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
	@Override
	public String toString() {
		return "CBR_Moto [Matricula=" + Matricula + ", Modelo=" + Modelo + ", NumeroPlazas=" + NumeroPlazas
				+ ", VelocidadMedia=" + VelocidadMedia + ", TipoCombustible=" + TipoCombustible + ", Consumo=" + Consumo
				+ "]";
	}

	

}
