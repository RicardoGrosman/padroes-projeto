Singleton Class
Descrição
A classe Singleton implementa o padrão de projeto Singleton em Java, garantindo que apenas uma instância da classe exista durante a execução do programa. Esta classe é usada para gerenciar informações globais, como a marca da impressora (marcaImpressora) e o usuário logado (usuarioLogado).
O padrão Singleton é útil em cenários onde é necessário um ponto de acesso único a um recurso compartilhado, como configurações de sistema ou conexões com dispositivos.
Estrutura da Classe

Atributos:

marcaImpressora: Armazena a marca da impressora (String).
usuarioLogado: Armazena o nome do usuário logado (String).
instance: Instância única da classe Singleton (estática).


Métodos:

getInstance(): Retorna a instância única da classe (método estático).
getMarcaImpressora(): Retorna o valor de marcaImpressora.
setMarcaImpressora(String): Define o valor de marcaImpressora.
getUsuarioLogado(): Retorna o valor de usuarioLogado.
setUsuarioLogado(String): Define o valor de usuarioLogado.



Como Usar

Obter a instância:
Singleton singleton = Singleton.getInstance();


Definir valores:
singleton.setMarcaImpressora("HP");
singleton.setUsuarioLogado("admin");


Acessar valores:
System.out.println("Marca da Impressora: " + singleton.getMarcaImpressora());
System.out.println("Usuário Logado: " + singleton.getUsuarioLogado());



Exemplo de Código
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setMarcaImpressora("Epson");
        singleton.setUsuarioLogado("joao");

        System.out.println("Marca da Impressora: " + singleton.getMarcaImpressora());
        System.out.println("Usuário Logado: " + singleton.getUsuarioLogado());
    }
}

Compilação e Execução

Certifique-se de ter o Java Development Kit (JDK) instalado.
Salve a classe Singleton em um arquivo chamado Singleton.java.
Crie um arquivo Main.java com o código de exemplo acima.
Compile os arquivos:javac Singleton.java Main.java


Execute o programa:java Main

