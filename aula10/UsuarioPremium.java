package aula10;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    public void criarPostagemEmDestaque(String conteudo) {
        Postagem postagem = new Postagem(conteudo + " (Destaque)");
        this.postagens.add(postagem);
    }
}
