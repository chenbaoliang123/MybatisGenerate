package com.etc.onlineordering.dao;

import com.etc.onlineordering.entity.Address;
import java.util.List;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    List<Address> selectAll();
}