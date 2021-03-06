package com.cp.okex.bean.future.trade;

import java.util.List;

public class FutureOrdersInfo {
	
	private List<FutureOrderInfoDetail> orders;
	private Boolean result;
	
	
	public List<FutureOrderInfoDetail> getOrders() {
		return orders;
	}
	public void setOrders(List<FutureOrderInfoDetail> orders) {
		this.orders = orders;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "FutureOrdersInfo [orders=" + orders + ", result=" + result + "]";
	}
	
}
