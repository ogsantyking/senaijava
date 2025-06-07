import Model.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            produto Produtos = new produto();

            Produtos.nome = "Placa Mãe";
            Produtos.quantidade = 37;
            Produtos.preco = 780.99;

            Produtos.adcionarProduto(10);
            Produtos.venderProduto(37);
            Produtos.venderProduto(57);
        }
        System.out.println("-------------------------------------------------------");
        {
            alunos Aluno1 = new alunos();
            Aluno1.nome = "Francisco";
            Aluno1.prova1 = 2;
            Aluno1.prova2 = 10;

            alunos Aluno2 = new alunos();
            Aluno2.nome = "Bernabé";
            Aluno2.prova1 = 10;
            Aluno2.prova2 = 8.5;

            System.out.println(Aluno1.nome + " tem média: " + Aluno1.calcularMedia());
            System.out.println(Aluno2.nome + " tem média: " + Aluno2.calcularMedia());
        }

        System.out.println("-------------------------------------------------------");
        {
            Bond bond = new Bond();
            bond.name = "Tesouro Selic";
            bond.balance = 1000.00;
            bond.buyBond(24);
            bond.simulateInterest();
        }
        System.out.println("-------------------------------------------------------");
        {
            Aluno aluno = new Aluno();
            aluno.nome = "Heitor";
            aluno.altura = 1.70;
            aluno.anoMatricula = 2023;

            Aluno aluno1 = new Aluno();
            aluno1.nome = "Maria";
            aluno1.altura = 1.50;
            aluno1.anoMatricula = 2024;

            System.out.println(aluno.nome + " tem " + aluno.altura + "m de altura");

           aluno1.estudar();

        }
    }
}
