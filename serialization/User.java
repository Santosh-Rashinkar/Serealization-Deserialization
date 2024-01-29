package com.prowings.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class User implements Serializable {

	private int uid;
	private String name;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String name, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {

		System.out.println(">>>>>>Inside WriteObject Method<<<<<");
//		oos.defaultWriteObject();
		oos.writeInt(uid);
		oos.writeUTF(name);
		String encryptedPwd = Base64.getEncoder().encodeToString(this.password.getBytes());
		System.out.println("-----> writing encrypted password : " + encryptedPwd);
		oos.writeUTF(encryptedPwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		System.out.println(">>>>>>Inside ReadObject Method<<<<<");
//		ois.defaultReadObject();

		this.uid = ois.readInt();
		this.name = ois.readUTF();
		String ePwd = ois.readUTF();
		byte[] originalPwdBytes = Base64.getDecoder().decode(ePwd.getBytes());
		String originalPwd = new String(originalPwdBytes);
		this.password = originalPwd;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", password=" + password + "]";
	}

}
