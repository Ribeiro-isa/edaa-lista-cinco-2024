import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Pais> listaPaises = new ArrayList<>();
        listaPaises.add(new Pais("Brasil"));
        listaPaises.add(new Pais("Argentina"));
        listaPaises.add(new Pais("Chile"));
        listaPaises.add(new Pais("Uruguai"));
        listaPaises.add(new Pais("Portugal"));
        listaPaises.add(new Pais("Bolivia"));
        listaPaises.add(new Pais("China"));
        listaPaises.add(new Pais("Estados Unidos"));
        listaPaises.add(new Pais("Franca"));
        listaPaises.add(new Pais("Japao"));
        listaPaises.add(new Pais("Coreia"));

        // Ordenando a lista de paises por nome utilizando lambda
        listaPaises.sort(Comparator.comparing(Pais::getNome));

        // Exibindo a lista ordenada
        System.out.println("Lista de paises ordenada:");
        for (Pais pais : listaPaises) {
            System.out.println(pais.getNome());
        }
    }
}