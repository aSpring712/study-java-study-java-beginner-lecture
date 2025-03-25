# break, continue
`break`와 `continue`는 반복문에서 사용할 수 있는 키워드다.
`break`는 반복문을 즉시 종료하고 나간다.
`continue`는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다. <br/>
참고로 `while`, `do-while`, `for`와 같은 모든 반복문에서 사용할 수 있다.

### break
```java
while (조건식) {
	코드1;
	break; // 즉시 while문 종료로 이동한다.
    코드2;
}
// while문 종료
```
`break`를 만나면 코드2가 실행되지 않고 while문이 종료된다.

### continue
```java
while (조건식) {
	코드1;
	continue; // 즉시 조건식으로 이동한다.
    코드2;
}
```
`continue`를 만나면 코드2가 실행되지 않고 다시 조건식으로 이동한다. 조건식이 참이면 `while`문을 실행한다.