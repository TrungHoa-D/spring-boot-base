package com.example.projectbase.constant;

/**
 * The type Url constant.
 */
public class UrlConstant {

  /**
   * The type Auth.
   */
  public static class Auth {
    private static final String PRE_FIX = "/auth";

    /**
     * The constant LOGIN.
     */
    public static final String LOGIN = PRE_FIX + "/login";
    /**
     * The constant LOGOUT.
     */
    public static final String LOGOUT = PRE_FIX + "/logout";

    private Auth() {
    }
  }

  /**
   * The type User.
   */
  public static class User {
    private static final String PRE_FIX = "/user";

    /**
     * The constant GET_USERS.
     */
    public static final String GET_USERS = PRE_FIX;
    /**
     * The constant GET_USER.
     */
    public static final String GET_USER = PRE_FIX + "/{userId}";
    /**
     * The constant GET_CURRENT_USER.
     */
    public static final String GET_CURRENT_USER = PRE_FIX + "/current";

    private User() {
    }
  }

}
