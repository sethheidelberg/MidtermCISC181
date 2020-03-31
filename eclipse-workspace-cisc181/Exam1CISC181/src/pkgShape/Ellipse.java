package pkgShape;

public class Ellipse extends Circle implements Comparable {
	
   double rad2;
   
   public Ellipse(double rad,double rad2){
       super(rad);
       this.rad2=rad2;
   }
   
   public double getMinorRadius(){
       return rad2;
   }
   
   public void setMinorRadius(double rad2){
       this.rad2=rad2;
   }
   
   public double area(){
	   
       return super.area()*rad2/rad;
   }
   
   public boolean isCircle(){
	   boolean val = rad==rad2; 
       return val; 
   }
   
   public int compareTo(Object o){
	   
       Ellipse ellipse = (Ellipse) o;
       
       if(this.area()>(ellipse.area()))
           return 1;
       else if(this.area()<ellipse.area())
           return -1;
       else
           return 0;
   }
}