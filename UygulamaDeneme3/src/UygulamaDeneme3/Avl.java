package UygulamaDeneme3;

public class Avl {
	Nodea root;
	public Avl() {
		this.root=null;
	}
	public void ekle(int data) {
		root=ekleRecursive(root,data);
	}
	private Nodea ekleRecursive(Nodea current,int data) {
		if(current==null) {
			current=new Nodea(data);
			return current;
		}
		else if(current.data<data) {
			current.rc=ekleRecursive(current.rc,data);
		}
		else if(current.data>data) {
			current.lc=ekleRecursive(current.lc,data);
			
		}
		current.boy=1+max(boy(current.rc),boy(current.lc));
		int denge=denge(current);
		if(denge==2 && current.lc.data>data) {
			return sagRotasyon(current);
		}
		if(denge==2 && current.lc.data<data) {
			current.lc=solRotasyon(current.lc);
			return sagRotasyon(current);
		}
		if(denge==-2 && current.rc.data<data) {
			solRotasyon(current);
		}
		if(denge==-2 && current.rc.data>data) {
			current.rc=sagRotasyon(current.rc);
			return solRotasyon(current);
		}
		return current;
	}
	private int denge(Nodea current) {
		return boy(current.lc)-boy(current.rc);
	}
	private int boy(Nodea current) {
		if(current!=null) {
			return current.boy;
		}
		return 0;
	}
	private int max(int a,int b) {
		if(a<b) {
			return b;
		}
		return a;
	}
	private Nodea solRotasyon(Nodea current) {
		Nodea y=current.rc;
		Nodea t2=y.lc;
		y.lc=current;
		current.rc=t2;
		current.boy=1+max(boy(current.lc),boy(current.rc));
		y.boy=1+max(boy(current.lc),boy(current.rc));
		return y;
	}
	private Nodea sagRotasyon(Nodea current) {
		Nodea y=current.lc;
		Nodea t2=y.rc;
		y.rc=current;
		current.lc=t2;
		current.boy=1+max(boy(current.lc),boy(current.rc));
		y.boy=1+max(boy(current.lc),boy(current.rc));
		return y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void preOrder() {
		preOrderRecursive(root);
	}
	private void preOrderRecursive(Nodea current) {
		if(current!=null) {
			preOrderRecursive(current.lc);
			System.out.print(current.data+"/");
			preOrderRecursive(current.rc);
		}
	}
	private int max(Nodea current) {
		Nodea tmp=current;
		while(tmp.rc!=null) {
			tmp=tmp.rc;
		}
		return tmp.data;
	}
	public void sil(int data) {
		root=silRecurisve(root,data);
	}
	private Nodea silRecurisve(Nodea current,int data) {
		if(current==null) {
			return current;
		}
		else if(current.data<data) {
			current.rc=silRecurisve(current.rc,data);
		}
		else if(current.data>data) {
			current.lc=silRecurisve(current.lc,data);
		}
		else {
			if(current.rc==null) {
				return current.lc;
			}
			else if(current.lc==null) {
				return current.rc;
			}
			else {
				int max=max(current.lc);
				current.data=max;
				current.lc=silRecurisve(current.lc,max);
			}
		}
		current.boy=1+max(boy(current.rc),boy(current.lc));
		int denge=denge(current);
		if(denge==2) {
			if(denge(current.lc)>=0) {
				return sagRotasyon(current);
			}
			else {
				current.lc=solRotasyon(current.lc);
				return sagRotasyon(current);
			}
			
		}
		if(denge==-2) {
			if(denge(current.rc)<=0) {
				return solRotasyon(current);
			}
			else {
				current.rc=sagRotasyon(current.rc);
				return solRotasyon(current);
			}
		}
		return current;
	}
	public void yazdır() {
		yazdırRecursive(root,"");
	}
	private void yazdırRecursive(Nodea current,String indent) {
		System.out.println(indent+current.data);
		if(current.lc!=null) {
			yazdırRecursive(current.lc,indent+"    ");
		}
		if(current.rc!=null) {
			yazdırRecursive(current.rc,indent+"    ");
		}
	}
}
