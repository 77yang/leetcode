//设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”
//。 
//
// 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环
//队列，我们能使用这些空间去存储新的值。 
//
// 你的实现应该支持如下操作： 
//
// 
// MyCircularQueue(k): 构造器，设置队列长度为 k 。 
// Front: 从队首获取元素。如果队列为空，返回 -1 。 
// Rear: 获取队尾元素。如果队列为空，返回 -1 。 
// enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。 
// deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。 
// isEmpty(): 检查循环队列是否为空。 
// isFull(): 检查循环队列是否已满。 
// 
//
// 
//
// 示例： 
//
// MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
//circularQueue.enQueue(1);  // 返回 true
//circularQueue.enQueue(2);  // 返回 true
//circularQueue.enQueue(3);  // 返回 true
//circularQueue.enQueue(4);  // 返回 false，队列已满
//circularQueue.Rear();  // 返回 3
//circularQueue.isFull();  // 返回 true
//circularQueue.deQueue();  // 返回 true
//circularQueue.enQueue(4);  // 返回 true
//circularQueue.Rear();  // 返回 4 
//
// 
//
// 提示： 
//
// 
// 所有的值都在 0 至 1000 的范围内； 
// 操作数将在 1 至 1000 的范围内； 
// 请不要使用内置的队列库。 
// 
// Related Topics 设计 队列 数组 链表 👍 256 👎 0


package com.yang7.leetcode.editor.cn;

public class DesignCircularQueue {
    public static void main(String[] args) {
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyCircularQueue {
        public int[] elem;
        public int front;//队头下标
        public int rear;//队尾下标

        public MyCircularQueue(int k) {
            this.elem = new int[k + 1];
        }

        /**
         * 入队
         *
         * @param value
         * @return
         */
        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            this.elem[rear] = value;
            //rear++;
            rear = (rear + 1) % elem.length;
            return true;
        }

        /**
         * 出队
         *
         * @return
         */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % elem.length;
            return true;
        }

        /**
         * 得到队头元素
         *
         * @return
         */
        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return this.elem[front];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            int index;
            if (rear == 0) {
                index = elem.length - 1;
            } else {
                index = rear - 1;
            }
            return elem[index];
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public boolean isFull() {
            //rear的下一个为front
            if ((rear + 1) % elem.length == front) {
                return true;
            }
            return false;
        }
    }


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
//leetcode submit region end(Prohibit modification and deletion)

}