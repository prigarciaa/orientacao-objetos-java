package academy.prigarcia.orientacaoobjetos.javacore.introducaometodos.test;

import academy.prigarcia.orientacaoobjetos.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Priscila";
        //pessoa.idade = 37;
        pessoa.setNome("Priscila");
        pessoa.setIdade(37);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
