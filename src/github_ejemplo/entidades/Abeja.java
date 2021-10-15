package github_ejemplo.entidades;

/**
 *
 * @author Esteban
 */
public class Abeja {

    private int id;
    private String rango;
    private int horasDeVuelo;
    private int pruduccionMiel;

    public Abeja() {
    }

    public Abeja(int id, String rango, int horasDeVuelo, int pruduccionMiel) {
        this.id = id;
        this.rango = rango;
        this.horasDeVuelo = horasDeVuelo;
        this.pruduccionMiel = pruduccionMiel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public void setHorasDeVuelo(int horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    public int getPruduccionMiel() {
        return pruduccionMiel;
    }

    public void setPruduccionMiel(int pruduccionMiel) {
        this.pruduccionMiel = pruduccionMiel;
    }

    @Override
    public String toString() {
        return "Abeja{" + "id=" + id + ", rango=" + rango + ", horasDeVuelo=" + horasDeVuelo + ", pruduccionMiel=" + pruduccionMiel + '}';
    }
    
    
    
}
