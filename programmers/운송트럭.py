def solution(max_weight, specs, names):
    num = 1
    limit = max_weight
    specs = dict(specs)

    for product in names:
        if int(specs[product]) > limit:
            num += 1
            limit = max_weight
        limit -= int(specs[product])

    return num