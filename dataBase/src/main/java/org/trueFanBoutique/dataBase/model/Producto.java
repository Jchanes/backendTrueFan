package org.trueFanBoutique.dataBase.model;

public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private String genero;
	
    private static Long total = Long.valueOf(0);
    
    public Producto(Long id, String nombre, String descripcion, String imagen, double precio, String genero) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.genero = genero;
	    Producto.total++;
	    id = Producto.total;
    }//Constructor
    
    public Producto() {
    	Producto.total++;
	    id = Producto.total;
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", genero=" + genero + "]";
	}

    
}//class Producto
