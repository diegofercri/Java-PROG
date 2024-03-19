package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private String matricula;
    private LocalDateTime hora;
    private boolean pagado;

    public Ticket(String matricula, LocalDateTime hora) {
        this.matricula = matricula;
        this.hora = hora;
        this.pagado = false;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getHora() {
        return this.hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public boolean isPagado() {
        return this.pagado;
    }

    public boolean getPagado() {
        return this.pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "{" +
                " matricula='" + getMatricula() + "'" +
                ", hora='" + getHora() + "'" +
                ", pagado='" + isPagado() + "'" +
                "}";
    }

    public double calcularPrecio() {
        double precio;
        Duration duracion = Duration.between(this.hora, LocalDateTime.now());
        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;

        if (horas >= 10) {
            precio = 17.0;
        } else {
            precio = horas * 1.7 + (minutos * 0.03);
        }

        return precio;
    }
}
