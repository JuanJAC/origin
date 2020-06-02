import java.lang.*;

class Main{
	public static void main(String[] args) {
		
		Integer objINT = new Integer(1);
		Boolean objBol = new Boolean(true);

		int intVal = intValue(objINT);
		boolean bolVal = bolValue(objBol);

		System.out.println("intVal");
		System.out.println("intVal");

		public static int intValue(int i) {
	        return i;
	    }
	    public static boolean bolValue(boolean i) {
	        return i;
	    }

	}
}

		/*
		Figura fig1 = new Figura(, false, "Azul");
		Figura fig2 = new Figura(4,true, "Verde");
		Figura fig3 = new Figura();
		Figura fig4 = new Figura();

		fig1.esPintable();
		fig2.esPintable();
		fig3.esPintable();
		fig4.esPintable();
		*/