package TP7_Gestion_des_Exceptions;


public class name  {
	public static void main(String[] args) {
		try {
			double x=Double.parseDouble(args[0]);
			double y=Double.parseDouble(args[1]);
		
			if(y==0) {
				throw new ArithmeticException("y doit etre nombre positif");
			}
			if(x<0) {
				throw new NegatifException("x doit etre positif");
			}
			System.out.println(Mathematique.f(x,y));	
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça\r\n"
					+ "fonctionne"+e.getMessage());
		}
		
		catch(NumberFormatException e) {
			System.out.println("Les arguments doivent être des nombres "+e.getMessage());
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NegatifException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
