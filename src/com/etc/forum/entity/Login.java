package com.etc.forum.entity;

public class Login {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_login.id
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_login.userid
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_login.name
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_login.password
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_login.role
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private Integer role;



    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_login.id
     *
     * @return the value of f_login.id
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_login.id
     *
     * @param id the value for f_login.id
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_login.userid
     *
     * @return the value of f_login.userid
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_login.userid
     *
     * @param userid the value for f_login.userid
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_login.name
     *
     * @return the value of f_login.name
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_login.name
     *
     * @param name the value for f_login.name
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_login.password
     *
     * @return the value of f_login.password
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_login.password
     *
     * @param password the value for f_login.password
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_login.role
     *
     * @return the value of f_login.role
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_login.role
     *
     * @param role the value for f_login.role
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setRole(Integer role) {
        this.role = role;
    }
}