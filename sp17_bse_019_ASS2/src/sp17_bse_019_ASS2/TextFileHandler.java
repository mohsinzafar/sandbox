package sp17_bse_019_ASS2;

public class TextFileHandler extends BaseHandler {
private Handler next;
	private String name;
	public TextFileHandler(String name) {
		super(name);
		this.name = name;
	}
	
	public void handle(File file) {
		this.next = super.next;
		if(file.getType().equals(FileType.TXT)) {
			System.out.println("Processing by :"+name+" with type "+file.getType());
		}
		else if(next!=null) {
			System.out.println("Notepad++ forward requests to :"+next.getName()+" with type "+file.getType());
		next.handle(file);
		}
		else {
			System.out.println("File not supported");
		}

}
}
