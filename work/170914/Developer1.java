public class Developer1 
{
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer;

	public void participateProject() {
		System.out.println("���α׷� ���߷� ���� ����, ��� ����");
		avgIncome++;
		projectCareer++;
	}

	public void participateProject(String project) {
		System.out.println(project +"==> project ������ ���� ����, ��� ����");
		avgIncome++;
		projectCareer++;
	}

	public void instruct() {
		System.out.println("���Ǹ� ���� ���� ����");
		avgIncome++;
	}

	public void instruct(int lectureCount){
		System.out.println(lectureCount + " : �� ���Ǹ� ���� ���� ����");
		avgIncome += lectureCount;
	}
}
