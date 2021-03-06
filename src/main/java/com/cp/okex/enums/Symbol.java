package com.cp.okex.enums;

/**
 * 币种标识
 * @author ex-chengp
 *
 */
public enum Symbol {
	
	比特币("btc_usd"),
	莱特币("ltc_usd"),
	以太坊("eth_usd"),
	以太坊经典("etc_usd"),
	比特币现金("bch_usd");
	
	private String value;
	
	Symbol(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
