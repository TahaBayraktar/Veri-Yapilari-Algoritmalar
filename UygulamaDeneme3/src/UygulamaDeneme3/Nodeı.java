package UygulamaDeneme3;

public class Nodeı {
	Nodeı lc;
	Nodeı rc;
	int data;
	public Nodeı(int data) {
		this.data=data;
		this.rc=null;
		this.lc=null;
	}
	@Override
	public String toString() {
		return "["+"data:"+data+
				"lc:"+lc+
				"rc:"+rc
				+"]";
	}
}
