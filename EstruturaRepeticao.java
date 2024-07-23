import java.util.ArrayList;
import java.util.List;

public class EstruturaRepeticao {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>(); 
    nomes.add("Gabriel");
    nomes.add("Giovanna");

    // Incrementador
    for(int n = 10; n >= 0; n--){
      System.out.println("Número: " + n);
    }

    // Iterador
    for(String nome : nomes){
      System.out.println(nome);
    }

    // ForEach() - 1 
    nomes.forEach(System.out::println);
  
    // ForEach() - 2
    nomes.forEach(nome -> System.out.println(nome));

  }
}
