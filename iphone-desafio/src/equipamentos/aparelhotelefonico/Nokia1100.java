package equipamentos.aparelhotelefonico;

public class Nokia1100 implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no Nokia.");
    }

    public void atender() {
        System.out.println("Atendendo ligação no Nokia");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no Nokia");
    }
    
}
