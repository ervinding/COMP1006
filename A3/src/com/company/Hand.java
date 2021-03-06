package com.company;

import java.util.List;

public class Hand{
  protected List<Card> cards;
  
  public Hand(List<Card> cards){
    this.cards = cards;
  }
  
  public int numberOfCards(){ 
    if( this.cards == null ){
      return -1;
    }else{
      return this.cards.size();
    } 
  }
  
  public List<Card> getCards(){
    return this.cards;
  }
  
  /* remove and return the specified card from the hand    */
  /* return null if the card is not in the hand            */
  public Card remove(Card card){
    Card cardtoReturn = null;
    for (int i=0;i<this.cards.size();i+=1) {
      if (card.compareTo(this.cards.get(i)) == 0){
          cardtoReturn = card;
          break;
      }
    }
    if (cardtoReturn != null) {
      this.cards.remove(cardtoReturn);
    }
    return cardtoReturn;
  }
  
  /* add the specified card to the hand */
  public void add(Card card){
    this.cards.add(card);
  }
  
}