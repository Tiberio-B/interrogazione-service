package it.sogei.svildep.interrogazioneservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoSoggetto {

    TSF("Soggetto fisico"),
    TSG("Soggetto giuridico"),
    TSD("Ditta individuale");

    public String descrizione;
}
