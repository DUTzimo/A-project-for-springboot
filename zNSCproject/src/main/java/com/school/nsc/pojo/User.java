package com.school.nsc.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("nuser")
public class User {
	@TableId(type =IdType.AUTO)  //表示自增长
	 private int Uid;
	 private String Password;
	 private String Uname;
	 private String Phone;
	 private String Salt;


  //----------------------------------------------- 
	 
	 
	 
    @Override
    public String toString() {
        return "User{" +
                "uid=" + Uid +
                ", username='" + Uname + '\'' +
                ", password='" + Password + '\'' +
                ", salt='" + Salt + '\'' +
                ", Phone=" + Phone+
                "} " + super.toString();
    }



	public int getUid() {
		return Uid;
	}



	public void setUid(int uid) {
		Uid = uid;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public String getUname() {
		return Uname;
	}



	public void setUname(String uname) {
		Uname = uname;
	}



	public String getPhone() {
		return Phone;
	}



	public void setPhone(String string) {
		Phone = string;
	}

	public String getSalt() {
		return Salt;
	}



	public void setSalt(String Salt) {
		this.Salt = Salt;
	}

}


