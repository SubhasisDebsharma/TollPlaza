package Main;

public abstract class Vehicle {
	private String regno;
	public Vehicle(String regno){
		this.regno = regno;
	}
	abstract float calcTax(String type, String highway) throws RoadException;
	public String getRegno() {
		return regno;
	}
}
