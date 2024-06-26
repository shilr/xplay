package com.github.jsbxyyx.xbook.data.bean;

/**
 * @author jsbxyyx
 * @since 1.0
 */
public class Profile implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String nickname;
    private String email;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
