import java.util.HashMap;
import java.util.Map;

public class HashMapEstrutura {
  public static void main(String[] args) {

    // Dicionário com chave e valor
    Map<String, Integer> notas = new HashMap<>();

    notas.put("Gabriel", 10);
    notas.put("Giovanna", 9);

    for(Map.Entry<String, Integer> entry : notas.entrySet()){
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
  }
}
