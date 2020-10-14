package no.hvl.dat100ptc.oppgave1;
public class GPSPoint {
	
	private int GPStime;
	private double GPSlatitude;
	private double GPSlongitude;
	private double GPSelevation;

	// TODO - objektvariable
		
	public GPSPoint(int time, double latitude, double longitude, double elevation) {
		GPStime = time;
		GPSlatitude = latitude;
		GPSlongitude = longitude;
		GPSelevation = elevation;
		
		
	// TODO - konstruktur

	

	}

	public GPSPoint() {
		// TODO Auto-generated constructor stub
	}

	// TODO - get/set metoder
	public int getTime() {
		 return GPStime;
		
		
		
		
	}

	public void setTime(int time) {
		
			GPStime = time;
		

	}

	public double getLatitude() {
		
		return GPSlatitude;
		
	}

	public void setLatitude(double latitude) {
		
		GPSlatitude = latitude;
		
	}

	public double getLongitude() {
		
		return GPSlongitude;
		
	}

	public void setLongitude(double longitude) {
		
		GPSlongitude = longitude;
		
	}

	public double getElevation() {
		
		return GPSelevation;
		
	}

	public void setElevation(double elevation) {
		
		GPSelevation = elevation;
		
	}
	
	public String toString() {
		
		String str;
		
		str = GPStime +" (" +GPSlatitude + ","+ GPSlongitude + ")" + GPSelevation +"\n";
				return str;
		
		
		
	}
}
