package org.trueFanBoutique.dataBase.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.trueFanBoutique.dataBase.dto.ChangePassword;
import org.trueFanBoutique.dataBase.dto.ChangePhone;
import org.trueFanBoutique.dataBase.model.Usuario;
import org.trueFanBoutique.dataBase.service.UsuarioService;

@RestController
@RequestMapping(path="/truefan/usuarios/")
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	

	@GetMapping
	public List<Usuario> getUsuarios(){
		return usuarioService.getAllUsuarios();
	}//getAllUsuario
	
	@GetMapping(path="{userId}")
	public Usuario getUsuario(@PathVariable("userId")Long id) {
		return usuarioService.getUsuario(id);
	}//getUsuario
	
	@DeleteMapping(path="{userId}")
	public Usuario deleteUsuario(@PathVariable("userId")Long id) {
		return usuarioService.deleteUsuario(id);
	}//deleteUsuario
	
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	}//addUsuario
	
	@PutMapping(path="{userId}")
	public Usuario updateUsuario(@PathVariable("userId")Long id, @RequestParam(required=false)@RequestBody ChangePassword changePassword, 
@RequestParam(required=false)@RequestBody ChangePhone changePhone) {
		return usuarioService.updateUsuario(id, changePassword, changePhone);
	}//update
		
}//class UsuarioController 
