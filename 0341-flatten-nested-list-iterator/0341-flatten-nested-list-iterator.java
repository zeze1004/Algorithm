/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
 
 // 내부동작이 잘 상상이 안감...영어를 못해서 그런건가...
public class NestedIterator implements Iterator<Integer> {
    private Deque<NestedInteger> stack;

    // 생성자
    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new ArrayDeque<>(nestedList);
    }

    // 다음 숫자를 반환
    @Override
    public Integer next() {
        hasNext();
        return stack.pop().getInteger(); // getInteger(): NestedInteger 클래스에서 제공하는 인터페이스
    }

    // 더 순회할 숫자가 있으면 true, 없으면 false
    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            NestedInteger top = stack.peek();
            if (top.isInteger()) {
                return true;
            }
            stack.pop();
            for (int i = top.getList().size() - 1; i >= 0; i--) {
                stack.push(top.getList().get(i)); // nestedList 끝 원소부터 stack에 집어넣음
            }
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */