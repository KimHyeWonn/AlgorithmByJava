
# Array

### binarySearch()
binarySearch() 메소드는 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후, 해당 위치를 반환합니다.

이 메소드는 이진 검색 알고리즘을 사용하므로, 매개변수로 전달되는 배열이 sort() 메소드 등을 사용하여 미리 정렬되어 있어야만 제대로 동작합니다.


### copyOf() 메소드
copyOf() 메소드는 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환합니다.

copyOf() 메소드는 첫 번째 매개변수로 원본 배열을 전달받고, 두 번째 매개변수로 원본 배열에서 새로운 배열로 복사할 요소의 개수를 전달받습니다.

그리고 원본 배열과 같은 타입의 복사된 새로운 배열을 반환합니다.

이때 새로운 배열의 길이가 원본 배열보다 길면, 나머지 요소는 배열 요소의 타입에 맞게 다음과 같은 기본값으로 채워집니다.


### copyOfRange() 메소드
copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환합니다.

copyOfRange() 메소드는 첫 번째 매개변수로 복사의 대상이 될 원본 배열을 전달받습니다.

두 번째 매개변수로는 원본 배열에서 복사할 시작 인덱스를 전달받고, 세 번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달받습니다.

즉, 세 번째 매개변수로 전달된 인덱스 바로 전까지의 배열 요소까지만 복사됩니다.

그리고 원본 배열과 같은 타입의 복사된 새로운 배열을 반환합니다.


### fill() 메소드
fill() 메소드는 전달받은 배열의 모든 요소를 특정 값으로 초기화해 줍니다.

 

fill() 메소드는 첫 번째 매개변수로 초기화할 배열을 전달받고, 두 번째 매개변수로 초기값을 전달받습니다.

따라서 이 메소드는 전달받은 원본 배열의 값을 변경하게 됩니다.



### sort() 메소드
sort() 메소드는 전달받은 배열의 모든 요소를 오름차순으로 정렬합니다.


sort() 메소드는 매개변수로 정렬할 배열을 전달받으며, 따라서 이 메소드는 전달받은 원본 배열의 순서를 변경하게 됩니다.




문제보기
1. [KNumber](https://programmers.co.kr/learn/courses/30/lessons/42748)