import equipamentos.aparelhotelefonico.Nokia1100;
import equipamentos.navegadorinternet.Chrome;
import equipamentos.reprodutormusical.Diskman;
import equipamentos.smartphone.Smartphone;

public class Iphone extends Smartphone {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone();
        Nokia1100 tijolo = new Nokia1100();
        Chrome chrome = new Chrome();
        Diskman dm = new Diskman();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Killing in the name off!");
        iphone.ligar("01199120013");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        tijolo.atender();
        tijolo.ligar("02191301351");
        chrome.exibirPagina("www.github.com");
        dm.selecionarMusica("Bulls on parade");
        dm.tocar();
    }
    
}
