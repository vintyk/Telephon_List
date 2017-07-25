package org.paginationdemo.service;

import org.paginationdemo.domain.SystemUser;

public interface SystemUserService {

    SystemUser findSystemUserByEmailSystemUser(String email);
}
