package chooseclass;

public class TestChooseclass {
	public static String toString(Student stu) {
		return " ѧ������: "+stu.name+" ѧ��: "+stu.number+" ѧ���Ա�: "+stu.sex+" ��ѡ�γ�: "+stu.courses;
	}
	//��ʾ��ʦ�Ŀγ���Ϣ
	public static String toChoose(Teacher tea) {
		return " ��ʦ���: "+tea.number+" ��ʦ����: "+tea.name+" ��ʦ�Ա�: "+tea.sex+" ���̿γ�: "+tea.lessonname+" �Ͽ�ʱ��:"+tea.lessontime+" �Ͽεص�: "+tea.lessonplace;
	}
	public static void main(String args[]) {
		//ѧ����¼����
	    System.out.println("�����������Լ�ѧ���!");
	    //ѧ����Ϣ
	    Student stu = new Student("����","Ů",2019310173);
	    //��ʦ��Ϣ
	    Teacher tea1 = new Teacher(001,"����","��");
	    tea1.setCourse1("�ߴ�");
	    tea1.setCourse2("7:50");
	    tea1.setCourse3("��103");
	    Teacher tea2 = new Teacher(002,"����","Ů");
	    tea2.setCourse1("��ɢ");
	    tea2.setCourse2("13:30");
	    tea2.setCourse3("��300");
	    Teacher tea3 = new Teacher(003,"����","��");
	    tea3.setCourse1("����");
	    tea3.setCourse2("9:40");
	    tea3.setCourse3("��207");
	    System.out.println(toString(stu));
	    stu.setCourse("�ߴ�");
	    System.out.println(toChoose(tea1));
	    System.out.println(toChoose(tea2));
	    System.out.println(toChoose(tea3));
	    System.out.println("�������ʾ��ʼѡ��!");
	    System.out.println(toString(stu));}
}
