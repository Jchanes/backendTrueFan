package org.trueFanBoutique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.trueFanBoutique.dto.ChangeData;
import org.trueFanBoutique.model.Usuario;

@Service
public class UsuarioService {

	private static final ArrayList<Usuario> lista = new ArrayList<Usuario>();
	
	public UsuarioService() {
		lista.add(new Usuario("Sebastian","Moran",3112341234L, "seb@gmail.com","ola1234","28-08-2024"));
		lista.add(new Usuario("Esmeralda", "Santos",5512341234L,"esme@hotmail.com","esme123.","15-09-2024"));
		lista.add(new Usuario("Jose", "Chanes", 5609876543L,"chanes@outlook.com","pepe321","09-10-2024"));
	}//constructor
	
	public List<Usuario> getAllUsuarios(){
		return lista ;
	}//getAllUsuarios (GET)
	
	public Usuario getUsuario(Long id) {
		Usuario user=null;
		for (Usuario usuario : lista) {
			if (usuario.getId()==id) {
				user=usuario;
				break;
			}//if
		}//foreach
		return user;
	}//getUsuario (GET)
	
	public Usuario addUsuario(Usuario usuario) {
		Usuario user = null;
		boolean flag = false;
		for (Usuario u : lista) {
			if(u.getEmail().equals(usuario.getEmail())) {
				flag= true;
				break;
			}//if
		}//foreach
		if(!flag) {
			lista.add(usuario);
			user=usuario;
		}//if
		return user;
	}//addUsuario (POST)
	
	public Usuario deleteUsuario(Long id) {
		Usuario user=null;
		for (Usuario usuario : lista) {
			if(usuario.getId()==id) {
				user=lista.remove(lista.indexOf(usuario));
				break;	
			}//if
		}//foreach
		return user;
	}//deleteUsuario (DEL)
	
	public Usuario updateData(Long id, ChangeData changeData) {
	    Usuario user = null;
	    for (Usuario usuario : lista) {
	        if (usuario.getId().equals(id)) {
	            // Actualizar contraseña si es necesario
	            if (changeData.getNpassword() != null && 
	                usuario.getPassword().equals(changeData.getPassword())) {
	                usuario.setPassword(changeData.getNpassword());
	            }
	            // Actualizar teléfono si es necesario
	            if (changeData.getNphone() != null && 
	                usuario.getPhone().equals(changeData.getPhone())) {
	                usuario.setPhone(changeData.getNphone());
	            }//if
	            user = usuario;
	            break;
	        }//if
	    }//foreach
	    return user;
	}//updateData

}//class UsuarioService 
