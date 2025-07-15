package academy.prigarcia.orientacaoobjetos.javacore.test;

import academy.prigarcia.orientacaoobjetos.javacore.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Priscila";
        professor.idade = 38;
        professor.sexo = 'F';

        System.out.println("Nome:" + professor.nome + " " + "Idade:" + professor.idade + " " + "Sexo:" + professor.sexo);
    }
}
