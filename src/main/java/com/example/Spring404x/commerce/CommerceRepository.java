package com.example.Spring404x.commerce;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Spring404x.commerce.model.req.CommerceRegisterReq;
import com.example.Spring404x.config.BaseResponseMessage;

@Repository
public class CommerceRepository {

	private final JdbcTemplate jdbcTemplate;

	public CommerceRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int register(CommerceRegisterReq commerceRegisterReq) throws DataAccessException {
		// 회사 확인 메소드 따로 빼기
		Integer companyId = jdbcTemplate.queryForObject(
			"SELECT ID FROM COMPANY WHERE ID = ?",
			new Object[] {commerceRegisterReq.getCompanyId()},
			Integer.class
		);

		if (companyId != null) {
			var temp = jdbcTemplate.update(
				"INSERT INTO LIVECOMMERCE (MANAGER_ID, COMPANY_ID, TITLE, LIVE_DATE, START_TIME, END_TIME) VALUES (?, ?, ?, ?, ?, ?)",
				commerceRegisterReq.getManagerId(),
				companyId,
				commerceRegisterReq.getTitle(),
				commerceRegisterReq.getLiveDate(),
				commerceRegisterReq.getStartTime(),
				commerceRegisterReq.getEndTime()
			);
			return temp;
		}
		return 0;
	}
}