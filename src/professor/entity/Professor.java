package professor.entity;

public class Professor {
    //Atributos da classe entidade Professor
    private String[] nomesprofessores;
    private String[] matriculasProfessores;
    private static int contador;
    private static int contadorMatricula;
    private static int tamanho;

    //Construtor que possui a variavel int tamanho e preciso de um construtor par aatribuir o tamanho da lista
    public Professor(int tamanho){
        Professor.tamanho = tamanho;

    }

    //Construtor responsavel por dar o tamanho das listas
    public Professor(){
        nomesprofessores = new String[tamanho];
        matriculasProfessores = new String[tamanho];
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

    public String[] getMatriculasProfessores() {
        return matriculasProfessores;
    }

    public void addMatriculaProfessor(String matriculaProfessor){
        matriculasProfessores[contadorMatricula] = matriculaProfessor;
        contadorMatricula++;
    }
}
