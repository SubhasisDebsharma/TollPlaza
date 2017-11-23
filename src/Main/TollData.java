package Main;

public class TollData {
	private int totalPrivateCount=0, totalPrivateTax=0, totalCommercialCount=0, totalCommercialTax=0; 

	public static void main(String[] args) throws RoadException{
		PrivateVehicle pv1 = new PrivateVehicle("12ERQ4");
		PrivateVehicle pv2 = new PrivateVehicle("12SRQ5");
		CommercialVehicle cv1 = new CommercialVehicle("53FR6T");
		TollData td = new TollData();
		td.makeEntry(pv1, Constants._private, Constants._national);
		td.makeEntry(cv1, Constants._commercial, Constants._local);
		td.makeEntry(pv2, Constants._private, Constants._local);
		System.out.println("Total Private Count is: "+td.getTotalPrivateCount());
		System.out.println("Total Commercial Count is: "+td.totalCommercialCount);
		System.out.println("Total Private Tax: "+td.getTotalPrivateTax());
		System.out.println("Total Commercial Tax: "+td.getTotalCommercialTax());
	}
	
	void makeEntry(Vehicle v, String type, String highway) throws RoadException{
		if(type == Constants._private) {
			totalPrivateCount++;
			totalPrivateTax += v.calcTax(type, highway);
		}else if(type == Constants._commercial){
			totalCommercialCount++;
			totalCommercialTax += v.calcTax(type, highway);
		}else throw new RoadException("Wrong vehival type");
	}

	public int getTotalPrivateCount() {
		return totalPrivateCount;
	}

	public int getTotalPrivateTax() {
		return totalPrivateTax;
	}

	public int getTotalCommercialCount() {
		return totalCommercialCount;
	}

	public int getTotalCommercialTax() {
		return totalCommercialTax;
	}

}
