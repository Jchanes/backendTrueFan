package org.trueFanBoutique.dto;

public class Token {
	private final String accessToken;

	public Token(String accessToken) {
		this.accessToken = accessToken;
	}//constructor Token

	
	public String getAccessToken() {
		return accessToken;
	}//getAccessToken
}//class Token 
