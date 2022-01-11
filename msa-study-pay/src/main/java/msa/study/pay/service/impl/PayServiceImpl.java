package msa.study.pay.service.impl;

import org.springframework.stereotype.Service;

import msa.study.pay.service.PayService;

@Service
public class PayServiceImpl implements PayService {

	@Override
	public String pay() {
		return "pay...";
	}

}
