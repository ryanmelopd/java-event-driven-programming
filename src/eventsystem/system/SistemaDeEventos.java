package eventsystem.system;

import eventsystem.event.BlocoDestruidoEvento;
import eventsystem.event.OuvinteEvento;

import java.util.HashSet;
import java.util.Set;

public class SistemaDeEventos {
    private Set<OuvinteEvento> ouvintesSet = new HashSet<>();

    public void adicionar(OuvinteEvento ouvinte) {
        ouvintesSet.add(ouvinte);
    }

    public void remover(OuvinteEvento ouvinte) {
        ouvintesSet.remove(ouvinte);
    }

    public void publicar(BlocoDestruidoEvento evento) {
        for (OuvinteEvento ouvinte : ouvintesSet) {
            ouvinte.aoOcorrer(evento);
        }
    }
}
