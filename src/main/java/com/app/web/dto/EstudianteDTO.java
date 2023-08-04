package com.app.web.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;

}
