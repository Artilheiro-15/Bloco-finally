import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    // SO PARA AXEMPLICAR E CRIEI UM COD QUE VAI ABRIR UM ARQUIVO TEXTO E MOSTRAR UM CONTEUDO DESSE ARQUIVO TEXTO NA TELA
    System.out.println("=================================");

    File file = new File("C:\\temp\\in.txt");
    Scanner sc = null;
    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error opening file: " + e.getMessage());
    } finally { //  OQUE ESTIVER AQUI DENTRO VAI SER EXECULTADO INDEPENDENTEMENTE DE TER DADO CERCO O "TRY" OU NAO
      if (sc != null) {
        sc.close();
      }

      System.out.println("Finally block executed");
    }
  }
}
