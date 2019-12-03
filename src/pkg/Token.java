package pkg;

public class Token extends Annotation {
  public String getToken() {
    return "theString".substring(getBegin(), getEnd());
  }
}
