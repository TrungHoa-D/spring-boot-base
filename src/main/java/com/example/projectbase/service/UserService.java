package com.example.projectbase.service;

import com.example.projectbase.domain.dto.pagination.PaginationFullRequestDto;
import com.example.projectbase.domain.dto.pagination.PaginationResponseDto;
import com.example.projectbase.domain.dto.response.UserDto;
import com.example.projectbase.security.UserPrincipal;

/**
 * The interface User service.
 */
public interface UserService {

  /**
   * Gets user by id.
   *
   * @param userId the user id
   * @return the user by id
   */
  UserDto getUserById(String userId);

  /**
   * Gets customers.
   *
   * @param request the request
   * @return the customers
   */
  PaginationResponseDto<UserDto> getCustomers(PaginationFullRequestDto request);

  /**
   * Gets current user.
   *
   * @param principal the principal
   * @return the current user
   */
  UserDto getCurrentUser(UserPrincipal principal);

}
