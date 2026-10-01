package Sistema_de_Notificações;

public class WhatsApp extends Notificação {
    @Override
    public void enviar() {
        System.out.println("A mensagem do WhatsApp está sendo enviada.");
    }
    
}
