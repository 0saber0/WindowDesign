package com.milanuo.window.pojo;

/**
 * 返回结果
 * 
 * @author 51988
 *
 */
public class ReturnResult {
	private boolean success;// 操作是否成功
	private String message;// 返回的信息

	public ReturnResult(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
