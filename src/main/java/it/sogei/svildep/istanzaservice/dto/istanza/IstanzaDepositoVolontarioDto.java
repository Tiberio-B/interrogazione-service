package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class IstanzaDepositoVolontarioDto extends IstanzaDto {

    private SoggettoDto proprietario;

    IstanzaDepositoVolontarioDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_VOLONTARIO");
    }
}
