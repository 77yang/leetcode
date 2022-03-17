//设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针
///引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。 
//
// 在链表类中实现这些功能： 
//
// 
// get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。 
// addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。 
// addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。 
// addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val 的节点。如果 index 等于链表的长度，则该节点将附加
//到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。 
// deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。 
// 
//
// 
//
// 示例： 
//
// MyLinkedList linkedList = new MyLinkedList();
//linkedList.addAtHead(1);
//linkedList.addAtTail(3);
//linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
//linkedList.get(1);            //返回2
//linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//linkedList.get(1);            //返回3
// 
//
// 
//
// 提示： 
//
// 
// 所有val值都在 [1, 1000] 之内。 
// 操作次数将在 [1, 1000] 之内。 
// 请不要使用内置的 LinkedList 库。 
// 
// Related Topics 设计 链表 👍 375 👎 0


package com.yang7.leetcode.editor.cn;

public class DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList solution = new DesignLinkedList().new MyLinkedList();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyLinkedList {
        // 结点类
        class Node {
            // 结点的值
            int val;
            // 指向下一个结点的指针(java中表现为下一个结点的引用)
            Node next;

            // 初始化 数据域val
            Node(int val) {
                this.val = val;
            }
        }

        // 记录头结点/指针
        Node head;
        // 记录链表的长度(元素的个数) 因为下面要用到,用于判断index的合法性
        int N;

        // 初始化  构造方法
        public MyLinkedList() {
            // 初始化长度
            N = 0;
            // 初始化头结点 这里建立了一个虚拟头结点,这个节点指向头结点,
            // 现在因为没有头结点,所以指向null
            head = new Node(0);
        }

        // 获取指定 索引index 的结点
        public int get(int index) {
            //判断index的合法新
            if (index < 0 || index >= N) {
                return -1;
            }
            //建立一个临时节点来遍历链表找到目标位置的节点
            Node temp = this.head;
            for (int i = 0; i <= index; i++) {
                //不到目标位置,则临时节点向后移动,知道移动到指定位置
                temp = temp.next;
            }
            return temp.val;
        }

        // 头部插入
        public void addAtHead(int val) {
            this.addAtIndex(0, val);
        }

        // 尾部插入
        public void addAtTail(int val) {
            this.addAtIndex(N, val);
        }

        // 任意插入
        public void addAtIndex(int index, int val) {
            //判断index合法性 大于链表长度则直接返回
            if (index > N) {
                return;
            }
            //小于0代表插入到头结点,index改为0
            if (index < 0) {
                index = 0;
            }
            N++;
            Node temp = head;
            //查找要插入节点的前驱
            //注意插入头结点的插入方法与普通节点不同,因为头结点没有前驱,
            //但是虚拟节点指向头结点,也就是说头结点的前驱是虚拟节点
            //所以头结点的插入也可以按照铺头节点的插入方法进行插入,
            //只要找到前驱即可
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            //找到后进行插入操作
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
        }

        // 删除
        public void deleteAtIndex(int index) {
            //判断index合法性 大于链表长度或者小于0则直接返回
            if (index >= N || index < 0) {
                return;
            }
            N--;
            Node temp = head;
            //这里跟上面一样,只要找到要删除位置的前驱指针,
            //因为有虚拟头指针的存在所以实际头指针也有前驱
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            //找到后进行插入操作
            temp.next = temp.next.next;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}