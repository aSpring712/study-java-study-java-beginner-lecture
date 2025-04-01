# 향상된 for문
앞서 반복문에서 설명하지 않은 내용이 하나 있는데, 바로 향상된 for문(Enhanced For Loop)이다.
향상된 for문을 이해하려면 배열을 먼저 알아야 한다. 각각의 요소를 탐생한다는 의미로 for-each문이라고도
많이 부른다. <br/>
향상된 `for`문은 배열을 사용할 때 기존 `for`문 보다 더 편리하게 사용할 수 있다.

## 향상된 for문 정의
```java
for (변수 : 배열 또는 컬렉션) {
	// 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업 
}
```

코드로 확인해보자. (EnhancedFor1)

```java
int[] numbers = {1, 2, 3, 4, 5};

// 일반 for문
for (int i = 0; i < numbers.length; ++i) {
    int number = numbers[i];
    System.out.println(number);
}

// 향상된 for문, for-each문
for (int number : numbers) {
    System.out.println(number);
}

// for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
for(int i = 0; i < numbers.length; ++i) {
    System.out.println("number" + i + "번의 결과는: " + numbers[i]);
}
```
### 향상된 for문
```java
// 향상된 for문, for-each문
for (int number : numbers) {
    System.out.println(number);
}
```
- 일반 for문과 동일하게 작동한다.
- 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다. 단순히 해당 배열을
처음부터 끝까지 탐색한다.
- `:`의 오른쪽에 `numbers`와 같이 탐색할 배열을 선택하고, `:`의 왼쪽에 `int number`와 같이 반복할 때
마다 찾은 값을 저장할 변수를 선언한다. 그러면 배열의 값을 하나씩 꺼내서 왼쪽에 있는 `number`에 담고
for문을 반복 수행한다. `numbers` 배열의 끝에 도달해서 더 값이 없으면 for문이 완전히 종료된다.
- 향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에 코드가 간결하고 가독성이 좋다.

### 향상된 for문을 사용하지 못하는 경우
그런데 향상된 for문을 사용하지 못하는 경우가 있다. <br/>
향상된 for문에는 증가하는 인덱스 값이 감추어져 있다. 따라서 `int i`와 같은 증가하는 인덱스 값을 직접
사용해야 하는 경우에는 향상된 for문을 사용할 수 없다.
```java
// for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
for(int i = 0; i < numbers.length; ++i) {
		System.out.println("number" + i + "번의 결과는: " + numbers[i]);
}
```
이 예제에서는 증가하는 `i`값을 출력해야 하므로 향상된 for문 대신에 일반 for문을 사용해야 한다.

물론 다음과 같이 억지스럽게 향상된 for문을 사용하는 것이 가능하지만, 이런 경우 일반 for문을 사용하는 것이
더 좋다.
```java
int i = 0;
for (int number : numbers) {
	System.out.println("number" + i + "번의 결과는: " + number);
	i++;
}
```