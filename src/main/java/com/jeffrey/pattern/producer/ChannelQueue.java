package com.jeffrey.pattern.producer;

/**
 * 功能说明：
 *			通常实现有如下几种：队列，堆栈，优先级队列
 * @author weij
 */
public interface ChannelQueue {
	public void put(String key) ;
	public String get(String key);
}
