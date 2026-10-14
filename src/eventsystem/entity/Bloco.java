package eventsystem.entity;

public class Bloco {
    private String tipo;
    private boolean destruivel;
    private boolean destruido;

    public Bloco(String tipo, boolean destruivel) {
        this.tipo = tipo;
        this.destruivel = destruivel;
        this.destruido = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDestruivel() {
        return destruivel;
    }

    public void setDestruivel(boolean destruivel) {
        this.destruivel = destruivel;
    }

    public boolean isDestruido(boolean b) {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public boolean destruir() {
        if (!destruivel || destruido) {
            return false;
        }
        destruido = false;
        System.out.println("Bloco destruído.");
        return true;
    }
}
