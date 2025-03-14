package cunori.lsbd.proyectos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cunori.lsbd.proyectos.model.Proyecto;
import cunori.lsbd.proyectos.repository.ProyectoRepositoryI;

@Service
public class ProyectoServicio {

	private final ProyectoRepositoryI pri;

	public ProyectoServicio(ProyectoRepositoryI pri) {
		super();
		this.pri = pri;
	}
	
	public Proyecto saveProyecto(Proyecto p) {
		return this.pri.save(p);
	}
	
	public List<Proyecto> findAllProyectos() {
		return this.pri.findAll();
	}
	
	public void deleteProyecto(Integer id) {
		this.pri.deleteById(id);
	}
	
}
