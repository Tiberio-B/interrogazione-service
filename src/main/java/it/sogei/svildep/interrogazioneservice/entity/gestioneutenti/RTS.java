package it.sogei.svildep.interrogazioneservice.entity.gestioneutenti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import it.sogei.svildep.entity.gestionesoggetti.Recapito;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_RTS")
public class RTS extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_RTS")
    private Long id;
    @Column(name = "DESC_DENOMINAZIONE_RTS")
    private String denominazioneRTS;
    @ManyToOne
    @JoinColumn(name = "FK1_COMUNI_RTS")
    private Comune comune;
    @ManyToOne
    @JoinColumn(name = "FK1_RECAPITI_RTS")
    private Recapito recapito;
}
