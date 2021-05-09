package p3;

import java.util.ArrayList;
import java.util.List;

public class Card {
	private String name;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agility;
		result = prime * result + intelligence;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
		result = prime * result + strength;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (agility != other.agility)
			return false;
		if (intelligence != other.intelligence)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed != other.speed)
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}

	public Card(String name, int speed, int strength, int agility, int intelligence) {
		super();
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public static void main(String[] args) {
		Card c1 = new Card("gerald", 75, 75, 75, 75);
		Card c2 = new Card("alison", 50, 50, 50, 50);
		Card c3 = new Card("raven", 60, 60, 60, 60);
		List<Card> cards = new ArrayList<Card>();
		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
		getStat(cards);
		displayAll(cards);
		topFive(cards);
		
		

	}

	

	private static void topFive(List<Card> temp) {
		for (Card i : temp) {
			System.out.println(i.toString());
			System.out.println();
		}
		
	}

	private static void displayAll(List<Card> temp) {
		for (Card i : temp) {
			System.out.println("name : " + i.getName());
			System.out.println("speed : " + i.getSpeed());
			System.out.println("strength : " + i.getStrength());
			System.out.println("agility : " + i.getAgility());
			System.out.println("intelligence : " + i.getIntelligence());
			System.out.println();
		}
		
		
	}

	@Override
	public String toString() {
		return name + "( / )\n" + "sp: " + speed + " | " + "st: " + strength + " | " + "ag: " + agility + " | " + "in: " + intelligence;
	}

	private static void getStat(List<Card> temp) {
		int result = 0;
		for (Card i : temp) {
			System.out.println(i.getAgility());
		}
		
		
		
	}

}
