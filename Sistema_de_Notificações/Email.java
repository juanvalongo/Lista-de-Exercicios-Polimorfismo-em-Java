package Sistema_de_Notificações;

public class Email extends Notificação {
    @Override
    public void enviar() {
        System.out.println("O email está sendo enviado.");
    }
    
}

