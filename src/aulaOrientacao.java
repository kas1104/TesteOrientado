//Importei a classe entidade
import professor.entity.Professor;
//biblioteca Scanner para receber dados do usuario
import java.util.Scanner;

public class aulaOrientacao {
        //Função principal que vai execcutar o codigo
    public static void main(String[] args){
        //Objeto sc que vai instaciar a classe Scanner e que vai puxar os dados atribuidos pelo usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho:");
        int tamanhousuario = sc.nextInt();


        //Segundo objeto instaciado chamado professor2 em que ele recebe o tamanho do usuario e vai atribuir o tamanho do usuario ao atributo tamanho
        Professor professor2 = new Professor(tamanhousuario);

        //Parametro que limpa a memoria para não ocorrer nenhum erro!
        sc.nextLine();

        //Estrutura de repetição que atribui um nome a uma posição dentro da lista professor e o tamanho é definido pelo metodo getTamanho da classe entidade
        for(int x = 0; x < professor2.getTamanho(); x++){
            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            //Objeto que chama o metodo adicionarProfessor em que vai receber o nome de cada professor e atribuir a uma posição
            professor2.addProfessor(nome);
        }

        //Estrutura de repetição que vai receber um objeto que puxa o metodo getNomeProfessor que vai pegar o nome dos professores da lista e exibir cada um em sua posição
        for(int x = 0; x < professor2.getNomesprofessores().length; x++){
            System.out.println(professor2.getNomesprofessores()[x]);
        }
    }
}
