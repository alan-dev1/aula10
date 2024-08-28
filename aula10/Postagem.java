package aula10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Postagem {
    private String conteudo;
    private LocalDateTime dataCriacao;
    private int curtidas;
    private List<String> comentarios;

    public Postagem(String conteudo) {
        this.conteudo = conteudo;
        this.dataCriacao = LocalDateTime.now();
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void adicionarComentario(String comentario) {
        this.comentarios.add(comentario);
    }

    public List<String> visualizarComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return conteudo + " (Criado em: " + dataCriacao + ") - Curtidas: " + curtidas;
    }
}
