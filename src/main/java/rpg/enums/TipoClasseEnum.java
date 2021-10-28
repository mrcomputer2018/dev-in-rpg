package rpg.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
public enum TipoClasseEnum {
    BARBARO(50, 15, 10, new ArrayList<>(Arrays.asList(TipoArmaEnum.ESPADA, TipoArmaEnum.MACHADO))),
    LADINO(40, 10, 15, new ArrayList<>(Arrays.asList(TipoArmaEnum.ADAGA, TipoArmaEnum.ARCO))),
    MAGO(30, 5, 20, new ArrayList<>(Arrays.asList(TipoArmaEnum.CAJADO, TipoArmaEnum.VARINHA)));

    private int pontosDeVida;
    private int pontosDeArmadura;
    private int danoAtaque;
    private ArrayList<TipoArmaEnum> tipoArmaEnums;

    TipoClasseEnum(int pontosDeVida, int pontosDeArmadura, int danoAtaque, ArrayList<TipoArmaEnum> tipoArmaEnums) {
        this.pontosDeVida = pontosDeVida;
        this.pontosDeArmadura = pontosDeArmadura;
        this.danoAtaque = danoAtaque;
        this.tipoArmaEnums = tipoArmaEnums;
    }
}
