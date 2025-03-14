package cunori.lsbd.proyectos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cunori.lsbd.proyectos.model.Tipo;
import cunori.lsbd.proyectos.service.TipoServicio;

@RestController
@RequestMapping("/api")
public class TipoController {
	
	private final TipoServicio ts;

	public TipoController(TipoServicio ts) {
		super();
		this.ts = ts;
	}
	
	@PostMapping("/tipos")
	public Tipo save(
			@RequestBody Tipo t
	) {
		return ts.saveTipo(t);
	}
	
	@GetMapping("/tipos")
	public List<Tipo> getTipos() {
		return ts.findAllTipos();
	}
	
	@DeleteMapping("/tipos/{id}")
	public String deleteTipo(
			@PathVariable Integer id
	) {
		ts.deleteTipo(id);
		return "El tipo con id: " + id +" ha sido eliminado."; 
	}
	
}
 