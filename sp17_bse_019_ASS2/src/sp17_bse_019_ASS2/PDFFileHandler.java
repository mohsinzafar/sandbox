package sp17_bse_019_ASS2;

public class PDFFileHandler extends BaseHandler {
	private String name;
	private Handler next;

	public PDFFileHandler(String name) {
		super(name);
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public void handle(File file) {
		this.next=super.next;
		if(file.getType().equals(FileType.PDF)) {
			System.out.println("Processing by :"+name+" with type "+file.getType());
		}
		else if(next!=null) {
			System.out.println("Adobe Acrobat forward requests to :"+next.getName()+" with type "+file.getType());
			next.handle(file);
		}
		else {
			System.out.println("File not supported");
		}
	}

}
