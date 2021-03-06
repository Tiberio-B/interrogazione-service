package it.sogei.svildep.interrogazioneservice.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTipoIndirizzo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_INDIRIZZO")
public class TipoIndirizzo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_INDIRIZZO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_INDIRIZZO")
    private String descrizioneTipoIndirizzo;
    @Column(name = "CODI_CODICE_TIPO_INDIRIZZO")
    @Enumerated(EnumType.STRING)
    private FlagTipoIndirizzo TipoIndirizzo;
}
