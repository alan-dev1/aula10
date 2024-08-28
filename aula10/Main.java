package aula10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("alice", "senha123", "alice@example.com");
        UsuarioPremium usuario2 = new UsuarioPremium("bob", "senha456", "bob@example.com");

        usuario1.criarPostagem("Meu primeiro post!");
        usuario2.criarPostagem("Postagem de Bob");
        usuario2.criarPostagemEmDestaque("Postagem em destaque de Bob");

        usuario1.seguir(usuario2);

        System.out.println("Feed de Alice:");
        List<Postagem> feed = usuario1.visualizarFeed();
        for (Postagem postagem : feed) {
            System.out.println(postagem);
        }

        // Acessando diretamente a postagem para exemplo
        Postagem postagemBob = usuario2.visualizarFeed().get(0);
        postagemBob.adicionarComentario("Ótimo post, Bob!");
        postagemBob.curtir();
        postagemBob.curtir();

        System.out.println("\nPostagens de Bob:");
        for (Postagem postagem : usuario2.visualizarFeed()) {
            System.out.println(postagem);
            System.out.println("Comentários: " + postagem.visualizarComentarios());
            System.out.println("Curtidas: " + postagem.getCurtidas());
        }
    }
}
