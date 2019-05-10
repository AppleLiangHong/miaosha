package com.mldy.miaosha.project.dataobject;

import javax.persistence.*;

@Table(name = "user_info")
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "name")
    private String name;

    /**
     * //1代表男性，2 为女性
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 年龄
     */
    @Column(name = "age")
    private Integer age;

    /**
     * 电话
     */
    @Column(name = "telphone")
    private String telphone;

    /**
     * //byphone //bywechart // byalipay
     */
    @Column(name = "register_model")
    private String registerModel;

    /**
     * 第三方账号
     */
    @Column(name = "thrid_party_id")
    private String thridPartyId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取//1代表男性，2 为女性
     *
     * @return gender - //1代表男性，2 为女性
     */
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取电话
     *
     * @return telphone - 电话
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 设置电话
     *
     * @param telphone 电话
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * 获取//byphone //bywechart // byalipay
     *
     * @return register_model - //byphone //bywechart // byalipay
     */
    public String getRegisterModel() {
        return registerModel;
    }

    /**
     * 设置//byphone //bywechart // byalipay
     *
     * @param registerModel //byphone //bywechart // byalipay
     */
    public void setRegisterModel(String registerModel) {
        this.registerModel = registerModel;
    }

    /**
     * 获取第三方账号
     *
     * @return thrid_party_id - 第三方账号
     */
    public String getThridPartyId() {
        return thridPartyId;
    }

    /**
     * 设置第三方账号
     *
     * @param thridPartyId 第三方账号
     */
    public void setThridPartyId(String thridPartyId) {
        this.thridPartyId = thridPartyId;
    }
}