package Java_Collections.level_1.lesson_15.task_1;

import java.io.Serializable;
import java.util.*;

/**
 * @author Ivan Korol on 5/10/2018
 */
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable{

    Entry<String> root;
    public Map<String, Entry> entries = new LinkedHashMap<>();
    int size=0;

    public CustomTree() {
        this.root = new Entry<>("0");
        this.root.lineNumber = 0;
    }

    public String getParent(String s) {
        Entry top = root;
        String result="null";
        Queue<Entry> queue = new LinkedList<> ();
        queue.add(top);
        do{
            if (top.elementName !=null)
            {
                if (top.elementName.equals(s))
                {
                    result = top.parent.elementName;
                    break;
                }
            }
            if (top.leftChild!=null) queue.add(top.leftChild);
            if (top.rightChild!=null) queue.add(top.rightChild);
            if (!queue.isEmpty()) top=queue.poll();
        }while (!queue.isEmpty());
        return result;
    }

    @Override
    public String get(int index) throws UnsupportedOperationException{

        throw new UnsupportedOperationException();
        //return null;
    }

    @Override
    public String set(int index, String element) {
        //return super.set(index, element);
        throw  new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String s) {
        Entry<String> top = root;
        Entry<String> current = new Entry(s);
        Queue<Entry>queue=new LinkedList<>();
        do {
            if (top.leftChild!=null){//Если в левом поддереве есть нода - добавить её в очередь
                queue.add(top.leftChild);
            }else {
                top.leftChild=current;//Создаем новую ноду в левом поддереве
                top.leftChild.parent=top;//Указываем родителя
                size++;
                return;
            }
            if (top.rightChild!=null){//Если в правом поддереве есть нода - добавить её в очередь
                queue.add(top.rightChild);
            }else {
                top.rightChild=current;//Создаем новую ноду в правом поддереве
                top.rightChild.parent=top;//Указывае родителя
                size++;
                return;
            }
            if (!queue.isEmpty()){
                top=queue.poll();//Берём из начала очереди с удалением
            }
        }while (!queue.isEmpty());
        queue.clear();
    }

    @Override
    public String remove(int index) {
        //return super.remove(index);
        throw  new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        //return super.subList(fromIndex, toIndex);
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        //super.removeRange(fromIndex, toIndex);
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
//        return super.addAll(index, c);
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        if  (root==null){
            return 0;
        }
        return size;
    }

    static class Entry<T> implements Serializable{
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        void checkChildren(){
            if(leftChild != null) {
                this.availableToAddLeftChildren = false;
            }else if(rightChild !=null) {
                this.availableToAddRightChildren = false;
            }
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

    }
}
