package Principal;

public class Pedido {
	private static double total;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		Pedido.total += total;
	}
	
	
	
}
