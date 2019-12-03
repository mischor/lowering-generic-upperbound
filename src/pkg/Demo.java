package pkg;

public class Demo {

  public static void main(String[] args) {
    new Demo().run();
  }
  
  public void run() {
        
    Token token =  setup(Token.class).build_annotation().get(); 
    
    Token token2 = setup().build_annotation().get();  // error can't convert TOP to Token

    Token token3 = (Token) setup().build_annotation().get();  // fix by casting
    
    Token token4 = setup().<Token>build_annotation_U().get();  // fix by passing in arg.

  }
  
  private <N extends TOP> Framework_top<N> setup(Class<N> clazz) {
    return new Framework_top_impl<N>(clazz);
  }
  
  private <N extends TOP> Framework_top<N> setup() {
    return new Framework_top_impl<N>();
  }

}
