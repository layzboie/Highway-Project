public class Queue {
    private class QueueRecord {
        public Object data;
        public QueueRecord next;


        public QueueRecord(Object obj) {
            data = obj;
            next = null;
        }
    }
        private QueueRecord head, tail;

        public void enqueue (Object obj) {
            QueueRecord rec = new QueueRecord(obj);

            if (head == null) {
                head = rec;
                tail = rec;
            } else {
                tail.next = rec;
                tail = rec;
            }
        }
        public Object dequeue() {
            QueueRecord rec = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return rec.data;
        }
        @Override
        public String toString() {
            String str = new String("");
            QueueRecord temp = head;

            while (temp != null) {
                str += temp.data.toString();
                //System.out.println(str);
                //System.out.println(temp);
                temp = temp.next;
            }
            return str;
        }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        System.out.println(queue);
    }
    }
