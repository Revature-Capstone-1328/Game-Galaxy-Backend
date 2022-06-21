package com.revature.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "videoGames")
public class Game {

	@Id
	private int gameID;
	@Column(nullable = false)
	private String name;
	private double retailPrice;
	private double steamRatingPercent;
	private double metacriticScore;
	private Date releaseDate;
	private String publisher;
	private String thumb;

	public Game() {
		super();

	}

	public Game(int gameID, String name, double retailPrice, double steamRatingPercent, double metacriticScore,
			Date releaseDate, String publisher, String thumb) {
		super();
		this.gameID = gameID;
		this.name = name;
		this.retailPrice = retailPrice;
		this.steamRatingPercent = steamRatingPercent;
		this.metacriticScore = metacriticScore;
		this.releaseDate = releaseDate;
		this.publisher = publisher;
		this.thumb = thumb;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public double getSteamRatingPercent() {
		return steamRatingPercent;
	}

	public void setSteamRatingPercent(double steamRatingPercent) {
		this.steamRatingPercent = steamRatingPercent;
	}

	public double getMetacriticScore() {
		return metacriticScore;
	}

	public void setMetacriticScore(double metacriticScore) {
		this.metacriticScore = metacriticScore;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(gameID, metacriticScore, name, publisher, releaseDate, retailPrice, steamRatingPercent,
				thumb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return gameID == other.gameID
				&& Double.doubleToLongBits(metacriticScore) == Double.doubleToLongBits(other.metacriticScore)
				&& Objects.equals(name, other.name) && Objects.equals(publisher, other.publisher)
				&& Objects.equals(releaseDate, other.releaseDate)
				&& Double.doubleToLongBits(retailPrice) == Double.doubleToLongBits(other.retailPrice)
				&& Double.doubleToLongBits(steamRatingPercent) == Double.doubleToLongBits(other.steamRatingPercent)
				&& Objects.equals(thumb, other.thumb);
	}

	@Override
	public String toString() {
		return "Game [gameID=" + gameID + ", name=" + name + ", retailPrice=" + retailPrice + ", steamRatingPercent="
				+ steamRatingPercent + ", metacriticScore=" + metacriticScore + ", releaseDate=" + releaseDate
				+ ", publisher=" + publisher + ", thumb=" + thumb + "]";
	}

	

}
