public class produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adcionarProduto(int novoProduto){
        quantidade += novoProduto;

    }

    public void venderProduto(int vendaDeProduto){
        if (vendaDeProduto > quantidade){
            System.out.println("Estoque insuficiente - Estoque Atual:" + quantidade);
        }else {
            quantidade -= vendaDeProduto;
            System.out.println(vendaDeProduto + " Unidades Vendidas - Estoque Restante:" + quantidade);
        }
    }
}
