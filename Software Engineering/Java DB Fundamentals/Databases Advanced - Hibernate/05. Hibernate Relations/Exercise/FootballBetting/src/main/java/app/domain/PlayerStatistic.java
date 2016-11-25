package app.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "player_statistics")
public class PlayerStatistic implements Serializable {

    @Id
    private Game game;

    @Id
    private Player player;

    @Basic
    private int scoredGoals;

    @Basic
    private int playerAssists;

    @Basic
    private int playedMinutesDuringGame;

    public PlayerStatistic() {
        super();
    }

    public PlayerStatistic(Game game, Player player, int scoredGoals, int playerAssists, int playedMinutesDuringGame) {
        this.setGame(game);
        this.setPlayer(player);
        this.setScoredGoals(scoredGoals);
        this.setPlayerAssists(playerAssists);
        this.setPlayedMinutesDuringGame(playedMinutesDuringGame);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public int getPlayerAssists() {
        return playerAssists;
    }

    public void setPlayerAssists(int playerAssists) {
        this.playerAssists = playerAssists;
    }

    public int getPlayedMinutesDuringGame() {
        return playedMinutesDuringGame;
    }

    public void setPlayedMinutesDuringGame(int playedMinutesDuringGame) {
        this.playedMinutesDuringGame = playedMinutesDuringGame;
    }
}
