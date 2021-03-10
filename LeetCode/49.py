class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        arr = collections.defaultdict(list)

        for word in strs:
            # 정렬해서 딕셔너리에 추가
            arr[''.join(sorted(word))].append(word)
        # key : values에서 values만 출력
        print(arr.values())

        return arr.values()
