package com.accounting.rest.multitenant.mastertenant.service;

import com.accounting.rest.multitenant.mastertenant.entity.MasterTenant;

/**
 * @author Md. Amran Hossain
 */
public interface MasterTenantService {
	MasterTenant findByClientId(Integer clientId);

}
