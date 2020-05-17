package com.eco.annotations;

public enum MethodTypes {
	
	TRANSIENT("transient"),
	VOID("void"),
	STATIC("static");
	private String value;
	
	MethodTypes(String value){
		this.value = value;
	}
	@Override
	public String toString() {
		return this.value;
	}

}
