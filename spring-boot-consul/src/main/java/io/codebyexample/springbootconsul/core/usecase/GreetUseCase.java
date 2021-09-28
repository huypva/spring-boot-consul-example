package io.codebyexample.springbootconsul.core.usecase;

import io.codebyexample.springbootconsul.core.entity.Greeting;

/**
 * @author huypva
 */
public interface GreetUseCase {

  Greeting greet(String name);
}
