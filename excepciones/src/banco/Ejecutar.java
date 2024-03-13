package banco;

public class Ejecutar {

	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente("ES0398398393", "Diego", 100);
		
		try {
			cc.reintegro(20);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(cc);
	}
}
