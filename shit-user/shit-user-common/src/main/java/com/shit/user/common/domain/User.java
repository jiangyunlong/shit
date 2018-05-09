package com.shit.user.common.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * @TODO
 * @author Long
 * @date 2017年8月10日下午5:32:48
 */
public class User {

	private Long id;

    private String username;

    private String password;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof User)) {
			return false;
		}
		User rhs = (User) obj;
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.append(this.username, rhs.username)
		.append(this.age, rhs.age)
		.isEquals();
	}

	@Override
	public int hashCode() {
		
		return new HashCodeBuilder(-82280557, -700257973)
				.append(this.id) 
				.append(this.username) 
				.append(this.age) 
				.toHashCode();
	}

	@Override
	public String toString() {
		
		return new ToStringBuilder(this)
				.append("id", this.id) 
				.append("username", this.username) 
				.append("age", this.age) 
				.toString();
	}
}
