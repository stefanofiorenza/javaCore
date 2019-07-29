package course.jse.collections.generics.domain;

public class BoxUntyped {

	Object content;
	
	public void addContent(Object externalContent) {
		this.content=externalContent;
	}
	
	public void removeContent() {
		this.content=null;
	}
	
	public Object getContent() {
		return this.content;
	}
	
	
}
