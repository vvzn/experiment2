## 一、阅读程序（代码）
``` 
package chooseclass;
public class Student extends People {
	public String courses = "还没有选课,快去开始吧!";
	public Student(String name,String sex,int number) {
		super();
	    this.name=name;
	    this.sex=sex;
	    this.number=number;
	}
	void setCourse(String keming) {
		this.courses=keming;
	}
	//void leaveCourse() {
		//this.courses="还没有选课,快去开始吧!";
	//}
}

package chooseclass;
public class Teacher extends People{
	public String lessonname;
	public String lessontime;
	public String lessonplace;
	Teacher(int number,String name,String sex) {
		super();
		this.number=number;
	    this.name=name;
	    this.sex=sex;
	}
	void setCourse1(String lessonname) {
		this.lessonname=lessonname;
	}
	void setCourse2(String lessontime) {
		this.lessontime=lessontime;
	}
	void setCourse3(String lessonplace) {
		this.lessonplace=lessonplace;
	}
}

package chooseclass;
public class People {
	int number;
	String name,sex;
	public void setNumber(int number) {
		this.number=number;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
}

package chooseclass;
public class TestChooseclass {
	public static String toString(Student stu) {
		return " 学生姓名: "+stu.name+" 学号: "+stu.number+" 学生性别: "+stu.sex+" 已选课程: "+stu.courses;
	}
	//提示教师的课程信息
	public static String toChoose(Teacher tea) {
		return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 老师性别: "+tea.sex+" 所教课程: "+tea.lessonname+" 上课时间:"+tea.lessontime+" 上课地点: "+tea.lessonplace;
	}
	public static void main(String args[]) {
		//学生登录界面
	    System.out.println("请输入姓名以及学号喔!");
	    //学生信息
	    Student stu = new Student("王梓","女",2019310173);
	    //老师信息
	    Teacher tea1 = new Teacher(001,"老王","男");
	    tea1.setCourse1("线代");
	    tea1.setCourse2("7:50");
	    tea1.setCourse3("教103");
	    Teacher tea2 = new Teacher(002,"老张","女");
	    tea2.setCourse1("离散");
	    tea2.setCourse2("13:30");
	    tea2.setCourse3("教300");
	    Teacher tea3 = new Teacher(003,"老李","男");
	    tea3.setCourse1("大物");
	    tea3.setCourse2("9:40");
	    tea3.setCourse3("教207");
	    System.out.println(toString(stu));
	    stu.setCourse("线代");
	    System.out.println(toChoose(tea1));
	    System.out.println(toChoose(tea2));
	    System.out.println(toChoose(tea3));
	    System.out.println("请根据提示开始选课!");
	    System.out.println(toString(stu));}
}
``` 
## 二、实验要求
<br>说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的教授老师也仅有一位，每名学生仅能选一门课程。
<br>对象示例:<br>人员(编号、姓名、性别......)
             <br>教师(编号、姓名、性别、所授课程......)
             <br>学生(编号、姓名、性别、所选课程......)
             <br>课程(编号、课程、名称、上课地点、时间、授课老师......)
<br>以上属性仅为示例,同学们可以自行扩展。
<br>1、编写上述实体类以及测试主类（注意类之间继承关系的适用）
<br>2、在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师等）；模拟学生退课操作，再打印课程信息。
<br>3、编写实验报告。

## 三、实验目的
<br>初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
<br>掌握面向对象的类设计方法（属性、方法）；
<br>掌握类的继承用法，通过构造方法实例化对象；
<br>学会使用super()，用于实例化子类；
<br>掌握使用Object根类的toString()方法，应用在相关对象的信息输出中。

## 四、实验过程
<br>先建立一个父类People,里面包含name,number,sex三个变量,这样在子类Student和Teacher里面就不用再次定义了。
<br>子类的Student里面需要先继承父类的函数，然后我又新定义了一个函数，是用来提示选课的。
<br>子类的Teacher里面同样需要先继承父类的函数，然后新增了三个变量lessonname，lessontime，lessonplace，用来提示学生都有哪些老师可以选课。
<br>Test里面定义了两个静态变量，

## 五、核心方法
<br>子类继承父类，同时子类还需要定义新的函数。
<br>

## 六、实验结果
请输入姓名以及学号喔!
 学生姓名: 王梓 学号: 2019310173 学生性别: 女 已选课程: 还没有选课,快去开始吧!
 老师编号: 1 老师姓名: 老王 老师性别: 男 所教课程: 线代 上课时间:7:50 上课地点: 教103
 老师编号: 2 老师姓名: 老张 老师性别: 女 所教课程: 离散 上课时间:13:30 上课地点: 教300
 老师编号: 3 老师姓名: 老李 老师性别: 男 所教课程: 大物 上课时间:9:40 上课地点: 教207
请根据提示开始选课!
 学生姓名: 王梓 学号: 2019310173 学生性别: 女 已选课程: 线代
 
## 七、实验感想
实际上想写出类似于真的选课系统，但是卡在循环选课上，而且对toString也不熟悉，不知道如何准确使用，还需要多多看书，多多练习，时间长了写代码就不生疏了。
