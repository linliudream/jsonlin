package com.lm.dao;

import java.util.List;
import com.lm.model.User;

public interface UserMapper {

    List<User> findAll();

}
