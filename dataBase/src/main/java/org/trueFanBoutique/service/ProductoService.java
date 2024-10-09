package org.trueFanBoutique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.trueFanBoutique.model.Producto;

@Service
public class ProductoService {
	private static ArrayList<Producto> lista = new ArrayList<Producto>();

	public ProductoService() {
		lista.add(new Producto("Cuaderno Profesional Norma / Cuadro grande / 200 hojas",
				"Cuaderno profesional cuadro grande / Cubiertas estándar / Espiral doble", "norma1.gif", 95.50,
				"urban"));
	}

	public List<Producto> getAllProductos() {

		return lista;
	}

	public Producto getProducto(Long prodId) {
		Producto prod = new Producto();
		prod = null;
		for (Producto producto : lista) {
			if (producto.getId() == prodId) {
				prod = producto;
			}
		}
		return prod;
	}

	public Producto addProducto(Producto producto) {
		lista.add(producto);
		return producto;
	}

	public Producto deleteProducto(Long prodId) {
		Producto prod = null;
		for (Producto producto : lista) {
			if (producto.getId() == prodId) {
				prod = lista.remove(lista.indexOf(producto));
				break;
			}
		}
		return prod;
	}

	public Producto updateProducto(Long prodId, String genero, String nombre, String descripcion, String imagen,
			Double precio) {
		Producto prod = null;
		for (Producto producto : lista) {
			if (producto.getId() == prodId) {
				if (nombre != null)
					producto.setNombre(nombre);
				if (descripcion != null)
					producto.setDescripcion(descripcion);
				if (imagen != null)
					producto.setImagen(imagen);
				if (precio != null)
					producto.setPrecio(precio);
				prod = producto;
				break;
			} // if
		} // foreach
		return prod;
	}

}
