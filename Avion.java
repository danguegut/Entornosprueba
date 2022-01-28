import java.util.Objects;

public class Avion {
	
	private String idAvion;
	private String compannia;
	private int capacidad;
	private int numVuelos;
	private double kmVolados;
	
	
	//Constructor 1
	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion=idAvion;
		this.capacidad=capacidad;
		this.numVuelos = 0;
		this.kmVolados = 0.0;
	}
	//Constructor 2
	public Avion(String idAvion, String compannia, int capacidad) {
		super();
		this.idAvion=idAvion;
		this.compannia=compannia;
		this.capacidad=capacidad;
		this.numVuelos = 0;
		this.kmVolados = 0.0;
	}
	
	//Método asignarVuelo
	public boolean asignarVuelo(int capacidad, double kilometrosVuelo) {
		boolean vueloAsignado = false;
		if (capacidad>0 && this.capacidad-capacidad>=0 && kilometrosVuelo>=0) {
			kmVolados+=kilometrosVuelo;
			numVuelos++;
			vueloAsignado=true;
		}
		return vueloAsignado;
	}

	//Getters y setters
	public String getIdAvion() {
		return idAvion;
	}


	private void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}


	public int getCapacidad() {
		return capacidad;
	}


	private void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getNumVuelos() {
		return numVuelos;
	}


	private void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}


	public double getTotalKm() {
		return kmVolados;
	}

	private void setTotalKm(double kmVolados) {
		this.kmVolados = kmVolados;
	}


	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	
	//Get mediaKim
	public double getMediaKm() {
		return this.kmVolados/this.numVuelos;
	}
	
	
	//Método toString
	@Override
	public String toString() {
		return "El avión con id " + idAvion + " de la compañía aérea " + compannia + ", tiene una capacidad de " + capacidad + " pasajeros, ha realizado " + numVuelos + " vuelos y ha volado "
				+ kmVolados + " km."; 
	}
	
	//Método hashCode, solo utilizando el idAvion
	@Override
	public int hashCode() {
		return Objects.hash(idAvion);
	}
	
	//Método equals, solo utilizando el idAvion
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		return Objects.equals(idAvion, other.idAvion);
	}
	
	
	
	
	
	
}	
