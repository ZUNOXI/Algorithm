package algo0729;

public class Arayyerro extends Exception {
	String errmsg ;
	
	public Arayyerro() {
		
	}
	
	public Arayyerro(String errmsg) {
		super();
		this.errmsg = errmsg;
	}
	
	public void shoeError() {
		System.out.println(errmsg);
	}
}
