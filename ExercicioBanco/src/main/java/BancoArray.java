import java.util.ArrayList;
import java.util.List;

public class BancoArray implements ProdutoInterface {

    List<Produto> estoque;

    public BancoArray() {
        estoque = new ArrayList<>();
    }

    @Override
    public void cadastrar(Produto produto) {
        this.estoque.add(produto);
    }

    @Override
    public List<Produto> buscar() {
        return this.estoque;
    }

    @Override
    public void excluir(int index) {
        this.estoque.remove(index);
    }

    @Override
    public Produto filtrar(Produto produto, int filtro) {
        switch(filtro) {
            case 1: //nome Do Produto
                for(Produto produtoAuxiliar:this.estoque) {
                    if (produtoAuxiliar.getNomeDoProduto().contains(produto.getNomeDoProduto())) {
                        return produtoAuxiliar;
                    }
                }
                break;
            case 2: //Tipo de Produto
                for(Produto produtoAuxiliar: this.estoque) {
                    if(produtoAuxiliar.getTipo().contains(produto.getTipo())) {
                        return produtoAuxiliar;
                    }
                }
                break;
            case 3: //Quantidade
                for(Produto produtoAuxiliar: this.estoque) {
                    if(produtoAuxiliar.getQuantidade() == produto.getQuantidade()) {
                        return produtoAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.estoque.size();
    }
    @Override
    public void apagarEstoque() {
        this.estoque.clear();
    }
}
