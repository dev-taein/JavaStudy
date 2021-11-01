package examp03;

public class MyVector {
	Object[] data = null; //��ü�� ��� ���ؼ� ��ü�迭�� �����Ѵ�.
	private int capacity = 0; //�뷮
	private int size = 0; //��ü��
	
	//�⺻������
	public MyVector() {
		this(10);
	}

	//�Ű������� �ִ� ������
	public MyVector(int capacity) {
		if(capacity < 0 ) {
			 //IllegalArgumentException�Ű������� Ʋ�ȴٴ� ����
			throw new IllegalArgumentException("Vector�÷����� �������� ���� �� �����ϴ�. " + capacity);
		}
		this.capacity=capacity;
		data = new Object[capacity];
	}
	
	//���Ͱ� ����ִ��� Ȯ��
	public boolean isEmpty() {
		return size == 0;
	}
	//������ �뷮�� �����ϴ� �޼���
	public int capacity() {
		return this.capacity;
	}
	//��ü ���� �������ִ� �޼���
	public int size() {
		return this.size;
	}
	//�ּ����� �������(capacity)�� Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}
	private void setCapacity(int capacity) {
		//�뷮�� ũ�Ⱑ ���ٸ�...
		if(this.capacity == capacity) {
			return;
		}
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size); //�迭 ����
		data = tmp; //���������� ���� ������
		this.capacity = capacity;
	}
	public boolean add(Object obj) {
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	public Object get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		return data[index];
	}
	public Object remove(int index) {
		Object oldObj = null;
		if(index <0 || index >= size) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		oldObj = data[index];
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		data[size-1] =null;
		size--;
		return oldObj;
	}
	public boolean remove(Object obj) {
		for(int i=0; i<size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	public void trimToSize() {
		setCapacity(size);
	}
	public void clear() {
		for(int i=0; i<size; i++) {
			data[i] = null;
		}
		this.size = 0;
	}
	@Override
	public String toString() {
		String tmp = "";
		for(int i=0; i<size; i++) {
			if(i == (size-1))
				tmp += this.data[i];
			else
				tmp += this.data[i] + ",";
		}
		return "["+tmp+"]";
	}
}
