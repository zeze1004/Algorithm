class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        # 데이터 전처리
        # 정규식 어려워...
        words = [word for word in re.sub(
            r'[^\w]', ' ', paragraph).lower().split() if word not in banned]

        print(words)

        counts = collections.Counter(words)

        print(counts)

        # words에서 가장 흔한 단어의 첫 번째 값
        return counts.most_common(1)[0][0]  # {'ball', 2}
