public class Developer2
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

	public String getName() {
		System.out.println("getName() method");
		return name;
	}

	public String getJob() {
		System.out.println("getJob() method");
		return job;
	}

	public int getAvgIncome() {
		System.out.println("getAvgIncome() method");
		return avgIncome;
	}

	public int getProjectCareer() {
		System.out.println("getprojectCareer() method");
		return projectCareer;
	}

	public static void main(String[] args) 
	{
		Developer2 developer = new Developer2();

		System.out.println("�̸��� : "+developer.name);
		System.out.println("������ : "+developer.job);
		System.out.println("��ռ����� : "+developer.avgIncome);
		System.out.println("PJT����� : "+developer.projectCareer);

		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		
		System.out.println("�̸��� : "+developer.name);
		System.out.println("������ : "+developer.job);
		System.out.println("��ռ����� : "+developer.avgIncome);
	}
}
