package it.sogei.svildep.interrogazioneservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class TesoreriaDto extends Dto {

    private String codice;
    private String tipoConto;
    private String numeroConto;

}
