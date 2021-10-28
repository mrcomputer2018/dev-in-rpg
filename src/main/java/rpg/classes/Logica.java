package rpg.classes;

import rpg.enums.TipoArmaEnum;
import rpg.enums.TipoClasseEnum;
import rpg.enums.TipoMotivacaoEnum;
import rpg.enums.TipoSexoEnum;

import java.util.ArrayList;
import java.util.Scanner;

public class Logica {
    static Scanner input = new Scanner(System.in);
    static PersonagemJogavel jogador;

    public static void continuar() {
        System.out.println("Pressione ENTER para continuar...");
        input.nextLine();
    }

    public static void limpaConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static int confirmaEscolha() {
        int confirmacao;
        try {
            confirmacao = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            confirmacao = 2;
            System.out.println("Por favor, digite um número inteiro!");
        }
        return confirmacao;
    }

    public static void linhaSeparadora() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static TipoArmaEnum getTipoArmaPersonagem(TipoClasseEnum tipoClasse) {
        int confirmacao;
        int arma;
        ArrayList<TipoArmaEnum> armasClasse = tipoClasse.getTipoArmaEnums();
        TipoArmaEnum tipoArma = null;
        do {
            System.out.println("Qual a arma do seu personagem?");
            for (TipoArmaEnum armaEnum : armasClasse) {
                System.out.println(armasClasse.indexOf(armaEnum) + ". " + armaEnum);
            }
            try {
                arma = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                arma = armasClasse.size();
            }
            if (arma >= armasClasse.size()) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoArma = armasClasse.get(arma);
                System.out.println("A arma do seu personagem é \"" + tipoArma + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoArma;
    }

    public static TipoClasseEnum getClassePersonagem() {
        int confirmacao;
        int classe;
        TipoClasseEnum tipoClasse = null;
        do {
            System.out.println("Qual a classe do seu personagem?");
            for (TipoClasseEnum classeEnum : TipoClasseEnum.values()) {
                System.out.println(classeEnum.ordinal() + ". " + classeEnum);
            }
            try {
                classe = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                classe = TipoClasseEnum.values().length;
            }
            if (classe >= TipoClasseEnum.values().length) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoClasse = TipoClasseEnum.values()[classe];
                System.out.println("A classe do seu personagem é \"" + tipoClasse + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoClasse;
    }

    public static TipoSexoEnum getSexoPersonagem() {
        int confirmacao;
        int sexo = 0;
        TipoSexoEnum tipoSexo = null;
        do {
            System.out.println("Qual o sexo do seu personagem?");
            for (TipoSexoEnum sexoEnum : TipoSexoEnum.values()) {
                System.out.println(sexoEnum.ordinal() + ". " + sexoEnum);
            }
            try {
                sexo = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                sexo = TipoSexoEnum.values().length;
            }
            if (sexo >= TipoSexoEnum.values().length) {
                System.out.println(sexo);
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoSexo = TipoSexoEnum.values()[sexo];
                System.out.println("O sexo do seu personagem é \"" + tipoSexo + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        return tipoSexo;
    }

    public static String getNomePersonagem() {
        int confirmacao;
        String nome;
        do {
            System.out.println("Qual o nome do seu personagem?");
            nome = input.nextLine();
            System.out.println("O nome do seu personagem é \"" + nome + "\"? Aperte 1 para confirmar ou 2 para digitar um novo nome.");
            confirmacao = confirmaEscolha();
        } while (confirmacao != 1);
        return nome;
    }

    public static String getMotivacaoPersonagem() {
        int confirmacao;
        int motivacao;
        TipoMotivacaoEnum tipoMotivacao = null;
        do {
            System.out.println("Qual a motivação do seu personagem?");
            for (TipoMotivacaoEnum motivacaoEnum : TipoMotivacaoEnum.values()) {
                System.out.println(motivacaoEnum.ordinal() + ". " + motivacaoEnum.getMotivacao());
            }
            try {
                motivacao = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                motivacao = TipoMotivacaoEnum.values().length;
            }
            if (motivacao >= TipoMotivacaoEnum.values().length) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoMotivacao = TipoMotivacaoEnum.values()[motivacao];
                System.out.println("A motivação do seu personagem é \"" + tipoMotivacao + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        jogador.setTipoMotivacao(tipoMotivacao.getMotivacao());
        linhaSeparadora();
        return tipoMotivacao.getTextoMotivacao();
    }

    public static void criacaoPersonagem() {
        String nome = getNomePersonagem();
        TipoSexoEnum tipoSexo = getSexoPersonagem();
        TipoClasseEnum tipoClasse = getClassePersonagem();
        TipoArmaEnum tipoArma = getTipoArmaPersonagem(tipoClasse);

        jogador = new PersonagemJogavel(nome, tipoSexo, tipoClasse, tipoArma);
        System.out.println(jogador);
        continuar();
    }
}
