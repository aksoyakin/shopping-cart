package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.dto.UserDto;
import com.aksoyakin.shoppingcart.model.request.CreateUserRequest;
import com.aksoyakin.shoppingcart.model.request.UserUpdateRequest;
import com.aksoyakin.shoppingcart.model.entity.User;

public interface UserService {

    User getUserById(Long userId);

    User createUser(CreateUserRequest user);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertToUserToDto(User user);

    User getAuthenticatedUser();
}
