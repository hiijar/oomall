package xmu.oomall.vo;

/**
 * 用户注册VO
 * 
 */
public class UserRegisterVo {
    private String username;
    private String password;
    private String telephone;
    /**
     * 手机验证码
     */
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserRegisterVo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
