
public class Main extends Biseccion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biseccion bs = new  Main ();
		System.out.println(bs.raiz(1,2));
		

	}

	@Override
	public double f(double x) {
		// TODO Auto-generated method stub
		return x*x - 5;
	}

}
