package parking;

import java.time.LocalDateTime;

public class Ejecutar {
    public static void main(String[] args) throws InterruptedException, TicketException {
		Parking parking = new Parking(2);
		Ticket t1 = new Ticket("1234MHK", LocalDateTime.of(2024, 3, 14, 11, 00));
		Ticket t2 = new Ticket("9876LBT", LocalDateTime.of(2024, 3, 14, 17, 00));
		Ticket t3 = new Ticket("9856LBT", LocalDateTime.of(2024, 3, 14, 16, 30));

		parking.addTicket(t1);
		parking.addTicket(t2);
		parking.addTicket(t3);
        
		System.out.println(parking.getTickets());
		System.out.println(t1.calcularPrecio());
		System.out.println(t2.calcularPrecio());
	}
}
