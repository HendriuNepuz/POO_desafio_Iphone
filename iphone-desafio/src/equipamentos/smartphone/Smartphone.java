package equipamentos.smartphone;
import equipamentos.aparelhotelefonico.AparelhoTelefonico;
import equipamentos.navegadorinternet.NavegadorInternet;
import equipamentos.reprodutormusical.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando musica no Iphone!");
    }

    public void pausar() {
        System.out.println("Musica pausada no Iphone!");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " no Iphone!");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no Iphone!");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Iphone!");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada no Iphone!");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no Iphone!");
    }

    public void atender() {
        System.out.println("Atendendo ligação no Iphone!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no Iphone!");
    }
}
