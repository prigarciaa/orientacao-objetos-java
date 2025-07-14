package academy.prigarcia.orientacaoobjetos.javacore.test;

import academy.prigarcia.orientacaoobjetos.javacore.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Priscila";
        estudante.idade = 38;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
