package creation;

public class DynamicArray<String> {
	
	private Object[] data;
	private int initialCapacity;
	private  int size;
	  
	public DynamicArray(int initialCapacity) {
		
		this.initialCapacity = initialCapacity;
		this.data = new Object[initialCapacity];
		
	}
	
	@SuppressWarnings("unchecked")
	public String get(int index) {
		return (String)data[index];
	}
	
	public void set(int index, String value) {
		 data[index] = value;
	}
	
	public void insert(int index, String value) {
		data[index] = value;
		
	}
	
	
	
	

}
