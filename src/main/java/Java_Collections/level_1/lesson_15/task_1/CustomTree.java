package Java_Collections.level_1.lesson_15.task_1;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Ivan Korol on 5/10/2018
 */
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable{

    Entry<String> root;

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
    public void add(int index, String element) {
        //super.add(index, element);
         throw new UnsupportedOperationException();
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
        return 0;
    }
}
