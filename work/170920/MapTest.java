//package jp01.part09;

import java.util.Hashtable;
import java.util.Map;

public class MapTest  
{
	public static void main(String[] args) 
	{	
		Map<String,String> map = new Hashtable<String,String>();

		String key = new String(" 홍길동");
		String value = new String("의적");
		map.put(key,value);
		map.put("이순신","수군 대장군");
		map.put("주몽","고구려 시조");

		String value01  = map.get("주몽");
		System.out.println("주몽 설명 : "+value01);

		if(map.containsKey("이순신")){
				System.out.println("이순신을 key로 갖는 value가 있으며 value : "+map.get("이순신"));
			}
		if(map.containsKey("김유신")){
				System.out.println("김유신을 key로 갖는 value가 있으며 value : "+map.get("김유신"));
			}
		if(map.containsKey("의적")){
				System.out.println("의적을 value로 갖는 data가 있습니다. : ");
			}
		if(map.containsKey("도적")){
				System.out.println("도적을value로 갖는 data가 있습니다. : ");
			}

		}
	}

