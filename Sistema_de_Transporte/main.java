package Sistema_de_Transporte;

public class main {

    public static void main(String[] args) {

        Transporte[] transportes = new Transporte[3];

        transportes[0] = new Onibus();
        transportes[1] = new Aviao();
        transportes[2] = new Navio();

        for (Transporte transporte : transportes) {
            transporte.iniciarViagem();
        }
    }
}

/*Não é necessário criar três for diferentes porque todos os objetos são tratados como Transporte. 
O polimorfismo permite que o mesmo for percorra o vetor e cada objeto execute sua própria versão do método iniciarViagem(). */