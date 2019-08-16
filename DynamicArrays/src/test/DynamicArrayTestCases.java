package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import creation.DynamicArray;

class DynamicArrayTestCases {
	
	private DynamicArray dyn= new DynamicArray<String>(2);
	
	@Test
	void TestGetandSet() {
		dyn.set(0, "a");
		dyn.set(1, "s");
		
		Assert.assertEquals("a", dyn.get(0));
	}

}
