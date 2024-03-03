package dmacc.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Mar 3, 2024
 */
@Entity
public class Unit {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@Column(name="CLASS")
	private String job;
	private int health;
	private int defense;
	private int attack;
	/**
	 * 
	 */
	public Unit() {
		super();
	}
	public Unit(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param job
	 * @param health
	 * @param defense
	 * @param attack
	 */
	public Unit(String name, String job, int health, int defense, int attack) {
		super();
		this.name = name;
		this.job = job;
		this.health = health;
		this.defense = defense;
		this.attack = attack;
	}
	/**
	 * @param id
	 * @param name
	 * @param job
	 * @param health
	 * @param defense
	 * @param attack
	 */
	public Unit(long id, String name, String job, int health, int defense, int attack) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.health = health;
		this.defense = defense;
		this.attack = attack;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	@Override
	public String toString() {
		return "Unit [id = " + id + ", name = " + name + ", health = " + health + ", attack = " + attack + ", defense = " + defense + "]";
	}
	
	
}
