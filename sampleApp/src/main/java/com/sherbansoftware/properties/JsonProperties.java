package com.sherbansoftware.properties;

public class JsonProperties {
	private int port;
	private boolean resend;
	private String host;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public boolean isResend() {
		return resend;
	}
	public void setResend(boolean resend) {
		this.resend = resend;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}

}
