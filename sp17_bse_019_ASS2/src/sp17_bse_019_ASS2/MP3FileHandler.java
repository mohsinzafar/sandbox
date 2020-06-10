package sp17_bse_019_ASS2;
public class MP3FileHandler  extends BaseHandler{
	private String name;
	private Handler next;

	public MP3FileHandler(String name) {
		super(name);	
		this.name = name;
	}

	public void handle(File file) {
		this.next = super.next;
		
		if(file.getType().equals(FileType.MP3)) {
			System.out.println("Processing by :"+name+" with type "+file.getType());
		}
		
		else if(next!=null) {
			
			System.out.println("VLC Media Player forward requests to :"+next.getName()+" with type "+file.getType());
			
		next.handle(file);
		}
		
		else {
			
			System.out.println("File not supported");
		}
	}
}
