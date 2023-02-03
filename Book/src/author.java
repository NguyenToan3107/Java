
public class author {
    private String name;
    private dayAuthor birth;
	public author(String name, dayAuthor birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public dayAuthor getBirth() {
    	return birth;
    }
    
    public void setBirth(dayAuthor birth) {
    	this.birth = birth;
    }
    
	@Override
	public String toString() {
		return "author [name=" + name + ", birth=" + birth + "]";
	}
    
    
    
}
