package it.sogei.svildep.interrogazioneservice.controller;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.exception.SvildepException;
import it.sogei.svildep.interrogazioneservice.service.DepositoService;
import it.sogei.svildep.interrogazioneservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("deposito")
@RequiredArgsConstructor
public class DepositoController {

    private final DepositoService depositoService;
    private final AuthService authService;

    @GetMapping
    public ResponseEntity<List<DepositoDto>> listaDepositi() throws SvildepException {
        return ResponseEntity.ok().body(depositoService.getAll());
    }

    @GetMapping("{cf}")
    public ResponseEntity<List<DepositoDto>> listaDepositiPerSoggetto(@PathVariable String cf) throws SvildepException {
        return ResponseEntity.ok().body(depositoService.getAllByCfSoggetto(cf));
    }

    @GetMapping("{numeroNazionale}")
    public ResponseEntity<DepositoDto> getDeposito(@PathVariable String numeroNazionale) throws SvildepException {
        DepositoDto dto = depositoService.get(numeroNazionale);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }
}
