package gongju;
/*@ClassName：User
@date：2021/9/23 14:05
@作者：李磊
@Version：1.0
@Description：

*/

import java.util.Objects;

public class User {
    private String username;
    private String password;
    private String Telephone;
    private int integral;

    public User() {
    }

    public User(String username, String password, String telephone, int integral) {
        this.username = username;
        this.password = password;
        Telephone = telephone;
        this.integral = integral;
    }


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
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(Telephone, user.Telephone) && Objects.equals(integral, user.integral);
    }


}
