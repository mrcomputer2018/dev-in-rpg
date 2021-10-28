package rpg.classes;

import rpg.enums.TipoArmaEnum;
import rpg.enums.TipoClasseEnum;
import rpg.enums.TipoSexoEnum;

public class PersonagemJogavel extends Personagem {
    public PersonagemJogavel(String nome, TipoSexoEnum sexo, TipoClasseEnum classe, TipoArmaEnum arma) {
        this.nome = nome;
        this.sexo = sexo;
        this.pontosDeArmadura = classe.getPontosDeArmadura();
        this.pontosDeVida = classe.getPontosDeVida();
        this.danoAtaque = classe.getDanoAtaque();
        this.nomeArma = arma.getNomeArma();
        this.danoArma = arma.getDanoArma();
        this.classe = classe;
        this.arma = arma;
        this.danoTotal = this.danoArma + this.danoAtaque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSexo: " + sexo +
                "\nClasse: " + classe +
                "\nPonto de Armadura: " + pontosDeArmadura +
                "\nPonto de Vida: " + pontosDeVida +
                "\nDano de Ataque Classe: " + danoAtaque +
                "\nArma: " + arma +
                "\nNome da Arma: " + nomeArma +
                "\nDano da Arma: " + danoArma +
                "\nDano Total: " + danoTotal ;
    }
}
