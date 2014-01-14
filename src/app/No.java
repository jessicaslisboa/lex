package app;

public class No {
	
	private No lNo;
	private No rNo;
	private String data;
	
	public No(){
	}
	
	public No(String data){
		this.lNo = null;
		this.rNo = null;
		this.data = data;
	}

	public No getlNo() {
		return lNo;
	}

	public void setlNo(No lNo) {
		this.lNo = lNo;
	}

	public No getrNo() {
		return rNo;
	}

	public void setrNo(No rNo) {
		this.rNo = rNo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
}
