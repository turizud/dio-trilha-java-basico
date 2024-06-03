package Iphone;

public class Iphone implements Celular, Navegador, ReprodutorMusical{
    
        
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    //  métodos da interface Celular
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //  métodos da interface Navegador
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        
        Iphone meuiPhone = new Iphone();
        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.selecionarMusica("Hey Jude");
        meuiPhone.tocar();
        meuiPhone.exibirPagina("www.google.com");
        meuiPhone.adicionarNovaAba();
    }
}

