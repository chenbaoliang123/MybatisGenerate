package com.etc.forum.entity;

public class Type {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_type.id
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_type.name
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_type.userid
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    private Long userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_type.id
     *
     * @return the value of f_type.id
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_type.id
     *
     * @param id the value for f_type.id
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_type.name
     *
     * @return the value of f_type.name
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_type.name
     *
     * @param name the value for f_type.name
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_type.userid
     *
     * @return the value of f_type.userid
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_type.userid
     *
     * @param userid the value for f_type.userid
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }
}