package example;

import javax.inject.Singleton;
import java.io.Serializable;

public class SimpleGreetingImpl implements Greeting, Serializable {

  @Override
  public String getText() {
    return "Hello, World!";
  }
}