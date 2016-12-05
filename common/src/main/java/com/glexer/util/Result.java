package com.glexer.util;

/**
 *  ���ؽ��ģ����
 * @author qlz
 *
 */
public class Result {
	private String code,msg;
	private Object data;
	
	public Result(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public Result(String code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}
	public Result(Object data) {
		super();
		this.code=ResultCode.SUCCESS;
		this.data = data;
	}
	public Result(String code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	

}
