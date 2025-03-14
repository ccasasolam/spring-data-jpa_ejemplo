package cunori.lsbd.proyectos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cunori.lsbd.proyectos.model.Proyecto;
import cunori.lsbd.proyectos.service.ProyectoServicio;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	private final ProyectoServicio ps;

	public ProyectoController(ProyectoServicio ps) {
		super();
		this.ps = ps;
	}
	
	@PostMapping("/proyectos")
	public Proyecto save(
			@RequestBody Proyecto p
	) {
		return this.ps.saveProyecto(p);
	}
	
	@GetMapping("/proyectos")
	public List<Proyecto> getProyectos(){
		return this.ps.findAllProyectos();
	}
	
	@DeleteMapping("/proyectos/{id}")
	public String deleteProyecto( 
			@PathVariable Integer id
 	) {
		this.ps.deleteProyecto(id);
		return "El proyecto con id: "+ id + " fue eliminado.";
	}
}
