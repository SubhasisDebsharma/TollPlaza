package Main;

public class CommercialVehicle extends Vehicle{
	public CommercialVehicle(String regno) {
		super(regno);
	}

	@Override
	float calcTax(String type, String highway) throws RoadException{
		switch (highway) {
		case Constants._national: return 150.0f;
		case Constants._state: return 100.0f;
		case Constants._local: return 50.0f;
		default: throw new RoadException("Wrong Highway name");
		}
	}

}
