package course.jse.collections.api.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestSets {

	private Set<String>data = new HashSet<String>();
	
	
	
	@Before
	public void init() {
		data.add("AAAB");
		data.add("AABB");
		data.add("AABC");
		data.add("ABBB");
		data.add("AAAA");
		data.add("AACB");
	}
	
	@Test
	public void demoAccess() {
		
		
		Iterator<String> iterator =data.iterator();
		System.out.println("iterator:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("For Each:");
		for (String item : data) { // Set is iterable
			System.out.println(item);
		}		
		
	}
	
	@Test
	public void testModifications() {
		Assert.assertTrue(data.contains("AABC"));
		Assert.assertEquals(6,data.size());
		
		data.remove("AABC");	
		Assert.assertEquals(5,data.size());		
		Assert.assertFalse(data.contains("AABC"));
		
	}
	
	
	
}
