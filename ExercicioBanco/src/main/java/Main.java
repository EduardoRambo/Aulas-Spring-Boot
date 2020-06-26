import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BancoArray estoque = new BancoArray();

        Produto produto = null;

        int opcao = 0;
        do{
            System.out.println("\n1-Cadastrar Produto\n2-Informações do produto\n3-Excluir informações\n4-Filtrar\n5-Ver quantidade,\n6-Esvaziar banco\n7-Sair");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    produto = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    produto.setNomeDoProduto(scanner.next());
                    System.out.println("Digite o valor da unidade: ");
                    produto.setValorDaUnidade(scanner.nextDouble());
                    System.out.println("Digite a quantidade: ");
                    produto.setQuantidade(scanner.nextInt());
                    System.out.println("Digite o tipo do produto: ");
                    produto.setTipo(scanner.next());
                    estoque.cadastrar(produto);
                    System.out.println("Cadastro efetuado!");
                    break;
                case 2:
                    if(estoque.verificarQuantidade() != 0) {
                        estoque.buscar().forEach(System.out::println);
                    } else {
                        System.out.println("Não há produtos no estoque!");
                    }
                    break;
                case 3:
                    System.out.println("Digite posição para excluir: ");
                    int index = scanner.nextInt();
                    estoque.excluir(index);
                    System.out.println("Produto apagado");
                    break;
                case 4:

                    do{
                        System.out.println("\n1-Filtrar por nome:\n2-Filtrar por tipo de produto:\n3-Filtrar por quantidade: \n4-Voltar");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:
                                produto = new Produto();
                                System.out.println("Digite o nome de produto que deseja filtrar: ");
                                produto.setNomeDoProduto(scanner.next());

                                produto = estoque.filtrar(produto,1);
                                System.out.println(produto != null ? produto : "Não encontrado");
                                break;

                            case 2:
                                produto = new Produto();
                                System.out.println("Digite o tipo de produto para filtrar: ");
                                produto.setTipo(scanner.next());

                                produto = estoque.filtrar(produto,2);
                                System.out.println(produto != null ? produto : "Não encontrado");
                                break;
                            case 3:
                                produto = new Produto();
                                System.out.println("Digite a quantidade do produto para filtrar: ");
                                produto.setQuantidade(scanner.nextInt());

                                produto = estoque.filtrar(produto,3);
                                System.out.println(produto != null ? produto : "Não encontrado");
                                break;
                            case 4:
                        }
                    }while(opcao != 4);
                    break;
                case 5:
                    System.out.println("Tem " + estoque.verificarQuantidade() + "produto(s)");
                    break;
                case 6:
                    estoque.apagarEstoque();
                    System.out.println("Apagado");
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while(opcao != 7);
    }
}
