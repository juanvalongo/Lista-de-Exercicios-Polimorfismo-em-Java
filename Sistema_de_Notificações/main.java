package Sistema_de_Notificações;

public class main {

    public static void main(String[] args) {

        Notificação[] notificacoes = new Notificação[3];

        notificacoes[0] = new Email();
        notificacoes[1] = new SMS();
        notificacoes[2] = new WhatsApp();
        notificacoes[3] = new NotificaçãoPush();

        for (Notificação notificacao : notificacoes) {
            notificacao.enviar();
        }
    }
}

/*Não é necessário alterar o for porque todas as classes herdam de Notificação e sobrescrevem o método enviar(). 
O polimorfismo permite que o mesmo vetor e o mesmo for trabalhem com diferentes tipos de notificações. 
Assim, podemos adicionar NotificaçãoPush sem modificar o código do for. */
