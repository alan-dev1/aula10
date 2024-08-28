package aula10;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private List<Postagem> postagens;
    private List<Usuario> seguindo;

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.postagens = new ArrayList<>();
        this.seguindo = new ArrayList<>();
    }

    public Usuario(String nomeUsuario2, String senha2, String email2) {
		// TODO Auto-generated constructor stub
	}

	public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setSenha(String novaSenha) {
        if (novaSenha.length() >= 6) { // Validação da senha
            this.senha = novaSenha;
        } else {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres.");
        }
    }

    public void criarPostagem(String conteudo) {
        Postagem postagem = new Postagem(conteudo);
        this.postagens.add(postagem);
    }

    public void seguir(Usuario usuario) {
        if (!seguindo.contains(usuario)) {
            seguindo.add(usuario);
        }
    }

    public List<Postagem> visualizarFeed() {
        List<Postagem> feed = new ArrayList<>();
        for (Usuario usuario : seguindo) {
            feed.addAll(usuario.postagens);
        }
        return feed;
    }
}
