package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  * Javadoc for greed.
  *
  * @param someone An entry string.
  * @return Some string.
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
