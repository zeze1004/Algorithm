def sugar_plz(sugar):
    count = 0
    while sugar >= 0:
        if sugar % 5 == 0:
            count = count + (sugar // 5)
            print(count)
            return
        sugar -= 3
        count += 1
    print(-1)
    return



if __name__ == "__main__":
    sugar = int(input())
    count = 0
    sugar_plz(sugar)