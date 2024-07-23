import java.util.ArrayList;
import java.util.List;

public class Lista {
  public static void main(String[] args) {
    // List -> Interface / ArrayList -> Classe
    List<String> nomes = new ArrayList<>();

    nomes.add("Gabriel");
    nomes.add("Giovanna");

    System.out.println(nomes.get(0));
  }
}
