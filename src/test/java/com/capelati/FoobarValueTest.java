package com.capelati;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(JUnit4.class)
public class FoobarValueTest {

	@Test
	public void fooBarTest() {
		FoobarValue value = ImmutableFoobarValue
								.builder()
								.bar("bar")
								.addBuz(12)
								.addCrux(21)
								.foo(1)
								.build();
		assertNotNull(value);
		assertEquals(value.buz().size(), 1);
		assertEquals(value.crux().size(), 1);
		assertThat(value, is(instanceOf(FoobarValue.class)));
	}

}
