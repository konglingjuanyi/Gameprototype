package org.gameprototype.dao.model;

import java.io.Serializable;

public class Account implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.account
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.pass_word
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    private String passWord;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.account
     *
     * @return the value of account.account
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.account
     *
     * @param account the value for account.account
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.pass_word
     *
     * @return the value of account.pass_word
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.pass_word
     *
     * @param passWord the value for account.pass_word
     *
     * @mbggenerated Mon Sep 14 15:39:59 CST 2015
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}