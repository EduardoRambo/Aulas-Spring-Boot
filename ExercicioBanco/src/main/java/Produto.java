public class Produto {


    private String nomeDoProduto;
    private String tipo;
    private int quantidade;
    private double valorDaUnidade;

    public Produto(){

    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorDaUnidade() {
        return valorDaUnidade;
    }

    public void setValorDaUnidade(double valorDaUnidade) {
        this.valorDaUnidade = valorDaUnidade;
    }

    public double calcularValorTotal() {
        return valorDaUnidade * quantidade;
    }

    @Override
    public String toString() {
        return "\nProduto"
              + "\nNome Do Produto='" + nomeDoProduto
              + "\nTipo='" + tipo + '\''
              + "\nQuantidade=" + quantidade
              + "\nValor Da Unidade=" + valorDaUnidade
              + "\nValor Total:" + calcularValorTotal();
    }
}



