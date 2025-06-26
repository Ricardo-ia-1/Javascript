import java.io.File;

public class RM {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java RM <nome_do_arquivo>");
            return;
        }

        File arquivo = new File(args[0]);
        if (arquivo.delete()) {
            System.out.println("Arquivo deletado com sucesso.");
        } else {
            System.out.println("Falha ao deletar o arquivo.");
        }
    }
}
/*
Para executar este código, siga os passos abaixo:

1. Compile o arquivo Java:
   javac RM.java

2. Execute o programa, passando o nome do arquivo que deseja deletar como argumento:
   java RM nome_do_arquivo.txt

Substitua "nome_do_arquivo.txt" pelo nome do arquivo que você deseja remover.
*/
