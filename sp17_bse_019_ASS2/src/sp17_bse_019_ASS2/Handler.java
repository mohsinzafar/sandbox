package sp17_bse_019_ASS2;

public interface Handler {
	public void setNext(Handler handler);
	public void handle(File file);
	public String getName();
}
