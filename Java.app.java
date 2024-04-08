import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListaContatos listaContatos = new ListaContatos();
        Scanner scanner = new Scanner(System.in);
        
        // Adicionando alguns contatos para teste
        listaContatos.adicionarContato(new Contato("Marcus", "123456789"));
        listaContatos.adicionarContato(new Contato("Isadora", "987654321"));
        
        // Menu de interacao
        int opcao;
        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Listar contatos");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do contato:");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o telefone do contato:");
                    String telefone = scanner.nextLine();
                    listaContatos.adicionarContato(new Contato(nome, telefone));
                    break;
                case 2:
                    System.out.println("Informe o nome do contato a ser buscado:");
                    String nomeBusca = scanner.nextLine();
                    Contato contatoEncontrado = listaContatos.buscarContato(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado - Nome: " + contatoEncontrado.getNome() + ", Telefone: " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de contatos:");
                    listaContatos.listarContatos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}