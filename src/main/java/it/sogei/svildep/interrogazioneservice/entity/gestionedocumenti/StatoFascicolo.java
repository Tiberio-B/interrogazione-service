package it.sogei.svildep.interrogazioneservice.entity.gestionedocumenti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_STATI_FASCICOLO")
public class StatoFascicolo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATI_FASCICOLO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_FASCICOLO")
    private String descrizioneStatoFascicolo;
}
