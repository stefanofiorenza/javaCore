package course.jse.collections.generics.domain;

public class Box <T>{

	T content;
	
	public void addContent(T externalContent) {
		this.content=externalContent;
	}
	
	public void removeContent() {
		this.content=null;
	}
	
	public T getContent() {		
		return this.content;
	}
	
	public static <T> Box<T> wrapIntoABox(T objectToBox){
		Box<T> box =new Box<T>();
		box.addContent(objectToBox);
		return box;
	}
	
	public Class<T> getContentClass(){
		return (Class<T>)this.getContent().getClass();
	}
}
