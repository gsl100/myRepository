package entity;

import java.util.Date;


public class Users {
    public Users(Integer id, String nickname, String gender, String phone, String email,Date createTime, String remark) {
        this.id = id;
        this.nickname = nickname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.createTime=createTime;
        this.remark = remark;
    }

    private Integer id;
    private String username;
    private String userpass;
    private String nickname;
    private Integer age;
    private String gender;
    private String phone;
    private String email;
    private Date createTime;
    private Date updateTime;
    private Date lastLogin;
    private Integer userStatus;
    private String remark;

    public Users(Integer id) {
        this.id = id;
    }

    public Users() {

    }

    public Users(String username, String userpass, String nickname, Integer age, String gender, String phone, String email, Date createTime, Date updateTime, Date lastLogin, Integer userStatus) {
        this.username = username;
        this.userpass = userpass;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastLogin = lastLogin;
        this.userStatus = userStatus;
    }

    public Users(String usrename, String userpass, String nickname, Integer age, String gender, String phone, String email) {
        this.username = username;
        this.userpass = userpass;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public Users(Integer id, String nickname, Integer age, String gender, String phone, String email, Date updateTime, String remark) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    public Users(Integer id, String nickname, Integer age, String gender, String phone, String email, String remark) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.remark = remark;
    }

    public Users(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
