package cunori.lsbd.proyectos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cunori.lsbd.proyectos.model.Tipo;
import cunori.lsbd.proyectos.repository.TipoRepositoryI;

@Service
public class TipoServicio {
	
	private final TipoRepositoryI tri;

	public TipoServicio(TipoRepositoryI tri) {
		super();
		this.tri = tri;
	}
	
	
	public Tipo saveTipo(Tipo t) {
		return this.tri.save(t);
	}
	
	public List<Tipo> findAllTipos() {
		return this.tri.findAll();
	}
	
	public void deleteTipo(Integer id) {
		this.tri.deleteById(id);
	}
	
}
