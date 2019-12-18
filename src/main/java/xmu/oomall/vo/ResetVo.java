package xmu.oomall.vo;

/**
 * 重置密码和重置手机号码的Vo，这里不需要username和userId，因为telephone对每一个用户唯一
 * 而且你可能就是因为忘记用户名才要重置密码的^_^
 * 
 */
public class ResetVo {
    private String telephone;
    private String password;
    /**
     * 验证码
     */
    private String code;

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

    @Override
    public String toString() {
        return "ResetPhoneVo{" +
                "telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
