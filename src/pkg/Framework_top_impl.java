package pkg;

public class Framework_top_impl<T extends TOP> implements Framework_top<T> {
 
  <N extends T> Framework_top_impl (Class<N> clazz) {   
  }
  
  Framework_top_impl() {
    
  }
  
  // assign a generic binding at compile time
  
  public <N extends T> Framework_top_impl<N> type(Class<N> clazz) {
    return (Framework_top_impl<N>) this;
  }  

  @Override
  public Framework_top<T> build_normal() {
    // TODO Auto-generated method stub
    return this;
  }

  // THIS FAILS because Framework<U> doesn't override properly,
  //   Workaround: change Framework to Framework_annotation
//  @Override
//  public  <U extends Annotation> Framework<U> build_annotation() {
//    // TODO Auto-generated method stub
//    
//    // would really like to say the generic type
//    // is Annotation if not otherwise specified, else
//    // is what is specified.
//    return new Framework_impl<Annotation>();
//  }


//  public <U extends Annotation> Framework_annotation<U> build_annotation() {
//    // TODO Auto-generated method stub
//    return new Framework_annotation_impl<U>();
//  }


  @Override
  public T get() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Framework_top<T> build_annotation() {
    return this;
  }
  
  @Override
  public Framework_top<?> build_annotation_U() {
    return this;
  }

}
