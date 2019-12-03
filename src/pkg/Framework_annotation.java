package pkg;

// Assume the Framework references some collection of elements of type T

public  interface  Framework_annotation<T extends Annotation> {
  
  // a builder call which returns the original Framework object
  public Framework_annotation<T> build_normal();
    
  // a builder call which requires that the T be of type Annotation or a subtype of that
  public Framework_annotation<T> build_annotation();
  
  // a call which returns a T element
  public <U extends T> U get();
  
  
}
