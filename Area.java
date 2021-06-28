package jinterface;


interface Field {
	void getArea(int r,int PI);
	void getSurround(int r,int PI);
		
}

class Area implements Field{
	@override
	public void getArea(int r,int PI) {
		System.out.println("The area of the circle is"+(PI * r*r));
	}
	@override
	public void getSurround(int r,int PI) {
		System.out.println("The circumferences of the circle is:"+(2*PI*r));
	}
}



class MainClass{
	public void main(String[] args) {
		Area f1 = new Area();
		Area f2 = new Area();
		f1.getArea(10,3);
		f2.getSurround(10,3);
	}
}
