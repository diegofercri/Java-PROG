package parking;

import java.util.ArrayList;

public class Parking {
    private int capacidad;
    private ArrayList<Ticket> tickets;

    public Parking(int capacidad) {
        this.capacidad = capacidad;
        this.tickets = new ArrayList<Ticket>();
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "{" +
                " capacidad='" + getCapacidad() + "'" +
                ", tickets='" + getTickets() + "'" +
                "}";
    }

    public boolean searchTicketByMatricula(String matricula) {
        for (Ticket ticket : tickets) {
            if (ticket.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public void addTicket(Ticket t) throws TicketException {
        if (this.tickets.size() >= this.capacidad) {
            throw new TicketException("El parking esta completo");
        }
        if (this.searchTicketByMatricula(t.getMatricula())) {
            throw new TicketException("La matricula ya esta registrada");
        }
        this.tickets.add(t);
    }

    public void removeTicket(Ticket t) throws TicketException {
        if (!t.getPagado()) {
            throw new TicketException("Este ticket no ha sido pagado");
        }
        this.tickets.remove(t);
    }
}
