package user;

import java.util.List;
import java.util.Vector;

public class UserVO {
	
	/* F/T 는 나중에 구현해보기! */

	String name;
	/* 남: false 여: true */
	String gender;
	String year;
	String month;
	String day;
	String calendar;
	String education;
	String job;
	String position;
	/* 미혼: false 기혼: true */
	String married;
	String children;
	String telFirst;
	String telSecond;
	String telThird;
	/* 집: false 직장: true */
	String telCheck;
	String mobileFirst;
	String mobileSecond;
	String mobileThird;
	String mobileCheck;
	/* 국내: false 국외: true */
	String country;
	String address;
	
	public UserVO() {
		
	};
	
	public UserVO(String name, String gender, String year, String month, String day, String calendar, String education,
			String job, String position, String married, String children, String telFirst, String telSecond,
			String telThird, String telCheck, String mobileFirst, String mobileSecond, String mobileThird,
			String mobileCheck, String country, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.year = year;
		this.month = month;
		this.day = day;
		this.calendar = calendar;
		this.education = education;
		this.job = job;
		this.position = position;
		this.married = married;
		this.children = children;
		this.telFirst = telFirst;
		this.telSecond = telSecond;
		this.telThird = telThird;
		this.telCheck = telCheck;
		this.mobileFirst = mobileFirst;
		this.mobileSecond = mobileSecond;
		this.mobileThird = mobileThird;
		this.mobileCheck = mobileCheck;
		this.country = country;
		this.address = address;
	}

	public List<String> getUser() {
		Vector<String> user = new Vector<String>();
		
		user.add(name);
		user.add(gender);
		user.add(year);
		user.add(month);
		user.add(day);
		
		user.add(calendar);
		user.add(education);
		user.add(job);
		user.add(position);
		user.add(married);
		
		user.add(children);
		user.add(telFirst);
		user.add(telSecond);
		user.add(telThird);
		user.add(telCheck);
		
		user.add(mobileFirst);
		user.add(mobileSecond);
		user.add(mobileThird);
		user.add(mobileCheck);
		user.add(country);
		
		user.add(address);
		
		return user;
	}
	
	/*
	public UserVO setUser(List<String> user) {
		
		UserVO uv = new UserVO();
		
		String[] userColumn = new String[]{name, gender, year, month, day, calendar, education,
				job, position, married, children, telFirst, telSecond,
				telThird, telCheck, mobileFirst, mobileSecond, mobileThird};
		
		for(int i=0; i<user.size(); i++) {
			 
		}
			
		return uv;
		
	}
	*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getCalender() {
		return calendar;
	}
	public void setCalender(String calender) {
		this.calendar = calender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public String getTelFirst() {
		return telFirst;
	}
	public void setTelFirst(String telFirst) {
		this.telFirst = telFirst;
	}
	public String getTelSecond() {
		return telSecond;
	}
	public void setTelSecond(String telSecond) {
		this.telSecond = telSecond;
	}
	public String getTelThird() {
		return telThird;
	}
	public void setTelThird(String telThird) {
		this.telThird = telThird;
	}
	public String getTelCheck() {
		return telCheck;
	}
	public void setTelCheck(String telCheck) {
		this.telCheck = telCheck;
	}
	public String getMobileFirst() {
		return mobileFirst;
	}
	public void setMobileFirst(String mobileFirst) {
		this.mobileFirst = mobileFirst;
	}
	public String getMobileSecond() {
		return mobileSecond;
	}
	public void setMobileSecond(String mobileSecond) {
		this.mobileSecond = mobileSecond;
	}
	public String getMobileThird() {
		return mobileThird;
	}
	public void setMobileThird(String mobileThird) {
		this.mobileThird = mobileThird;
	}
	public String getMobileCheck() {
		return mobileCheck;
	}
	public void setMobileCheck(String mobileCheck) {
		this.mobileCheck = mobileCheck;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", gender=" + gender + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", calender=" + calendar + ", education=" + education + ", job=" + job + ", position=" + position
				+ ", married=" + married + ", children=" + children + ", telFirst=" + telFirst + ", telSecond="
				+ telSecond + ", telThird=" + telThird + ", telCheck=" + telCheck + ", mobileFirst=" + mobileFirst
				+ ", mobileSecond=" + mobileSecond + ", mobileThird=" + mobileThird + ", mobileCheck=" + mobileCheck
				+ ", country=" + country + ", address=" + address + "]";
	}

}
