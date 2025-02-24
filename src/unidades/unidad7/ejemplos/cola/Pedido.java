package unidades.unidad7.ejemplos.cola;

public class Pedido {
	
	private int id;
	private String tipoMercancia;
	private double kg;
	private String tipoPedido;
	
	public Pedido(int id, String tipoMercancia, double kg, String tipoPedido) {
		super();
		this.id = id;
		this.tipoMercancia = tipoMercancia;
		this.kg = kg;
		this.tipoPedido = tipoPedido;
	}

	public int getId() {
		return id;
	}

	public String getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public String getTipoPedido() {
		return tipoPedido;
	}

	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", tipoMercancia=" + tipoMercancia + ", kg=" + kg + ", tipoPedido=" + tipoPedido
				+ "]";
	}
	
	
	
	
	

}
