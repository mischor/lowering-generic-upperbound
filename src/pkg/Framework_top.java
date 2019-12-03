package pkg;

// Assume the Framework references some collection of elements of type T

public  interface  Framework_top<T extends TOP> {
  
  // a builder call which returns the original Framework object
  public Framework_top<T> build_normal();
    
  // a builder call which requires that the T be of type Annotation or a subtype of that
//  public <U extends Annotation> Framework_annotation<U> build_annotation();
  
  // a call which returns a T element
  public T get();

  <U extends T> Framework_top<U> build_annotation_U();

  Framework_top<T> build_annotation();


  
}
