package msa.study.order.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class OrderController {

	@Operation(summary = "주문 api", description = "주문 api")
	@GetMapping("order")
	private String order() {
		return "order...";
	}
}
