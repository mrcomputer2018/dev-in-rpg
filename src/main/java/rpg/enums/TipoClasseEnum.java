package rpg.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
public enum TipoClasseEnum {
    BARBARO(130, 15, 10, new ArrayList<>(Arrays.asList(TipoArmaEnum.ESPADA, TipoArmaEnum.MACHADO))),
    LADINO(120, 10, 15, new ArrayList<>(Arrays.asList(TipoArmaEnum.ADAGA, TipoArmaEnum.ARCO))),
    MAGO(110, 5, 20, new ArrayList<>(Arrays.asList(TipoArmaEnum.CAJADO, TipoArmaEnum.VARINHA)));

    private final int pontosDeVida;
    private final int pontosDeArmadura;
    private final int danoAtaque;
    private final ArrayList<TipoArmaEnum> tipoArmaEnums;

    TipoClasseEnum(int pontosDeVida, int pontosDeArmadura, int danoAtaque, ArrayList<TipoArmaEnum> tipoArmaEnums) {
        this.pontosDeVida = pontosDeVida;
        this.pontosDeArmadura = pontosDeArmadura;
        this.danoAtaque = danoAtaque;
        this.tipoArmaEnums = tipoArmaEnums;
    }
}
