import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura =  new Scanner(System.in);
        ConsultarCep consultarCep = new ConsultarCep();

        System.out.println("Digite o número do CEP desejado para consulta:");
        var cep = leitura.nextLine();

        try{
            Endereco novoEndereco =  consultarCep.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Aplicação será finalizada");
        }
    }
}
