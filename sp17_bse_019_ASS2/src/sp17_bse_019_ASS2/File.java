package sp17_bse_019_ASS2;
public class File {
	String name;
	String path;
	FileType filetype;
	public File(String name,FileType filetype,String path) {
		this.name=name;
		this.path=path;
		this.filetype=filetype;
	}
	public String getName() {
		return this.name;
	}
	public FileType getType() {
		return this.filetype;
	}
	public String getPath() {
		return this.path;
	}
}
