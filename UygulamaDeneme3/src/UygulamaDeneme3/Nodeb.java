package UygulamaDeneme3;
public class Nodeb {
	int data;
	Nodeb next;
	Nodeb prev;
	public Nodeb(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	@Override
	public String toString() {
		return data+","+next;
	}
}
