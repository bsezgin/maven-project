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
  * 
  * @param someone name of a someone
  * @return greeting screen
  */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
