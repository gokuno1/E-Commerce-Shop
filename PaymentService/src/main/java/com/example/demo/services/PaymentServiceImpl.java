package com.example.demo.services;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.OrderProxy;
import com.example.demo.model.OrderDetailVO;
import com.example.demo.model.PaymentModel;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentrepro;
	
	@Autowired
	private PaymentModel model;
	
	@Autowired
	private OrderProxy proxy;

	Mapper mapper=new DozerBeanMapper();

	@Override
	public PaymentModel getPayment(int id) {
		// TODO Auto-generated method stub
		PaymentModel pay = paymentrepro.findById(id).get();
		PaymentModel payment = mapper.map(pay, PaymentModel.class);
		return payment;
	}

	@Override
	public PaymentModel addPayment(PaymentModel payment) throws Exception {
		// TODO Auto-generated method stub
		PaymentModel pay = mapper.map(payment, PaymentModel.class);
		pay = paymentrepro.save(pay);
		return pay;
	}

	@Override
	public PaymentModel placeOrder(int orderid) throws Exception {
		// TODO Auto-generated method stub
		OrderDetailVO orderDetail = proxy.getOrderById(orderid);
		PaymentModel response = new PaymentModel(model.getPaymentId(), orderDetail.getOrderId(), orderDetail.getCartId(), orderDetail.getProductPrice(), orderDetail.getProductImages());
		paymentrepro.save(response);
		proxy.deleteById(orderid);
		return response;
	}

	@Override
	public String deletePayment(int id) {
		// TODO Auto-generated method stub
		paymentrepro.deleteById(id);
		return "deleted";
	}

	
}
