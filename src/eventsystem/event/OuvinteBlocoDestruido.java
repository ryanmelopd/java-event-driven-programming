package eventsystem.event;

public class OuvinteBlocoDestruido implements OuvinteEvento {
    @Override
    public void aoOcorrer(BlocoDestruidoEvento evento) {
        System.out.println(evento.getPersonagem().getNome() + " destruiu um bloco de " + evento.getBloco().getTipo() + "!");
    }
}
