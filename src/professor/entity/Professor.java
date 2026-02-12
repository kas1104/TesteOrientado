package professor.entity;

public class Professor {
    //Atributos da classe entidade Professor
    private String[] nomesprofessores;
    private static int contador;
    private int tamanho;

    //Construtor que possui a variavel int tamanho e preciso de um construtor par aatribuir o tamanho da lista
    public Professor(int tamanho){
        this.tamanho = tamanho;
        nomesprofessores = new String[tamanho];
    }

    //Metodo que é utilizado para retorna os nomes dentro da lista Nomesprofessores ao usuario
    public String[] getNomesprofessores() {
        return nomesprofessores;
    }

    //Metodo que pega o atributo tamanho definido pelo usuario
    public int getTamanho() {
        return tamanho;
    }
        //Metodo criado para adicionar nomes a lista nomesprofessores e que possui um contador estatico que a cada posição adiciona um valor a lista
    public void addProfessor(String nomeDoproprioMetodo){
        nomesprofessores[contador] = nomeDoproprioMetodo;
        contador++;
    }
}
