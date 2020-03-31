package pkgShape;

public class Circle extends Shape implements Comparable {
		
	double rad;
	   
	public Circle(){	
		super();
	}
	   
	public Circle(double rad){
		this.rad=rad;
	}
	
	@Override
	public double area() {
		
		return Math.PI*rad*rad;
	}
	   
	public void setRadius(double radius){
		   this.rad=rad;
	}

	public double getRadius(){
	    return rad;
	}

	@Override
	public int compareTo(Object o) {
	      
	    Circle circle = (Circle) o;
	       
	    if(this.area()>(circle.area()))
	        return 1;
	    else if(this.area()<circle.area())
	        return -1;
	    else
	        return 0;
	}
	  
}
