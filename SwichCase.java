public class SwichCase {

	public static void main(String[] args) {
		int dia = 2;
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		default: 
			System.out.println("Valor inválido");
			break;
		}
	}
}
