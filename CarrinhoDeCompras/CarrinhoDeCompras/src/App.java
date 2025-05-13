public class App {
    // Método main para testes
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 5.99, 2);
        carrinho.adicionarItem("Feijão", 7.49, 1);
        carrinho.adicionarItem("Macarrão", 4.25, 3);

        carrinho.exibirItens();

        System.out.printf("Valor total: R$%.2f%n", carrinho.calcularValorTotal());

        carrinho.removerItem("Feijão");
        carrinho.exibirItens();

        System.out.printf("Valor total atualizado: R$%.2f%n", carrinho.calcularValorTotal());
    }
}
