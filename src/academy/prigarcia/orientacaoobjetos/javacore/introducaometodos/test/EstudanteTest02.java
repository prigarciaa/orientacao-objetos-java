package academy.prigarcia.orientacaoobjetos.javacore.introducaometodos.test;

import academy.prigarcia.orientacaoobjetos.javacore.introducaometodos.dominio.Estudante;
import academy.prigarcia.orientacaoobjetos.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Priscila";
        estudante1.idade = 38;
        estudante1.sexo = 'F';

        estudante2.nome = "Midoriya";
        estudante2.idade = 15;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();

    }
}
