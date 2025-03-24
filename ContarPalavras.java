package output;

public class ContarPalavras {

    import java.util.Scanner;

    // Classe base
    class Texto {
        protected String conteudo;
    
        public Texto(String conteudo) {
            this.conteudo = conteudo;
        }
    
        public int contarPalavras() {
            if (conteudo.isEmpty()) {
                return 0;
            }
            String[] palavras = conteudo.split("\\s+");
            return palavras.length;
        }
    
        public void exibirTexto() {
            System.out.println("Texto original: " + conteudo);
        }
    }
    
    // Classe derivada (Herança)
    class TextoFormatado extends Texto {
        public TextoFormatado(String conteudo) {
            super(conteudo);
        }
    
        // Polimorfismo: sobrescrevendo exibirTexto()
        @Override
        public void exibirTexto() {
            System.out.println("Texto formatado: " + conteudo.toUpperCase());
        }
    }
    
    // Classe principal
    public class ContarPalavras {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite um texto: ");
            String entrada = scanner.nextLine();
    
            // Criando objetos
            Texto texto = new Texto(
        
    
}
