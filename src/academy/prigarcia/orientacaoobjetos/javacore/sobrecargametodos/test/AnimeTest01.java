package academy.prigarcia.orientacaoobjetos.javacore.sobrecargametodos.test;

import academy.prigarcia.orientacaoobjetos.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
    
}
