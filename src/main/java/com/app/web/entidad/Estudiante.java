package com.app.web.entidad;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",nullable = false,length = 50)
	private String nombre;
	
	@Column(name = "apellido",nullable = false,length = 50)
	private String apellido;
	
	@Column(name = "email",nullable = false,length = 50,unique = true)
	private String email;

	
}
