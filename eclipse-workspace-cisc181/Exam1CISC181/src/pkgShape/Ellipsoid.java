package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable{
	
   double h;
   
   public Ellipsoid(double rad,double rad2,double h){
	   
       super(rad,rad2);
       this.h=h;
       
   }
   
    
   public double getVolume(){
	      
       return super.area()*h*4/3;
       
   }
   
   public int compareTo(Object o){
	   
       Ellipsoid ellipsoid = (Ellipsoid) o;
       
       if(this.getVolume()>(ellipsoid.getVolume()))
           return 1;
       else if(this.getVolume()<ellipsoid.getVolume())
           return -1;
       else
           return 0;
   }
}