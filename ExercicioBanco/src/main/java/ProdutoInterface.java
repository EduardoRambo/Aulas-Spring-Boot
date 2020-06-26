import java.util.List;

public interface ProdutoInterface {

    public void cadastrar(Produto produto);
    public List<Produto> buscar();
    public void excluir(int index);
    public Produto filtrar(Produto produto, int filtro);
    public int verificarQuantidade();
    public void apagarEstoque();

}
