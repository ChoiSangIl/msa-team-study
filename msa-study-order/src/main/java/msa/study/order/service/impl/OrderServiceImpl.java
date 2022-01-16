package msa.study.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import msa.study.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	private RestTemplate restTemplate;
	
	@Autowired
	public OrderServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Override
	public String orders() {
		//결제호출
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:9091/pay", String.class);
		System.out.println("결제호출:" + response.getBody());
		return "orders...";
	}

}
