import java.util.ArrayList;
import java.util.Iterator;

public class CarrinhoDeCompras {
    private ArrayList<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    // Adiciona um item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
        System.out.println("Item adicionado: " + nome);
    }

    // Remove um item pelo nome
    public void removerItem(String nome) {
        Iterator<Item> iterator = itens.iterator();
        boolean removido = false;
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                System.out.println("Item removido: " + nome);
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Item não encontrado: " + nome);
        }
    }

    // Calcula o valor total do carrinho
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValorTotal();
        }
        return total;
    }

    // Exibe todos os itens do carrinho
    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Item item : itens) {
                item.exibirItem();
            }
        }
    }

}
