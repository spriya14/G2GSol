package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import creation.DynamicArray; 

class DynamicArrayTestCases {
	 
	private DynamicArray dyn= new DynamicArray<String>(5);
	
	@Test
	void TestGetandSet() {
		dyn.set(0, "a");
		dyn.set(1, "s");
		
		Assert.assertEquals("a", dyn.get(0));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	void Testinsert() {
		dyn.insert(0, 1);
		dyn.insert(1, 67);
		dyn.insert(2, 90);
		dyn.insert(3, 3);
		
		Assertions.assertEquals(4, dyn.size());
		Assertions.assertEquals(1, dyn.get(0));
		Assertions.assertEquals(90, dyn.get(2));
		
	}
	
	@Test
	void testDel() {
		dyn.insert(0, 1);
		dyn.insert(1, 67);
		dyn.insert(2, 90);
		dyn.insert(3, 3);
		
		dyn.delete(2);
		
		Assertions.assertEquals(3, dyn.size());
		
		
	}
	

}
