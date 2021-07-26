# n! //
# (n - k)! * k!

n, k = map(int, input().split())
if k == 0 or k == n:
    print(1)
    exit(0)

n_k = n - k

n_list = [i for i in range(n - 1, 0, -1)]
k_list = [i for i in range(k - 1, 0, -1)]
n_k_list = [i for i in range((n_k) - 1, 0, -1)]
# print(n_list, k_list, n_k_list)
for i in n_k_list:
    (n_k) *= i
# print(n_k)
for i in n_list:
    n *= i
for i in k_list:
    k *= i

print(n // (n_k * k))



