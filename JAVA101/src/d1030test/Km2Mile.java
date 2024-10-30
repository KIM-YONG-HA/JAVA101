package d1030test;

public class Km2Mile extends Converter {


	double mile;
	
	public Km2Mile(double mile) {
	
		this.mile = mile;
		
	}

	
	@Override
	protected double convert(double src) {
		double result = src / mile;
		return result;
	}



	@Override
	protected String getSrcString() {
		return "Km";
	}


	@Override
	protected String getDestString() {
		return "Mile";
	}
	
	
	
	

}
