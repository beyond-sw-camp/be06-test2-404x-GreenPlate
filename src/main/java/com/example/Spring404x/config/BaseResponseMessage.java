package com.example.Spring404x.config;

public enum BaseResponseMessage {
	// 요청 성공 1000
	REQUEST_SUCCESS(true, 1000, "요청이 정상적으로 처리되었습니다"),

	// 회원 기능 2000
	MEMBER_REGISTER_SUCCESS(true, 2000, "정상적으로 가입되었습니다"),
	MEMBER_REGISTER_FAIL_PASSWORD_EMPTY(false, 2101, "패스워드를 입력해주세요"),
	MEMBER_REGISTER_FAIL_PASSWORD_COMPLEXITY(false, 2102, "복잡한 패스워드를 사용해주세요"),

	// 게신판 기능 3000
	BOARD_GET_LIST_SUCCESS(true, 3000, "게시글 목록 조회 성공"),
	BOARD_GET_LIST_FAIL_EMPTY(false, 3001, "조회된 게시글이 없습니다."),

	// 유저 정보 수정 기능
	USER_EDIT_SUCCESS(true, 1200, "회원 정보 수정을 완료하였습니다"),
	USER_EDIT_FAIL(false, 1201, "회원 정보 수정에 실패하였습니다"),

	// 방송 등록 기능
	LIVECOMMERCE_REGISTER_SUCCESS(true, 4000, "[방송 등록 성공] 성공적으로 방송이 등록되었습니다"),

	LIVECOMMERCE_REGISTER_FAIL_DUPLICATION_DATE(false, 4001, "[방송 등록 실패] 방송 일정이 중복되었습니다."),

	LIVECOMMERCE_REGISTER_FAIL_EMPTY_TITLE(false, 4002, "[방송 등록 실패] 제목은 필수 작성 항목입니다."),

	LIVECOMMERCE_REGISTER_FAIL_EMPTY_DATE(false, 4003, "[방송 등록 실패] 방송 날짜는 필수 작성 항목입니다."),

	LIVECOMMERCE_REGISTER_FAIL_EMPTY_TIME(false, 4004, "[방송 등록 실패] 방송 시작 시간, 종료 시간은 필수 작성 항목입니다."),

	LIVECOMMERCE_REGISTER_FAIL_EMPTY_KEYWORD(false, 4005, "[방송 등록 실패] 키워드는 필수 작성 항목입니다."),

	LIVECOMMERCE_REGISTER_FAIL_EMPTY_COMPANY(false, 4006, "[방송 등록 실패] 사업자는 필수 작성 항목입니다."),
	LIVECOMMERCE_REGISTER_FAIL_EMPTY_ITEM(false, 4007, "[방송 등록 실패] 상품은 필수 작성 항목입니다."),
	LIVECOMMERCE_REGISTER_FAIL_NOT_EXIST_COMPANY(false, 4010, "[방송 등록 실패] 회사가 존재하지 않습니다.")
	;

	private Boolean success;
	private Integer code;
	private String message;

	BaseResponseMessage(Boolean success, Integer code, String message) {
		this.success = success;
		this.code = code;
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
