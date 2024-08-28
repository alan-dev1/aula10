package aula10;

public class UsuarioAdmin extends Usuario {

    public UsuarioAdmin(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    public void deletarPostagem(Postagem postagem) {
        if (this.postagens.contains(postagem)) {
            this.postagens.remove(postagem);
        } else {
            throw new IllegalArgumentException("Postagem não encontrada.");
        }
    }
}
