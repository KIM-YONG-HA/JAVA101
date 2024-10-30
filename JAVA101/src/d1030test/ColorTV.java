package d1030test;

class ColorTV extends TV{
	
	int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}


	void tvSpec() {
		
		String spec = this.getSize() + "인치 "+ color +"컬러";
		System.out.println(spec);
		
		
	}
	
	
}