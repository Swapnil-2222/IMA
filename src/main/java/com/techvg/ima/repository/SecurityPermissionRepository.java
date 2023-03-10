package com.techvg.ima.repository;

import com.techvg.ima.domain.SecurityPermission;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the SecurityPermission entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SecurityPermissionRepository
    extends JpaRepository<SecurityPermission, Long>, JpaSpecificationExecutor<SecurityPermission> {}
