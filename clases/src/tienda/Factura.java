package tienda;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Factura {
    private int numero;
    private LocalDateTime fecha;
    private ArrayList<LineaFactura> lineas;
    private boolean pagada;

    public int getNumero() {
        return this.numero;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LineaFactura> getLineas() {
        return this.lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public boolean isPagada() {
        return this.pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }


}
