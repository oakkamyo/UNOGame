package nus.iss.edu;

import java.util.*;

public class Player {
    
    private String id;        
    private List<Card> cardInHand = new ArrayList<Card>();

    public Player(String id)
    {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
      
    public void addCard(Card c)
    {
        setCardInHand(c);
    }
    
    public void removeCard(Card c)
    {
         this.cardInHand.remove(c);
    }
    
    public List<Card> HoldCard()
    {        
        return getCardInHand();
    }

    public List<Card> getCardInHand() {
        return cardInHand;
    }

    public void setCardInHand(Card c) {
        this.cardInHand.add(c);
    }
    
    @Override
    public String toString() {
        return "\n player{" + "id= " + id + "\n" + "cardInHand= " + getCardInHand() + '}';
    }
    
}