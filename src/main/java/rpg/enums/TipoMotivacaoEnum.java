package rpg.enums;

import lombok.Getter;

@Getter
public enum TipoMotivacaoEnum {
    VINGANCA("VINGANÇA",
            """
                    Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois
                    essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos
                    em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que
                     ão irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor
                    e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos
                    (e principalmente na sua)."""),

    GLORIA("GLÓRIA",
            """
                    Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos
                    criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas,
                    taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do
                    público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou
                    a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na
                    missão. A glória o aguarda, mas não antes da última batalha.""");

    private String motivacao;
    private String textoMotivacao;

    TipoMotivacaoEnum(String motivacao, String textoMotivacao) {
        this.motivacao = motivacao;
        this.textoMotivacao = textoMotivacao;
    }


}
