package UygulamaDeneme3;
import java.util.Arrays;
import java.util.Random;



public class AnaSinif {

	public static void main(String[] args) {
		IkılıArama ı=new IkılıArama();
		ı.ekle(15);
		ı.ekle(10);
		ı.ekle(20);
		ı.ekle(25);
		ı.ekle(8);
		ı.ekle(7);
		ı.ekle(3);
		ı.ekle(9);
		ı.ekle(18);
		ı.ekle(26);
		ı.ekle(27);
		ı.ekle(112);
		ı.ekle(32);
		ı.ekle(154);
		ı.ekle(22);
		ı.sil(15);
		ı.sil(25);
		ı.sil(27);
		ı.sil(8);
		ı.sil(7);
		ı.sil(9);
		ı.sil(3);
		ı.sil(10);
		ı.yazdır();
		ı.preOrder();
		System.out.println();
		Avl a=new Avl();
		a.ekle(33);
		a.ekle(13);
		a.ekle(53);
		a.ekle(9);
		a.ekle(21);
		a.ekle(61);
		a.ekle(8);
		a.ekle(11);
		a.ekle(12);
		a.sil(8);
		a.sil(9);
		a.sil(33);
		a.sil(12);
		a.sil(11);
		a.sil(13);
		a.yazdır();
		a.preOrder();
		System.out.println();
		BaglıListe b=new BaglıListe();
		Nodeb l=new Nodeb(54);
		Nodeb l1=new Nodeb(24);
		Nodeb l2=new Nodeb(62);
		Nodeb l3=new Nodeb(75);
		Nodeb l4=new Nodeb(95);
		Nodeb l5=new Nodeb(11);
		b.ekle(l);
		b.ekle(l1);
		b.ekle(l2);
		b.ekle(l3);
		b.ekle(l4);
		b.ekle(l5);
		b.yazdır();
		b.sil(62);
		b.yazdır();
		b.arama(75);
		int[] d=new int[10];
		Random r=new Random();
		for(int i=0;i<d.length;i++) {
			d[i]=r.nextInt(100);
		}
		
		System.out.println("sadsa");
		System.out.println("İlk dize:"+Arrays.toString(d));
		//buble(d);
		//bubleyazdır(d);
		//selection(d);
		//selectionyazdır(d);
		insert(d);
		insertyazdır(d);
		Hash h=new Hash();
		h.ekle("berkay", "sarı", 321);
		h.ekle("yusa", "ağca", 247);
		h.ekle("taha", "bayraktar", 236);
		h.ekle("berke", "naber", 216);
		h.sil(247);
		h.listele();
		h.arama(236);
		
		
	}
	public static void buble(int d[]) {
		boolean swap=true;
		for(int i=0;i<d.length && swap;i++) {
			swap=false;
			for(int j=0;j<(d.length-1)-i;j++) {
				if(d[j]>d[j+1]) {
					swap=true;
					int tmp=d[j];
					d[j]=d[j+1];
					d[j+1]=tmp;
				}
			}
		}
	}
	public static void selection(int d[]) {
		int min=0;
		for(int i=0;i<d.length;i++) {
			min=i;
			for(int j=i+1; j<d.length;j++) {
				if(d[min]>d[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int tmp=d[min];
				d[min]=d[i];
				d[i]=tmp;
			}
		}
		
	}
	public static void insert(int d[]) {
		int t=0,i=0,j=0;
		for(i=0;i<d.length;i++) {
			t=d[i];
			for(j=i;j>0 && t<d[j-1];j--) {
				d[j]=d[j-1];
			}
			d[j]=t;
		}
	}
	public static void insertyazdır(int d[]) {
		System.out.print("insert:[");
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+",");
		}
		System.out.println("]");
	}
	public static void selectionyazdır(int d[]) {
		System.out.print("selection:[");
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+",");
		}
		System.out.println("]");
	}
	public static void bubleyazdır(int d[]) {
		System.out.print("buble:[");
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+",");
		}
		System.out.println("]");
	}

}
