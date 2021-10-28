package rpg.classes;

import lombok.Getter;
import rpg.enums.TipoArmaEnum;
import rpg.enums.TipoClasseEnum;
import rpg.enums.TipoSexoEnum;

@Getter
abstract public class Personagem {
    protected String nome;
    protected TipoSexoEnum sexo;
    protected TipoClasseEnum classe;
    protected int pontosDeVida;
    protected int pontosDeArmadura;
    protected int danoAtaque;
    protected TipoArmaEnum arma;
    protected String nomeArma;
    protected int danoArma;
    protected int danoTotal;
}
