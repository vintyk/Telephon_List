package org.paginationdemo.repository;

import org.paginationdemo.domain.SystemUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SystemUserRepository extends PagingAndSortingRepository<SystemUser, Long> {
}
