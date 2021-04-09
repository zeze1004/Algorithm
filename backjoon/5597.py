# list 만들기
student = [i for i in range(1, 31)]
for _ in range(28):
    a = int(input())
    student.remove(a)  # student 배열에서 input 값 삭제

# 남아있는 student 배열에서 제일 작은 값, 큰 값 출력
print(min(student))
print(max(student))
