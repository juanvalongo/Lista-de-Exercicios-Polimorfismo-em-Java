package Sistema_de_Notificações;

public class SMS extends Notificação {
    @Override
    public void enviar() {
        System.out.println("O SMS está sendo enviado.");
    }
    
}
