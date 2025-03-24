package lombok.basic;

import lombok.*;


// 롬복
//: 롬복은 어노테이션을 이용하여 코드를 자동 생성해준다.

//NoAgrsConstructor			:기본 생성
//AllAgrsConstructor		:모든 매개변수 생성
//RequiredAgrsConstructor	:필수 생성자
//NonNull					: null이 들어오지 못하도록 지정
//							* 필수 생성자의 매개변수로 지정
//@Getter					:getter 메소드 자동 생성
//@Setter					:setter 메소드 자동 생성
//@ToString					:toString 메소드 자동 생성
//@Data						:@Getter, @Setter, @ToString
//							@RequiredArgsConstructor
//							@EqualsHashCode
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Person {

	@NonNull private String name;
	@NonNull private int age;				//기본 타입은 null을 가질 수 없다
	private double height;
	private double weight;
	
}
