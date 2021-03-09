import math
input_data = int(input())
result1 = int(input_data ** 0.5)  # 제곱근 만들기
result2 = math.sqrt(int(input_data))
if result1 >= result2:
    print(result1)
else:
    print(result1 + 1)
