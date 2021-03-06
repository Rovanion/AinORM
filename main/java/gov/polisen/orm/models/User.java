package gov.polisen.orm.models;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_name
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.real_name
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.salt
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password_hash
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    private String passwordHash;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    public User(Integer id, String userName, String realName, String salt, String passwordHash) {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.salt = salt;
        this.passwordHash = passwordHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_name
     *
     * @return the value of users.user_name
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.real_name
     *
     * @return the value of users.real_name
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.salt
     *
     * @return the value of users.salt
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password_hash
     *
     * @return the value of users.password_hash
     *
     * @mbggenerated Sat Apr 26 15:24:21 CEST 2014
     */
    public String getPasswordHash() {
        return passwordHash;
    }
}