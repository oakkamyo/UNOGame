package nus.iss.edu;

import java.util.*;

public class Deck {

    private List<Card> deck = new ArrayList<Card>();
    private String[] color = new String[]{"Red", "Yellow", "Green", "Blue"};
    private String[] type = new String[]{"Normal", "Skip", "Reverse", "Take Two"};

    public List<Card> createDeck() {
        
        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 11; j++) {
                    
                    Card c = new Card();
                    c.setColor(color[i]);
                    c.setType(type[0]);

                    switch (j) {
                        case 0:
                            c.setValue(1);
                            break;
                            
                        case 1:
                            c.setValue(2);
                            break;
                            
                        case 2:
                            c.setValue(3);
                            break;
                            
                        case 3:
                            c.setValue(4);
                            break;
                            
                        case 4:
                            c.setValue(5);
                            break;
                            
                        case 5:
                            c.setValue(6);
                            break;
                            
                        case 6:
                            c.setValue(7);
                            break;
                            
                        case 7:
                            c.setValue(8);
                            break;
                            
                        case 8:
                            c.setValue(9);
                            break;
                            
                        case 9:
                            c.setValue(20);
                            c.setType(type[1]);                            
                            break;
                            
                        case 10:
                            c.setValue(20);
                            c.setType(type[2]);
                            break;
                            
                        case 11:
                            c.setValue(20);
                            c.setType(type[3]);
                            break;
                    }

                    getDeck().add(c);
                }
            }
        }

        for(int z =0; z<4; z++)
        {
            Card zero = new Card();
            
            zero.setColor(color[z]);
            zero.setType(type[0]);
            zero.setValue(0);
            
            getDeck().add(zero);
        }
        
        for(int wildchange=0; wildchange<4; wildchange++)
        {
            Card wildcard = new Card();
            
            wildcard.setColor("Black");
            wildcard.setType("Wild Card Change Color");
            wildcard.setValue(20);
            getDeck().add(wildcard);
        }
        
        for(int wildfour=0; wildfour<4; wildfour++)
        {
            Card wildcardfour = new Card();
            wildcardfour.setColor("Black");
            wildcardfour.setType("Wild Card Take four");
            wildcardfour.setValue(20);
            getDeck().add(wildcardfour);
        }
        
        Collections.shuffle(deck);
        return getDeck();
    }

    public void takeCard(Player p)
    {
        p.addCard(deck.get(0));
        deck.remove(0);
    }

    @Override
    public String toString() {
        return "deck{" + "deck=" + getDeck() + '}';
    }

    public List<Card> getDeck() {
        return deck;
    }

    
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setType(String[] type) {
        this.type = type;
    }
}