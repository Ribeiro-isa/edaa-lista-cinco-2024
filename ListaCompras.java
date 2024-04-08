import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<ItemCompra> itens;
    
    public ListaCompras() {
        this.itens = new ArrayList<>();
    }
    
    // Metodo para adicionar um item a lista de compras
    public void adicionarItem(ItemCompra item) {
        itens.add(item);
        System.out.println(item.getNome() + " adicionado a lista de compras.");
    }
    
    // Metodo para remover um item da lista de compras
    public void removerItem(String nomeItem) {
        for (ItemCompra item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                itens.remove(item);
                System.out.println(nomeItem + " removido da lista de compras.");
                return;
            }
        }
        System.out.println(nomeItem + " não encontrado na lista de compras.");
    }
    
    // Método para exibir a lista completa de compras
    public void exibirLista() {
        System.out.println("Lista de Compras:");
        for (ItemCompra item : itens) {
            System.out.println("- " + item.getNome());
        }
    }
}