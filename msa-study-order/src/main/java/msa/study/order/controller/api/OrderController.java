package msa.study.order.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import msa.study.order.service.OrderService;

@RestController
public class OrderController {
	
	final OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@Operation(summary = "주문 api", description = "주문 api")
	@GetMapping("orders")
	private String orders() {
		return orderService.orders();
	}
}
