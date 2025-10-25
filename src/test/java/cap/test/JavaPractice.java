package cap.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String s ="JagapathiJt";
		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		for(char c:s.toCharArray())
		{
			if(map1.containsKey(c))
			{
				map1.put(c, map1.get(c)+1);
			}else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
	}
	
}
