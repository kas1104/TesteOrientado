import professor.entity.Professor;
import java.util.Scanner;

public class aulaOrientacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Professor professor1 = new Professor(" ");


        professor1.addProfessor("joao");
        professor1.addProfessor("Carlos");
        professor1.addProfessor("Felipe");


        for(int x = 0; x < professor1.getNomesprofessores().length; x++){
            System.out.println(professor1.getNomesprofessores()[x]);
        }
    }
}
