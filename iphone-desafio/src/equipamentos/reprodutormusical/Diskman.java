package equipamentos.reprodutormusical;

public class Diskman implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando musica no Diskman!");
    }

    public void pausar() {
        System.out.println("Musica pausada no Diskman!");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " no Diskman!");
    }
    
}
