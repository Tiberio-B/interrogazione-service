package it.sogei.svildep.interrogazioneservice;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;
import it.sogei.svildep.interrogazioneservice.util.GeneratoreCasuale;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MockDataLoader implements ApplicationRunner {

    public static final int NUM_ISTANZE = 10;

    private GeneratoreCasuale random = new GeneratoreCasuale();

    public static Map<String, DepositoDto> databaseDeposito = new HashMap<>();
    public static Map<String, TesoreriaDto> databaseTesoreria = new HashMap<>();
    public static Map<String, RtsDto> databaseRts = new HashMap<>();

    public void run(ApplicationArguments args) {
        initDepositi(NUM_ISTANZE);
        initTesorerie(NUM_ISTANZE);
        initRts(NUM_ISTANZE);
    }

    private void initDepositi(int numDepositi) {
        for (int i=0; i < numDepositi; i++) {
            DepositoDto deposito = random.depositoCasuale(i);
            databaseDeposito.put(deposito.getId(), deposito);
        }
    }

    private void initTesorerie(int numTesorerie) {
        for (int i=0; i < numTesorerie; i++) {
            TesoreriaDto tesoreria = random.tesoreriaCasuale(i);
            databaseTesoreria.put(tesoreria.getId(), tesoreria);
        }
    }

    private void initRts(int numRts) {
        for (int i=0; i < numRts; i++) {
            RtsDto rts = random.rtsCasuale(i);
            databaseRts.put(rts.getId(), rts);
        }
    }

}
