input_num = int(input())

extension = []
file_name = []

for _ in range(input_num):
    a = input()
    file_name.append(a[::])
    extension.append(a[-3::])

print(file_name)
print(extension)

# 1. 파일명 검사
#   - 첫 번째랑 다르면 file_name에서 2번 인덱스부터 끝까지 출력후 ? 붙여서 print
#   - 같으면 file_name에서
# 2. 확장자 검사
#   - 첫 번째랑 다르면 ??? 붙여서 print
#   - 같으면 첫번째 단어 붙여서 출력
# for i in command:

