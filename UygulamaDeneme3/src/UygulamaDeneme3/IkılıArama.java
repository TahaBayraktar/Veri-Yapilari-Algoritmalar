package UygulamaDeneme3;

public class IkılıArama {
	Nodeı root;
	public IkılıArama() {
		this.root=null;
	}
	public void ekle(int data) {
		root=ekleRecursive(root,data);
	}
	private Nodeı ekleRecursive(Nodeı current,int data) {
		if(current==null) {
			current=new Nodeı(data);
			return current;
		}
		else if(current.data<data) {
			current.rc=ekleRecursive(current.rc,data);
		}
		else if(current.data>data) {
			current.lc=ekleRecursive(current.lc,data);
			
		}
		return current;
	}
	public void preOrder() {
		preOrderRecursive(root);
	}
	private void preOrderRecursive(Nodeı current) {
		if(current!=null) {
			preOrderRecursive(current.lc);
			System.out.print(current.data+"/");
			preOrderRecursive(current.rc);
		}
	}
	private int max(Nodeı current) {
		Nodeı tmp=current;
		while(tmp.rc!=null) {
			tmp=tmp.rc;
		}
		return tmp.data;
	}
	public void sil(int data) {
		root=silRecurisve(root,data);
	}
	private Nodeı silRecurisve(Nodeı current,int data) {
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
		return current;
	}
	public void yazdır() {
		yazdırRecursive(root,"");
	}
	private void yazdırRecursive(Nodeı current,String indent) {
		System.out.println(indent+current.data);
		if(current.lc!=null) {
			yazdırRecursive(current.lc,indent+"    ");
		}
		if(current.rc!=null) {
			yazdırRecursive(current.rc,indent+"    ");
		}
	}
	
}
