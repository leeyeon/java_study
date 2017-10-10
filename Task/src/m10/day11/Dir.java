package m10.day11;

import java.io.File;

public class Dir {
	
	private void printDir(String str) {
		File file = new File(str);
		File[] fileList = file.listFiles();
		
		if(file.isDirectory()) {
			for(int i=0; i<fileList.length; i++) {
				if(fileList[i].isDirectory()) {
					printDir(fileList[i].getPath());
				}
			}
			
			System.out.println(file.getPath());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dir().printDir("test_dir");
		System.out.println("����� �Ϸ�Ǿ����ϴ�");
	}

}