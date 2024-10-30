package d1030test;

public class Won2Dollar extends Converter {

	double dollar;
	
	public Won2Dollar(double dollar) {
		
		this.dollar = dollar;
		
	}

	@Override
	protected double convert(double src) {
		double result = src / dollar;
		return result;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
		
	}
	
	

}
