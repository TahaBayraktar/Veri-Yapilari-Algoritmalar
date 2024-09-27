package UygulamaDeneme3;

import java.util.LinkedList;

public class Hash {
	LinkedList<Nodeh>[] h;
	public Hash() {
		h=new LinkedList[10];
		for(int i=0;i<h.length;i++) {
			h[i]=new LinkedList<>();
		}
	}
	private int hashFonk(int tc) {
		return tc%10;
	}
	public void ekle(String isim,String soyad,int tc) {
		int index=hashFonk(tc);
		Nodeh a=new Nodeh(isim,soyad,tc);
		h[index].addFirst(a);
		
	}
	public void sil(int tc) {
		int index=hashFonk(tc);
		LinkedList<Nodeh> b=h[index];
		for(Nodeh a:b) {
			if(a.tc==tc) {
				b.remove(a);
			}
		}
	}
	public void listele() {
		for(int i=0;i<h.length;i++) {
			System.out.print(i+"------>");
			for(Nodeh a:h[i]) {
				System.out.print("("+a.isim+","+a.soyad+","+a.tc+")"+",");
			}
			System.out.println();
		}
	}
	public void arama(int tc) {
		int index=hashFonk(tc);
		for(Nodeh a:h[index]) {
			if(a.tc==tc) {
				System.out.print("("+a.isim+","+a.soyad+","+a.tc+")");
			}
		}
	}
}