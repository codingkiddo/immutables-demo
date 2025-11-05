package com.codingkiddo.immutables_demo;

import org.immutables.value.Value;

@Value.Immutable
public interface Person {
	String name();
	@Value.Default
	default int age() { return 0; }
}
