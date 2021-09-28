package io.codebyexample.springbootconsul.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author huypva
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "my-config")
public class MyConf {

  private int id;
  private String value;

}
