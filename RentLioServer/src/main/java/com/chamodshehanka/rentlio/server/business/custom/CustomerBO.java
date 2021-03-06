package com.chamodshehanka.rentlio.server.business.custom;

import com.chamodshehanka.rentlio.common.dto.CustomerDTO;
import com.chamodshehanka.rentlio.server.business.SuperBO;

import java.util.List;

/**
 * @author chamodshehanka on 3/14/2018
 * @project RentLio
 **/
public interface CustomerBO extends SuperBO{

    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean deleteCustomer(String customerId)throws Exception;

    public CustomerDTO getCustomerById(String customerId)throws Exception;

    public List<CustomerDTO> getAllCustomers()throws Exception;

}
