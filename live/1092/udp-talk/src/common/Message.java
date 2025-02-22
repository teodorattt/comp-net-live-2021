package common;

import java.io.Serializable;
import java.net.InetSocketAddress;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int SUBSCRIBE = 1;
	public static final int UNSUBSCRIBE = 2;
	public static final int TALK = 3;

	private int type;
	private String text;

	private volatile InetSocketAddress address;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public InetSocketAddress getAddress() {
		return address;
	}

	public void setAddress(InetSocketAddress address) {
		this.address = address;
	}

	public Message(int type, String text) {
		this.type = type;
		this.text = text;
	}
}
