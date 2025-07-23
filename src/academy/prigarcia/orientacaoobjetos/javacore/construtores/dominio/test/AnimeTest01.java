package academy.prigarcia.orientacaoobjetos.javacore.construtores.dominio.test;


import academy.prigarcia.orientacaoobjetos.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime( "Haikyuu","TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
    
}
