package it.sogei.svildep.interrogazioneservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlagSessoMF {

    M("Maschio"),
    F("Femmina");

    private String descrizione;
}
