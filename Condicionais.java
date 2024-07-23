public class Condicionais {


  public static void main(String[] args) { 
    float massa = 78.5f;
    float altura = 1.74f;
    float imc = massa/(altura * altura);

    if(imc <= 18.5){
      System.out.println("Abaixo do peso.");
    } else if(imc > 18.5 && imc <=25){
      System.out.println("Peso normal");
    }else{
      System.out.println("Acima do peso");
    }

  }
}
