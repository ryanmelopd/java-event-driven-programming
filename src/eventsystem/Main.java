package eventsystem;

import eventsystem.entity.Bloco;
import eventsystem.entity.Personagem;
import eventsystem.event.OuvinteBlocoDestruido;
import eventsystem.system.SistemaDeEventos;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.setNome("Ryan");

        Bloco bloco = new Bloco("Pedra", true);

        OuvinteBlocoDestruido ouvinte = new OuvinteBlocoDestruido();

        SistemaDeEventos sistemaDeEventos = new SistemaDeEventos();
        sistemaDeEventos.adicionar(ouvinte);

        boolean sucesso = personagem.destruirBloco(bloco, sistemaDeEventos);

        if (!sucesso) {
            System.out.println("Não foi possível destruir o bloco.");
        }
    }
}