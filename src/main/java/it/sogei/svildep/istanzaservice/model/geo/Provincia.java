package it.sogei.svildep.istanzaservice.model.geo;

public enum Provincia {

    AG("Agrigento", Regione.SICILIA),
    AL("Alessandria", Regione.PIEMONTE),
    AN("Ancona", Regione.MARCHE),
    AO("Aosta", Regione.VALLE_DAOSTA),
    AQ("L'Aquila", Regione.ABRUZZO),
    AR("Arezzo", Regione.TOSCANA),
    AP("Ascoli-Piceno", Regione.MARCHE),
    AT("Asti", Regione.PIEMONTE),
    AV("Avellino", Regione.CAMPANIA),
    BA("Bari", Regione.PUGLIA),
    BT("Barletta-Andria-Trani", Regione.PUGLIA),
    BL("Belluno", Regione.VENETO),
    BN("Benevento", Regione.CAMPANIA),
    BG("Bergamo", Regione.LOMBARDIA),
    BI("Biella", Regione.PIEMONTE),
    BO("Bologna", Regione.EMILIA_ROMAGNA),
    BZ("Bolzano", Regione.TRENTINO_ALTO_ADIGE),
    BS("Brescia", Regione.LOMBARDIA),
    BR("Brindisi", Regione.PUGLIA),
    CA("Cagliari", Regione.SARDEGNA),
    CL("Caltanissetta", Regione.SICILIA),
    CB("Campobasso", Regione.MOLISE),
    CI("Carbonia Iglesias", Regione.SARDEGNA),
    CE("Caserta", Regione.CAMPANIA),
    CT("Catania", Regione.SICILIA),
    CZ("Catanzaro", Regione.CALABRIA),
    CH("Chieti", Regione.ABRUZZO),
    CO("Como", Regione.LOMBARDIA),
    CS("Cosenza", Regione.CALABRIA),
    CR("Cremona", Regione.LOMBARDIA),
    KR("Crotone", Regione.CALABRIA),
    CN("Cuneo", Regione.PIEMONTE),
    EN("Enna", Regione.SICILIA),
    FM("Fermo", Regione.MARCHE),
    FE("Ferrara", Regione.EMILIA_ROMAGNA),
    FI("Firenze", Regione.TOSCANA),
    FG("Foggia", Regione.PUGLIA),
    FC("Forli-Cesena", Regione.EMILIA_ROMAGNA),
    FR("Frosinone", Regione.LAZIO),
    GE("Genova", Regione.LIGURIA),
    GO("Gorizia", Regione.FRIULI_VENEZIA_GIULIA),
    GR("Grosseto", Regione.TOSCANA),
    IM("Imperia", Regione.LIGURIA),
    IS("Isernia", Regione.MOLISE),
    SP("La-Spezia", Regione.LIGURIA),
    LT("Latina", Regione.LAZIO),
    LE("Lecce", Regione.PUGLIA),
    LC("Lecco", Regione.LOMBARDIA),
    LI("Livorno", Regione.TOSCANA),
    LO("Lodi", Regione.LOMBARDIA),
    LU("Lucca", Regione.TOSCANA),
    MC("Macerata", Regione.MARCHE),
    MN("Mantova", Regione.LOMBARDIA),
    MS("Massa-Carrara", Regione.TOSCANA),
    MT("Matera", Regione.BASILICATA),
    VS("Medio Campidano", Regione.SARDEGNA),
    ME("Messina", Regione.SICILIA),
    MI("Milano", Regione.LOMBARDIA),
    MO("Modena", Regione.EMILIA_ROMAGNA),
    MB("Monza-Brianza", Regione.LOMBARDIA),
    NA("Napoli", Regione.CAMPANIA),
    NO("Novara", Regione.PIEMONTE),
    NU("Nuoro", Regione.SARDEGNA),
    OG("Ogliastra", Regione.SARDEGNA),
    OT("Olbia Tempio", Regione.SARDEGNA),
    OR("Oristano", Regione.SARDEGNA),
    PD("Padova", Regione.VENETO),
    PA("Palermo", Regione.SICILIA),
    PR("Parma", Regione.EMILIA_ROMAGNA),
    PV("Pavia", Regione.LOMBARDIA),
    PG("Perugia", Regione.UMBRIA),
    PU("Pesaro-Urbino", Regione.MARCHE),
    PE("Pescara", Regione.ABRUZZO),
    PC("Piacenza", Regione.EMILIA_ROMAGNA),
    PI("Pisa", Regione.TOSCANA),
    PT("Pistoia", Regione.TOSCANA),
    PN("Pordenone", Regione.FRIULI_VENEZIA_GIULIA),
    PZ("Potenza", Regione.BASILICATA),
    PO("Prato", Regione.TOSCANA),
    RG("Ragusa", Regione.SICILIA),
    RA("Ravenna", Regione.EMILIA_ROMAGNA),
    RC("Reggio-CALABRIA", Regione.CALABRIA),
    RE("Reggio-Emilia", Regione.EMILIA_ROMAGNA),
    RI("Rieti", Regione.LAZIO),
    RN("Rimini", Regione.EMILIA_ROMAGNA),
    RM("Roma", Regione.LAZIO),
    RO("Rovigo", Regione.VENETO),
    SA("Salerno", Regione.CAMPANIA),
    SS("Sassari", Regione.SARDEGNA),
    SV("Savona", Regione.LIGURIA),
    SI("Siena", Regione.TOSCANA),
    SR("Siracusa", Regione.SICILIA),
    SO("Sondrio", Regione.LOMBARDIA),
    TA("Taranto", Regione.PUGLIA),
    TE("Teramo", Regione.ABRUZZO),
    TR("Terni", Regione.UMBRIA),
    TO("Torino", Regione.PIEMONTE),
    TP("Trapani", Regione.SICILIA),
    TN("Trento", Regione.TRENTINO_ALTO_ADIGE),
    TV("Treviso", Regione.VENETO),
    TS("Trieste", Regione.FRIULI_VENEZIA_GIULIA),
    UD("Udine", Regione.FRIULI_VENEZIA_GIULIA),
    VA("Varese", Regione.LOMBARDIA),
    VE("Venezia", Regione.VENETO),
    VB("Verbania", Regione.PIEMONTE),
    VC("Vercelli", Regione.PIEMONTE),
    VR("Verona", Regione.VENETO),
    VV("Vibo-Valentia", Regione.CALABRIA),
    VI("Vicenza", Regione.VENETO),
    VT("Viterbo", Regione.LAZIO);

    private final String nome;
    private final Regione regione;

    Provincia(String nome, Regione regione) {
        this.nome = nome;
        this.regione = regione;
    }
}