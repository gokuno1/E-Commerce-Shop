package com.example.demo.services;

import com.example.demo.model.PaymentModel;

public interface PaymentService {
	
	public PaymentModel getPayment(int id);
	public PaymentModel addPayment(PaymentModel payment) throws Exception;
	public PaymentModel placeOrder(int cartid) throws Exception;
	public String deletePayment(int id);
}
