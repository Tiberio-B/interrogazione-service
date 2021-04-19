package it.sogei.svildep.interrogazioneservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlagStatoIstanza {

    SIB("In bozza"),
    SII("Inoltrata");

    public String descrizione;
}
