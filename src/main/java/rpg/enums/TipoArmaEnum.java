package rpg.enums;

import lombok.Getter;

@Getter
public enum TipoArmaEnum {
    MACHADO("machado", 10),
    ESPADA("espada", 8),
    ADAGA("adaga", 12),
    ARCO("arco", 8),
    VARINHA("varinha", 10),
    CAJADO("cajado", 10);

    private String nomeArma;
    private int danoArma;

    TipoArmaEnum(String nomeArma, int danoArma) {
        this.nomeArma = nomeArma;
        this.danoArma = danoArma;
    }
}
