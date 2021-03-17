package it.sogei.svildep.interrogazioneservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class RtsDto extends Dto {

    private String denominazione;
    private String telefono;
    private String pec;

}
