package professor.entity;

public class Professor {
    private String[] nomesprofessores;
    private String nome;
    private static int contador;
    private int tamanho;


    public Professor(String nome){
        this.nome = nome;
        nomesprofessores = new String[10];
    }


    public String[] getNomesprofessores() {
        return nomesprofessores;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void addProfessor(String nomeDoproprioMetodo){
        nomesprofessores[contador] = nomeDoproprioMetodo;
        contador++;
    }
}
