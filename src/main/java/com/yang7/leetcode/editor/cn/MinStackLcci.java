  //请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(
//1)。 示例： MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
// minStack.push(-3); minStack.getMin();   --> 返回 -3. minStack.pop(); minStack.
//top();      --> 返回 0. minStack.getMin();   --> 返回 -2. Related Topics 栈 设计 👍 65 👎 
//0

  
  package com.yang7.leetcode.editor.cn;

  public class MinStackLcci{
      public static void main(String[] args) {
          MinStack solution = new MinStackLcci().new MinStack();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class MinStack {
          //链表头，相当于栈顶
          private ListNode head;

          //压栈，需要判断栈是否为空
          public void push(int x) {
              if (empty())
                  head = new ListNode(x, x, null);
              else
                  head = new ListNode(x, Math.min(x, head.min), head);
          }

          //出栈，相当于把链表头删除
          public void pop() {
              if (empty())
                  throw new IllegalStateException("栈为空……");
              head = head.next;
          }

          //栈顶的值也就是链表头的值
          public int top() {
              if (empty())
                  throw new IllegalStateException("栈为空……");
              return head.val;
          }

          //链表中头结点保存的是整个链表最小的值，所以返回head.min也就是
          //相当于返回栈中最小的值
          public int getMin() {
              if (empty())
                  throw new IllegalStateException("栈为空……");
              return head.min;
          }

          //判断栈是否为空
          private boolean empty() {
              return head == null;
          }
      }

      class ListNode {
          public int val;
          public int min;//最小值
          public ListNode next;

          public ListNode(int val, int min, ListNode next) {
              this.val = val;
              this.min = min;
              this.next = next;
          }
      }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

  }