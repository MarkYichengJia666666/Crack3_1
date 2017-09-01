/**
 * Created by jiayicheng on 17/7/26.
 */

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Three_In_One {

    public class Mystack<T>
    {
        private class StackNode<T>
        {
            private T data;
            private StackNode<T> next;
            public StackNode(T data){
                this.data=data;
            }
        }

        private StackNode<T> top;

        public T pop(){
            if(top==null ) throw new EmptyStackException();
            T item=top.data;
            top=top.next;
            return item;
        }

        public void push(T item)
        {
            StackNode<T> t=new StackNode<T>(item);
            t.next=top;
            top=t;
        }

        public T peek(){
            if(top==null) throw new EmptyStackException();
            return top.data;
        }

        public boolean isEmpty()
        {
            return top ==null;
        }
    }




    public class MyQueue<T>
    {
        private class QueueNode<T>{
            private T data;
            private QueueNode<T> next;

            public QueueNode(T data){
                this.data=data;
            }
        }

        public QueueNode<T> first;
        public QueueNode<T> last;

        public void add(T item)
        {
            QueueNode<T> t=new QueueNode<T>(item);
            if(last!=null){
                last.next=t;
            }
            if(first==null){
                first=last;
            }
        }

        public T remove(){
            if(first==null) throw new NoSuchElementException();
            T data=first.data;
            first=first.next;
            if(first==null)
            {
                last=null;
        }
        return data;
    }

    public T peek()
    {
        if(first==null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty()
    {
        return first==null;
    }
    }
}
