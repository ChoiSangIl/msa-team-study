package msa.study.order.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("order")
	private String order() {
		return "order...";
	}
}
