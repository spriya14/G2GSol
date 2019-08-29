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
		size++;
		
	}

	public int size() {
		
		return size;
	}
	
	public void delete(int index) {
		data[index] = null;
		size --; 
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean Contains(String value) {
		for (int i =0; i<= size;i++) {
			String currentval = (String) data[i];
			if (currentval == value) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	

}
