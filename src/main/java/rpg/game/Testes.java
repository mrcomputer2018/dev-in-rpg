package rpg.game;

import rpg.classes.Combate;
import rpg.classes.PersonagemJogavel;
import rpg.classes.PersonagemNaoJogavel;
import rpg.enums.*;

public class Testes {
    public static void main(String[] args) {
        /*PersonagemJogavel jogador = new PersonagemJogavel("Joao", TipoSexoEnum.MASCULINO, TipoClasseEnum.BARBARO, TipoArmaEnum.MACHADO);
        jogador.setTipoMotivacao(TipoMotivacaoEnum.GLORIA);

        PersonagemNaoJogavel inimigo = new PersonagemNaoJogavel(TipoInimigoEnum.ARMEIRO);

        Combate combate = new Combate(jogador, inimigo);
        combate.iniciarCombate();*/

        int danoTotal = (int) (20 * 0.8);
        System.out.println(danoTotal);
    }
}
