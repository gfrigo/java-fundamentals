import java.util.HashSet;
import java.util.Set;

public class HashSetEstrutura {
  public static void main(String[] args) {

    // Lista desordenada com valores únicos
    Set<Integer> numeros = new HashSet<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(3);
    numeros.add(4);
  
    numeros.remove(4);
  
    System.out.println(numeros.contains(3));
  }
}
