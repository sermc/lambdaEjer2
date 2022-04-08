package ejercicio2.main;

import java.math.BigDecimal;

public class Product implements Comparable<Product>{
	private String nombre;
	private BigDecimal precio;
	private Tax tipo;

	public Product(String nombre, BigDecimal precio, Tax tipo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Tax getTipo() {
		return tipo;
	}

	public void setTipo(Tax tipo) {
		this.tipo = tipo;
	}
	
	@Override
    public int compareTo(Product o) {
        int ordenado=this.nombre.compareTo(o.getNombre());
        return ordenado;
    }
	
}
