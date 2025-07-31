import dev.lpa.Monster;
import dev.lpa.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Player
        Player player = new Player("Tim", 100, 15);
        System.out.println(player);

        // Salvando os dados do jogador
        List<String> playerData = player.write();

        // Criando um novo jogador e carregando os dados salvos
        Player newPlayer = new Player("", 0, 0);
        newPlayer.read(playerData);
        System.out.println(newPlayer);

        // Testando a classe Monster
        Monster monster = new Monster("Dragão", 200, 30);
        System.out.println(monster);

        // Salvando os dados do monstro
        List<String> monsterData = monster.write();

        // Criando um novo monstro e carregando os dados salvos
        Monster newMonster = new Monster("", 0, 0);
        newMonster.read(monsterData);
        System.out.println(newMonster);

        // Testando mudança de arma do jogador
        player.setWeapon("Machado");
        System.out.println("Jogador após trocar de arma: " + player);

        // Testando valores inválidos
        try {
            player.read(null);
            System.out.println("Teste com lista nula passou");
        } catch (Exception e) {
            System.out.println("Erro ao ler lista nula: " + e.getMessage());
        }

    }
}