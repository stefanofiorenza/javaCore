package course.jse.collections.api.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestListApi {

	List<String> data= new ArrayList<String>();
	
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
		
		ListIterator<String> listIterator =data.listIterator();		
		System.out.println("listIterator:");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		Iterator<String> iterator =data.iterator();
		System.out.println("iterator:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("For Each:");
		for (String item : data) { // List is iterable
			System.out.println(item);
		}
		
		System.out.println("get(index):");
		for (int i=0; i<data.size(); i++) { // List is iterable
			System.out.println(data.get(i));
		}
	}
	
	@Test
	public void testModifications() {
		Assert.assertEquals(2, data.indexOf("AABC"));
		Assert.assertEquals(6,data.size());
		
		data.remove(0);		
		Assert.assertEquals(5,data.size());
		
		data.remove("AABC");
		Assert.assertEquals(-1, data.indexOf("AABC"));// -1 not found
		
	}
	
	
	
}
