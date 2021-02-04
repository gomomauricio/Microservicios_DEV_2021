package net.tecgurus.dto;

public class UsuarioDto 
{
	private String name;
	private String email;
	private String dir;
	private Integer age;
	
	public UsuarioDto() {}
	
	
	public UsuarioDto(String name, String email, String dir, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dir = dir;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	 
	
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioDto [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dir=");
		builder.append(dir);
		builder.append(", edad=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
