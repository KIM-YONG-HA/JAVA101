package d1030test;

public class Km2Mile extends Converter {

	
	public Km2Mile(double ratio) {
	
		this.ratio = ratio;
		
	}

	
	@Override
	protected double convert(double src) {
		double result = src / ratio;
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
