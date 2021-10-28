package rpg.game;

import rpg.classes.PersonagemJogavel;
import rpg.enums.TipoArmaEnum;
import rpg.enums.TipoClasseEnum;
import rpg.enums.TipoSexoEnum;

import java.util.ArrayList;

public class Testes {
    public static void main(String[] args) {
        PersonagemJogavel player =
                new PersonagemJogavel("Joao", TipoSexoEnum.MASCULINO, TipoClasseEnum.LADINO, TipoArmaEnum.ADAGA);
        System.out.println(player);
    }
}
