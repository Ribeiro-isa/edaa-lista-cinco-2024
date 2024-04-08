import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Joao", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Daniel", 31));
        pessoas.add(new Pessoa("Lucas", 18));

        // Ordenando a lista de pessoas por idade usando Collections.sort()
        Collections.sort(pessoas);

        // Exibindo a lista ordenada
        System.out.println("Lista de pessoas ordenada por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade() + " anos");
        }
    }
}