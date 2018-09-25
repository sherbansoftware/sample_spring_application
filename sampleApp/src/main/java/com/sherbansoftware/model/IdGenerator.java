package com.sherbansoftware.model;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class IdGenerator {
	private AtomicLong nextId = new AtomicLong(1);

	public long getNextId() {
		return nextId.getAndIncrement();
	}
}
