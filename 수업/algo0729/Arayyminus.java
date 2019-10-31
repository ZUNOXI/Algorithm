package algo0729;

public class Arayyminus extends Exception {
	String errmsg ;
	
	public Arayyminus() {
		
	}
	
	public Arayyminus(String errmsg) {
		super();
		this.errmsg = errmsg;
	}
	
	public void shoeError() {
		System.out.println(errmsg);
	}
}
