import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Class Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();

        // Definir forma de cada turismo
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");

        // Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null, retorno);

        // Atribuição dinâmica
        String nome = JOptionPane.showInputDialog("Entre com o nome da pessoa Turista:");

        // Criação do objeto do tipo Turista
        Turista pessoaTurista = new Turista(nome);

        // Saída de dados - nome armazenado acima
        System.out.println(pessoaTurista.getNome());

        // Pedir cpf e mostrar
        String cpf = JOptionPane.showInputDialog("Entre com cpf:");

        // Adicionar cpf no objeto pessoaTurista
        pessoaTurista.setCpf(cpf);
        System.out.println(pessoaTurista.getCpf());
    }

}