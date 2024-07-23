public class While {
  public static void main(String[] args) {
    int i = 0;
    int num = 0;
		
		// Verifica -> Executa
		while(i<=10) {
			System.out.println("Número: " + i);
			i++;
		}

		// Executa -> Verifica		
		do {
			System.out.println("Número: " + num);
			num++;
		} while(num <= 10); 
	}
}

