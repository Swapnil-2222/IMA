package com.techvg.ima.repository;

import com.techvg.ima.domain.PurchaseQuotationDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PurchaseQuotationDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PurchaseQuotationDetailsRepository
    extends JpaRepository<PurchaseQuotationDetails, Long>, JpaSpecificationExecutor<PurchaseQuotationDetails> {}
