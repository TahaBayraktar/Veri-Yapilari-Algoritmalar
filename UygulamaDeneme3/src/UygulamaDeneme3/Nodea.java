package UygulamaDeneme3;

public class Nodea {
	Nodea lc;
	Nodea rc;
	int data;
	int boy;
	public Nodea(int data) {
		this.lc=null;
		this.rc=null;
		this.data=data;
		this.boy=1;
	}
	@Override
	public String toString() {
		return "["+"data:"+data+
				"lc:"+lc+
				"rc:"+rc+
				"]";
	}
}
