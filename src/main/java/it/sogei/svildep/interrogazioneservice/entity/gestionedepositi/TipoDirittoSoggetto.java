package it.sogei.svildep.interrogazioneservice.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTipoDirittoSoggetto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_DIRITTO_SOGGETTO")
public class TipoDirittoSoggetto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_DIRITTO_SOGGETTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_DIRITTO_SOGGETTO")
    private String descrizioneTipoDirittoSoggetto;
    @Column(name = "CODI_CODICE_DIRITTO")
    private FlagTipoDirittoSoggetto codiceDiritto;
}
