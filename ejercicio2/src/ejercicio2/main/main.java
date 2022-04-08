package ejercicio2.main;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {

	private static BigDecimal total2 = new BigDecimal("0");
	private static BigDecimal ivaCalculado = new BigDecimal("0");

	public static void main(String[] args) {
		List<Product> shoppingCart = Arrays.asList(
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		
		// Implementación
	
		//Coste total de la compra
		shoppingCart.stream().forEach(pro ->{
				ivaCalculado = pro.getPrecio().multiply(pro.getTipo().getPrecio());
				total2= total2.add(pro.getPrecio().add(ivaCalculado));
		});
		System.out.println("PRECIO TOTAL DE LA COMPRA");
		System.out.println("-----------------------------------------");
		System.out.println(total2);
		
		//Listar productos que empiezan por "C" de manera ordenada en una lista separada por comas
		System.out.println();
		System.out.println("LISTA DE PRODUCTOS QUE EMPIEZAN POR C ORDENADO EN UNA LISTA SEPARADA POR COMAS");
		System.out.println("------------------------------------------");
		Stream <Product> productos=shoppingCart.stream().filter(producto->producto.getNombre().startsWith("C")).sorted();
        productos.forEach((p)-> {
            System.out.println(p.getNombre());
        });
	} 

}
