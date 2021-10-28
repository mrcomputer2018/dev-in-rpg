package rpg.classes;

public class Historia {

    public static void atoUm() {
        Logica.criacaoPersonagem();
        Logica.limpaConsole();
    }

    public static void atoDois() {
        System.out.println(
                """
                        A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você
                        está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que
                        a partir desse ponto, sua vida mudará para sempre.""");
        Logica.linhaSeparadora();
        System.out.println(
                """
                        Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os
                        inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate,
                        já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.""");

        Logica.linhaSeparadora();
        Logica.continuar();
        Logica.linhaSeparadora();
        System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
        Logica.linhaSeparadora();
        System.out.println(Logica.getMotivacaoPersonagem());
        Logica.linhaSeparadora();
        Logica.continuar();
        Logica.linhaSeparadora();
        System.out.println(
                "Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem \n" +
                "em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.");
        Logica.linhaSeparadora();
        Logica.continuar();
        Logica.linhaSeparadora();
        Logica.limpaConsole();
    }
}
