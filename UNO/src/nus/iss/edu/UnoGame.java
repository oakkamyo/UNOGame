package nus.iss.edu;

import java.util.ArrayList;
import java.util.List;
import nus.iss.edu.Player;

public class UnoGame {
    
    private List<Player> playerlist = new ArrayList<Player>();
    private String Id;
    private Card discardCard;
    private int deckSize;

    public UnoGame(String id)
    {
        this.Id=id;
    }
    
    public String getId() {
        return Id;
    }


    public void setId(String Id) {
        this.Id = Id;
    }
    
    public List<Player> getplayerlist() {
        return playerlist;
    }

    public void setplayerlist(List<Player> playerlist) {
        this.playerlist = playerlist;
    }
    
    public List<Player> addPlayer(Player p)
    {
        getplayerlist().add(p);
        return getplayerlist();
    }
    
    public void discardCard(Card c)
    {
        discardCard = c;
        
    }

    public void deckCard(int size)
    {
        deckSize = size;
    }
    
    @Override
    public String toString() {
        return "Id=" + Id + "\n Discard Card= " + discardCard + "\n Card on Deck= " + deckSize + "\n" + playerlist;
    }
}