package sp17_bse_019_ASS2;

public abstract class BaseHandler implements Handler {
	private String name;
	Handler next=null;
	public BaseHandler(String name) {
		this.name=name;
	}
	public void setNext(Handler next) {
		this.next=next;
	}
	public String getName() {
		return this.name;
	}
}
