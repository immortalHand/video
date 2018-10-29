package com.wpf.video.pojo;

public class ResultVo {
	private Integer status;
	private String msg;
	private Object obj;

	private ResultVo() {
	}

	public static ResultVo build() {
		return new ResultVo();
	}

	public static ResultVo ok(String msg, Object obj) {
		return new ResultVo(200, msg, obj);
	}

	public static ResultVo ok(String msg) {
		return new ResultVo(200, msg, null);
	}

	public static ResultVo error(String msg, Object obj) {
		return new ResultVo(500, msg, obj);
	}

	public static ResultVo error(String msg) {
		return new ResultVo(500, msg, null);
	}

	private ResultVo(Integer status, String msg, Object obj) {
		this.status = status;
		this.msg = msg;
		this.obj = obj;
	}

	public Integer getStatus() {

		return status;
	}

	public ResultVo setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public ResultVo setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Object getObj() {
		return obj;
	}

	public ResultVo setObj(Object obj) {
		this.obj = obj;
		return this;
	}
}
