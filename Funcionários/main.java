package Funcionários;

public class main {

    public static void main(String[] args) {

        funcionário f1 = new professor();
        funcionário f2 = new gerente();

        f1.apresentar();
        f2.apresentar();
    }
}

/*O polimorfismo está nas variáveis f1 e f2, que são do tipo Funcionario, 
mas recebem objetos de classes diferentes (Professor e Gerente). 
Quando o método apresentar() é chamado, cada objeto executa sua própria versão do método.*/