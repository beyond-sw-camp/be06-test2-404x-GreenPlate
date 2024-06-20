package com.example.Spring404x.commerce;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.Spring404x.commerce.model.req.CommerceRegisterReq;
import com.example.Spring404x.config.BaseResponseMessage;

@Service
public class CommerceService {
	private final CommerceRepository commerceRepository;
	CommerceService(CommerceRepository commerceRepository) {
		this.commerceRepository = commerceRepository;
	}

	public void register(CommerceRegisterReq commerceRegisterReq) throws DataAccessException {
		commerceRepository.register(commerceRegisterReq);
	}
}
