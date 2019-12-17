package xmu.oomall.vo;

/**
 * 重置手机号的vo
 */
public class ResetPhoneVo {
    /**
     * 原来的手机号
     */
    private String telephone;
    /**
     * 你的密码
     */
    private String password;
    /**
     * 验证码
     */
    private String code;
    /**
     * 新的手机号
     */
    private String newTelephone;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNewTelephone() {
        return newTelephone;
    }

    public void setNewTelephone(String newTelephone) {
        this.newTelephone = newTelephone;
    }

    @Override
    public String toString() {
        return "ResetPhoneVo{" +
                "telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", newTelephone='" + newTelephone + '\'' +
                '}';
    }
}
