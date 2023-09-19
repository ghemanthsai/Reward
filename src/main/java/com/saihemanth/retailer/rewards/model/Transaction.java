package com.saihemanth.retailer.rewards.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

    @Entity
	@Table(name = "TRANSACTION")
	@NoArgsConstructor
	@Setter
	@Getter
	@Data
	public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;

	@Column(name = "CUSTOMER_ID")
	private Long customerId;

	@Column(name = "TRANSACTION_DATE")
	private Timestamp transactionDate;

	@Column(name = "AMOUNT")
	private double transactionAmount;

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
}