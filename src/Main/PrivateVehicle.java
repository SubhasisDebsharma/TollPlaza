package Main;

public class PrivateVehicle extends Vehicle{

	public PrivateVehicle(String regno) {
		super(regno);
	}

	@Override
	float calcTax(String type, String highway) throws RoadException{
		switch (highway) {
		case Constants._national: return 90.0f;
		case Constants._state: return 60.0f;
		case Constants._local: return 30.0f;
		default: throw new RoadException("Wrong Highway name");
		}
	}

}
