package com.example.Spring404x.commerce;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring404x.commerce.model.req.CommerceRegisterReq;
import com.example.Spring404x.config.BaseResponse;
import com.example.Spring404x.config.BaseResponseMessage;

@RestController
@RequestMapping(value = "/commerce")
public class CommerceController {
	private final CommerceService commerceService;

	CommerceController(CommerceService commerceService) {
		this.commerceService = commerceService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public BaseResponse registerCommerce(@RequestBody CommerceRegisterReq commerceRegisterReq) {
		if (isEmptyCompanyId(commerceRegisterReq.getCompanyId()))
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_EMPTY_COMPANY);
		if (isEmptyTitle(commerceRegisterReq.getTitle()))
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_EMPTY_TITLE);
		if (isEmptyDate(commerceRegisterReq.getLiveDate()))
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_EMPTY_DATE);
		if (isEmptyTime(commerceRegisterReq.getStartTime(), commerceRegisterReq.getEndTime()))
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_EMPTY_TIME);
		if (isEmptyKeyword(commerceRegisterReq.getKeyword()))
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_EMPTY_KEYWORD);
		if (isEmptyItem(commerceRegisterReq.getItem()))
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_EMPTY_ITEM);

		try {
			commerceService.register(commerceRegisterReq);
		} catch (DataAccessException dataAccessException) {
			System.out.println("데이터가 존재하지 않습니다.");
			return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_FAIL_NOT_EXIST_COMPANY);
		}
		return new BaseResponse(BaseResponseMessage.LIVECOMMERCE_REGISTER_SUCCESS);
	}

	private boolean isEmptyManagerId(int managerId) {
		return managerId == 0;
	}

	private boolean isEmptyCompanyId(int companyId) {
		return companyId == 0;
	}

	private boolean isEmptyTitle(String title) {
		return title == null;
	}

	private boolean isEmptyDate(LocalDate liveDate) {
		return liveDate == null;
	}

	private boolean isEmptyTime(LocalDateTime startTime, LocalDateTime endTime) {
		return startTime == null || endTime == null;
	}

	private boolean isEmptyKeyword(String keyword) {
		return keyword == null;
	}

	private boolean isEmptyItem(String item) {
		return item == null;
	}
}
