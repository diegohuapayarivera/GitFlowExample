package com.app.web.servicio;

import java.util.List;

import com.app.web.dto.EstudianteDTO;
import com.app.web.entidad.Estudiante;

public interface EstudianteServicio {

	public List<EstudianteDTO> listarTodosLosEstudiantes();
	
	public Estudiante guardarEstudiante(EstudianteDTO estudianteDTO);
	
	public boolean obtenerEstudiantePorId(Long id);
	
	public Estudiante actualizarEstudiante(EstudianteDTO estudianteDTO);
	
	public void eliminarEstudiante(Long id);
}
