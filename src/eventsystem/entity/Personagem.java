package eventsystem.entity;

import eventsystem.event.BlocoDestruidoEvento;
import eventsystem.system.SistemaDeEventos;

public class Personagem {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean destruirBloco(Bloco bloco, SistemaDeEventos sistemaDeEventos) {
        if (bloco.destruir()) {
            BlocoDestruidoEvento evento = new BlocoDestruidoEvento(this, bloco);
            sistemaDeEventos.publicar(evento);
            return true;
        } else {
            return false;
        }
    }
}
