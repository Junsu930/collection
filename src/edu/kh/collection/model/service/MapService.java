package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Member;

public class MapService {

	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체 
	
	// - Key를 모아두면 Set의 특징 ( 중복 X )
	// - Value를 모아두면 List의 특징 ( 중복 O ) 
	
	public void ex1() {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) : 추가 (put : 놓다)
		map.put(1, "빵빠이");
		map.put(2, "김철수");
		map.put(3, "쌈쌈이");
		map.put(4, "릭숑이");
		map.put(5, "칠칠이");
		map.put(6, "동댕이");
		map.put(7, "룽봉이");
		
		//키 중복
		map.put(1, "릭빠숑");
		map.put(8, "김철수");
		
		System.out.println(map);
		
	}

	public void ex2() {
		
		// map 사용 예제
		
		// VO (값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용 
		// -> 재사용이 적은 VO는 오히려 코드 낭비
		// -> Map을 이용해서 VO와 비슷한 코드를 작성할 수 있다. 
		
		// 1) VO 버전
		
		Member mem = new Member();
		
		// 값 세팅
		mem.setId("user01");
		mem.setPw("pass01");
		mem.setAge(30);
		
		// 값 출력
		System.out.println( mem.getId() );
		System.out.println( mem.getPw() );
		System.out.println( mem.getAge() );
		
		
		
		System.out.println("==============================");
		
		// 2) Map버전
		
		Map<String, Object> map = new HashMap<String, Object>();
		// value가 Object 타입 == 어떤 객체든 Value에 들어올 수 있다.
		
		// 값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 32);
	
		// 값 출력
		System.out.println( map.get("id").toString());
		//String java.lang.Object.toString() -> 정적 바인딩
		// 실행 중 확인해보니 String 의 자식 객체 => 자식 toString()호출
		
		System.out.println( map.get("pw"));
		System.out.println( map.get("age"));
		
		System.out.println("==============================");
		// *** Map에 저장된 데이터를 순차적으로 접근하기 ***
		
		// Map에서 Key만 모아두면 Set의 특징
		// -> 이를 활용할 수 있도록 Map에서 keySet() 메소드 제공
		// --> key만 모아서 Set으로 반환 
		
		Set<String>set = map.keySet();
		//Set<Entry<String, Object>>set2 = map.entrySet();
		
		System.out.println(set);
		
		
		for(String Key : set) {
			System.out.println(map.get(Key)); 
			// key가 반복될 때마다 변경
			// -> 변경된 key에 맞는 map의 value가 출력	
		}
		
		// 향상된 for문
		
		// map에 저장된 데이터가 많을 때,
		// 어떤 key가 있는지 불분명할 때,
		// map에 저장된 모든 데이터에 접근해야할 때
		// keySet() + 향상된 for문 코드를 사용한다.
	
	}
	
	public void ex3() { 
		
		// List + Map
		// user 10 명, user의 id 쭉 뽑는다
		
		// k : v
		// "id" : "user01"
		// "id" : "user02"
		// "id" : "user03"
		// "id" : "user04"
		// ...
		
		List<Map<String, Object>> list =new ArrayList <Map<String, Object>>();
		
		
		for ( int i = 0; i<10; i++) {
			// Map 생성
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("pw", "pass0"+i);
			map.put("id", "user0"+i);
			
			// Map을 List에 추가
			list.add(map);
			
		}
		
		//for문 종료 시점에 List에는 10개의 Map객체가 추가되어있다. 
		
		// *List에 저장된 Map에서 Key가 "id"인 경우의 Value를 모두 출력"
		
	
		//향상된 for문 
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}
}
