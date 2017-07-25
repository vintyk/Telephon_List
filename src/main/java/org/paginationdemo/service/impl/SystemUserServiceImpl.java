package org.paginationdemo.service.impl;

import org.paginationdemo.domain.SystemUser;
import org.paginationdemo.repository.SystemUserRepository;
import org.paginationdemo.service.SystemUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SystemUserServiceImpl implements SystemUserService {

    private SystemUserRepository systemUserRepository;

    public SystemUserServiceImpl(SystemUserRepository systemUserRepository) {
        this.systemUserRepository = systemUserRepository;
    }

    @Transactional
    @Override
    public SystemUser findSystemUserByEmailSystemUser(String email) {
        return null;
    }
}
