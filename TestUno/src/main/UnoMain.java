package main;

import java.util.*;
import nus.iss.edu.UnoGame;
import nus.iss.edu.Deck;
import nus.iss.edu.Player;

public class UnoMain {

    public static void main(String[] args) {        
        UnoGame game = new UnoGame("Game One");
        Deck d = new Deck();
        
        d.createDeck();
        
        Player p1 = new Player("Moe Kyaw Kyaw");
        Player p2 = new Player("Oakka Myo");
        Player p3 = new Player("Mon Zin");
        Player p4 = new Player("May Thin Cho");
        Player p5 = new Player("Augustine");
        
        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);
        game.addPlayer(p4);
        game.addPlayer(p5);
        
        List<Player> p = new ArrayList<Player>();
        p = game.getplayerlist();
        
        for(int i = 0; i <= 6; i++)
        {
            for (int j = 0; j < p.size(); j++)
            {
                d.takeCard(p.get(j));
            }
        }
        
        game.discardCard(d.getDeck().get(0));
        d.getDeck().remove(0);
        game.deckCard(d.getDeck().size());
        
        System.out.println(game);
    }
    
}