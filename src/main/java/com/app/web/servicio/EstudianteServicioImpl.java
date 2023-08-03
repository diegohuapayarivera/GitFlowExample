package com.app.web.servicio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.web.dto.EstudianteDTO;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio repositorio;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<EstudianteDTO> listarTodosLosEstudiantes() {
        return repositorio.findAll().stream().map(estudiantes -> modelMapper.map(estudiantes, EstudianteDTO.class)).collect(Collectors.toList());
    }

    @Override
    public Estudiante guardarEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudianteNuevo = modelMapper.map(estudianteDTO, Estudiante.class);
        return repositorio.save(estudianteNuevo);
    }

    @Override
    public boolean obtenerEstudiantePorId(Long id) {
        return repositorio.findById(id).isPresent();
    }

    @Override
    public Estudiante actualizarEstudiante(EstudianteDTO estudianteDTO) {
        if (this.obtenerEstudiantePorId(estudianteDTO.getId())) {
            Estudiante estudianteExistente = modelMapper.map(estudianteDTO, Estudiante.class);
            return repositorio.save(estudianteExistente);
        }
        return null;
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);

    }

}
