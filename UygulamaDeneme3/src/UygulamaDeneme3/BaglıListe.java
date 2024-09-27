package UygulamaDeneme3;

public class BaglıListe {
	Nodeb head;
	Nodeb tail;
	public BaglıListe() {
		this.head=null;
		this.tail=null;
	}
	public void ekle(Nodeb a) {
		if(head==null) {
			head=a;
			tail=a;
		}
		else {
			Nodeb tmp=head;
			while(tmp.next!=null) {
				tmp=tmp.next;
			}
			tmp.next=a;
			a.prev=tmp;
			tail=a;
		}
	}
	public void sil(int data) {
		if(head.data==data) {
			head=head.next;
			head.prev=null;
		}
		else if(tail.data==data) {
			tail=tail.prev;
			tail.next=null;
		}
		else {
			Nodeb tmp=head;
			while(tmp!=null && tmp.data!=data) {
				tmp=tmp.next;
			}
			tmp.prev.next=tmp.next;
			tmp.next.prev=tmp.prev;
			
		}
	}
	public void arama(int data) {
		if(head.data==data) {
			System.out.println("ilk eleman");
		}
		else if(tail.data==data) {
			System.out.println("Son eleman");
		}
		else {
			Nodeb tmp=head;
			int sayac=1;
			while(tmp!=null && tmp.data!=data) {
				tmp=tmp.next;
				sayac++;
			}
			System.out.println("Kacıncı:"+sayac);
			
		}
	}
	public void yazdır() {
		System.out.print("[");
		System.out.print(head);
		System.out.println("]");
	}
}
