package televisor;

public class Televisor {
    int canal;
    int volumen;

    public Televisor (int canal) {
        setCanal(canal);
        setVolumen(5);
    }

    public Televisor (int canal, int volumen) {
        setCanal(canal);
        setVolumen(volumen);
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen < 0 || volumen > 100) {
            this.volumen = 5;
        } else {
            this.volumen = volumen;
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        if (canal < 1 || canal > 100) {
            this.canal = 1;
        } else {
            this.canal = canal;
        }
    }

    public void subirVolumen() {
        setVolumen(this.volumen + 1);
    }

    public void bajarVolumen() {
        setVolumen(this.volumen - 1);
    }

    public void subirCanal() {
        setCanal(this.canal + 1);
    }
    
    public void bajarCanal() {
        setCanal(this.canal - 1);
    }
    
}
