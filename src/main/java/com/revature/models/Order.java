package com.revature.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table (name = "Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private Date orderDate;
	@OneToMany(mappedBy = "gameID", fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<Game> games = new ArrayList<>();
	private double totalAmount;
	@ManyToOne
	private User user;
	
	
	
	public Order(int orderId, Date orderDate, List<Game> games, double totalAmount, User user) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.games = games;
		this.totalAmount = totalAmount;
		
		this.user = user;
		
	
	}
	public Order() {
		super();
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public int hashCode() {
		return Objects.hash(games, orderDate, orderId, totalAmount, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(games, other.games) && Objects.equals(orderDate, other.orderDate)
				&& orderId == other.orderId
				&& Double.doubleToLongBits(totalAmount) == Double.doubleToLongBits(other.totalAmount)
				&& Objects.equals(user, other.user);
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", games=" + games + ", totalAmount="
				+ totalAmount + ", user=" + user + "]";
	}
	
	
}
	
