package com.example.projectbase.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * The type Internal server exception.
 */
@Getter
@Setter
public class InternalServerException extends RuntimeException {

  private String message;

  private HttpStatus status;

  private String[] params;

  /**
   * Instantiates a new Internal server exception.
   *
   * @param message the message
   */
  public InternalServerException(String message) {
    super(message);
    this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    this.message = message;
  }

  /**
   * Instantiates a new Internal server exception.
   *
   * @param status  the status
   * @param message the message
   */
  public InternalServerException(HttpStatus status, String message) {
    super(message);
    this.status = status;
    this.message = message;
  }

  /**
   * Instantiates a new Internal server exception.
   *
   * @param message the message
   * @param params  the params
   */
  public InternalServerException(String message, String[] params) {
    super(message);
    this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    this.message = message;
    this.params = params;
  }

  /**
   * Instantiates a new Internal server exception.
   *
   * @param status  the status
   * @param message the message
   * @param params  the params
   */
  public InternalServerException(HttpStatus status, String message, String[] params) {
    super(message);
    this.status = status;
    this.message = message;
    this.params = params;
  }

}