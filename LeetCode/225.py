class MyStack:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        # 다른 메소드에서 쓸 수 있는 전역 변수를 만들기 위해서 self.que로 선언 해야함
        self.que = collections.deque()

    def push(self, x: int) -> None:
        """
        Push element x onto stack.
        """
        self.que.append(x)
        # 들어오는 원소를 맨 앞으로 보내야 함
        for _ in range(len(self.que)-1):
            self.que.append(self.que.popleft())
        print(self.que)
        # return self.que

    def pop(self) -> int:
        """
        Removes the element on top of the stack and returns that element.
        """
        return self.que.popleft()

    def top(self) -> int:
        """
        Get the top element.
        """
        return self.que[0]

    def empty(self) -> bool:
        """
        Returns whether the stack is empty.
        """
        return len(self.que) == 0
