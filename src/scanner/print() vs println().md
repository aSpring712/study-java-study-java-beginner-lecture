## print() vs println()
다음 코드를 보면 println()이 아니라 printf()를 사용한다. <br/>
System.out.print("문자열을 입력하세요: ") <br/>
그 이유는 다음과 같다.

print() - 출력하고 다음 라인으로 넘기지 않는다.
```java
System.out.print("hello");
System.out.print("world");
// 결과: helloworld
```

println() - 출력하고 다음 라인으로 넘긴다.
```java
System.out.println("hello");
System.out.println("world");
// 결과:
hello
world
```

우리가 엔터 키를 치면 (`\n`)이라는 문자를 남기는 것이다. <br/>
이 문자는 영어로 new line character, 한글로 줄바꿈 문자 또는 개행 문자라고 하는데,
이름 그대로 새로운 라인으로 넘기라는 뜻이다. 콘솔에서는 이 문자를 보고 다음 라인으로 넘긴다. <br/>
`println()`은 `print()`의 마지막에 `\n`을 추가한다. 따라서 다음 코드는 `println()`과 같다.
```java
System.out.print("hello\n");
System.out.print("world\n");
// 결과:
hello
world
```