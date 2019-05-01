
public abstract class Biseccion {
	
public abstract double f (double x) ;	 


 public final double raiz (double x0, double x1) {
	 
	 double x= Double.NaN;
	 
	 if(f(x0)*f(x1)<0) {
		 
		 do {
			 x=(x0+x1)/2;
			 
			 if(f(x0)*f(x)<0) {
				 x1=x;
			 }else {
				 
				 x0=x;
			 }
			 
		 }while(Math.abs(f(x))>0.001);
			 
		 }
	 return x;
	 }
	 
 }

