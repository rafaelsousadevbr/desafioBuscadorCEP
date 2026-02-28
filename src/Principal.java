public class Principal {
    public static void main(String[] args) {

        ConsultarCep consultarCep = new ConsultarCep();
        Endereco novoEndereco =  consultarCep.buscarEndereco("60420470");
        System.out.println(novoEndereco);
    }
}
