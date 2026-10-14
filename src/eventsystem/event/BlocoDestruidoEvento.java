package eventsystem.event;

import eventsystem.entity.Bloco;
import eventsystem.entity.Personagem;

public class BlocoDestruidoEvento {
    Personagem personagem;
    Bloco bloco;

    public BlocoDestruidoEvento(Personagem personagem, Bloco bloco) {
        this.personagem = personagem;
        this.bloco = bloco;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }
}
