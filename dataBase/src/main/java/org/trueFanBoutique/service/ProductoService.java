package org.trueFanBoutique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trueFanBoutique.model.Producto;
import org.trueFanBoutique.repository.ProductoRepository;

@Service
public class ProductoService {
	
	private final ProductoRepository productoRepository;

	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	public List<Producto> getAllProductos() {

		return productoRepository.findAll();
	}

	public Producto getProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalArgumentException("El producto con el id [" + prodId + "] no existe."));
	}

	public Producto addProducto(Producto producto) {
		return producto;
	}

	public Producto deleteProducto(Long prodId) {
		Producto prod = null;
//		for (Producto producto : lista) {
//			if (producto.getId() == prodId) {
//				prod = lista.remove(lista.indexOf(producto));
//				break;
//			}
//		}
		return prod;
	}

	public Producto updateProducto(Long prodId, String genero, String nombre, String descripcion, String imagen,
			Double precio) {
		Producto prod = null;
//		for (Producto producto : lista) {
//			if (producto.getId() == prodId) {
//				if (nombre != null)
//					producto.setNombre(nombre);
//				if (descripcion != null)
//					producto.setDescripcion(descripcion);
//				if (imagen != null)
//					producto.setImagen(imagen);
//				if (precio != null)
//					producto.setPrecio(precio);
//				prod = producto;
//				break;
//			} // if
//		} // foreach
		return prod;
	}

}
