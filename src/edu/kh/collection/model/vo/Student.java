package edu.kh.collection.model.vo;

public class Student {
	//필드
	
	private String name; // 이름
	private int age; // 나이
	private String region; // 지역
	private char gender; // 성별(m/f)
	private int score; //점수
	
	//생성자
	public Student(){} //기본생성자
	public Student(String name, int age, String region, char gender, int score) {
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
	}
	//매개변수 생성자
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// toString() 오버라이딩 자동완성
	@Override
	public String toString() {
		return "[이름=" + name + ", 나이=" + age + ", 지역=" + region + ", 성별=" + gender + ", 점수="
				+ score + "]";
	}
	
	
}
