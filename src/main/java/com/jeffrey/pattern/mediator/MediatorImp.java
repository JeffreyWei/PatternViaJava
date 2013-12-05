package com.jeffrey.pattern.mediator;

/**
 * 功能说明：
 *
 * @author weij
 */
public class MediatorImp implements Mediator {
	public void setCol1(Colleague col1) {
		this.col1 = col1;
	}

	public void setCol2(Colleague col2) {
		this.col2 = col2;
	}

	private Colleague col1;
	private Colleague col2;


	@Override
	public void sendMessage(String message, Colleague colFrom) {
		if (colFrom==col1){
			col2.receive(message);
		}else{
			col1.receive(message);
		}
	}
}
