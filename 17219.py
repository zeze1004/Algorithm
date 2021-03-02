site_num, pass_num = map(int, input().split())

site_pass = {}
for _ in range(site_num):
    site, password = map(str, input().split())
    site_pass[site] = password

for _ in range(pass_num):
    site = input()
    print(site_pass[site])
