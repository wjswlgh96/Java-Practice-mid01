# Java-Practice-mid01
## 자바 강의를 보며 공부한 내용 정리

### 2024-12-13
- java.lang 패키지에 대하여 학습

>
> Object 메서드 기초
> 1. toString() : 객체의 정보를 문자열 형태로 제공한다.
> 2. equals() : 동등성 비교용 메서드, 그러나 Object가 기본으로 제공하는 equals는 == 으로 동일성 비교를 제공한다. 그래서 사용자가 직접 오버라이딩해서 사용하는것이 좋다.
> - 동일성( Identity ) : ```==```연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
> - 동등성 ( Equality ) : ```equals()```메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
> 3. getClass() : 뒤에 Class에서 설명한다.
> 4. Integer.toHexString(hashCode()) : 일단은 객체의 참조값 정도로만 생각하면됨. 추후에 보강예정
> 5. clone() : 객체를 복사할 때 사용한다. 잘 사용하지 않으므로 다루지 않았음
> 6. hashCode() : equals()와 hashCode()는 종종 함께 사용된다. hashCode()는 뒤에 컬렉션 프레임워크에서 자세히 설명한다.
> 7. notify(), notifyAll(), wait() : 멀티쓰레드용 메서드이다. 멀티쓰레드에서 다룬다.