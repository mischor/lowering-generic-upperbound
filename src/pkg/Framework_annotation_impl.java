package pkg;

public class Framework_annotation_impl<T extends Annotation> implements Framework_annotation {

  Framework_annotation_impl(Class<T> clazz) {
    
  }
  
  Framework_annotation_impl() {
    
  }

  @Override
  public Framework_annotation<T> build_normal() {
    return this;
  }
  
  @Override
  public Framework_annotation<T> build_annotation() {
    return this;
  }

  @Override
  public T framework_get() {
    return null;
  }
}
