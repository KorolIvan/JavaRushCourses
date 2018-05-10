package Java_Collections.level_1.lesson_15.task_1;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Ivan Korol on 5/10/2018
 */
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root = new Entry<>("0");

    static class Entry<T> implements Serializable {
        String elementName;
        int lineNumber = 0;
        boolean availableToAddLeftChildren,
                availableToAddRightChildren;
        Entry<T> parent,
                leftChild,
                rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        void checkChildren() {
            if (leftChild != null)
                availableToAddLeftChildren = false;
            if (rightChild != null)
                availableToAddRightChildren = false;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddRightChildren || availableToAddLeftChildren;
        }
    }

    public boolean add(String element) {
        Entry<String> newElement = new Entry<>(element);
        Queue<Entry<String>> queue = new ConcurrentLinkedQueue<>();
        queue.add(root);
        while (true) {
            Entry<String> currentRoot = queue.remove();
            // если находим локальный "корень" у которого нет 1 или 2=х "детей", то записываем
            if (currentRoot.isAvailableToAddChildren()) {
                elementAdd(currentRoot, newElement);
                break;
            } // если дети есть, то ставим их в очередь
            else {
                if (currentRoot.leftChild != null)
                    queue.add(currentRoot.leftChild);
                if (currentRoot.rightChild != null)
                    queue.add(currentRoot.rightChild);
            }
        }
        return true;
    }

    @Override
    public String get(int index) {
       throw new UnsupportedOperationException();
    }

    //проверяет наличие детей и запихивает туда, где их нет
    public void elementAdd(Entry<String> currentRoot, Entry<String> currentElement) {
        if (currentRoot.availableToAddLeftChildren) {
            currentElement.parent = currentRoot;
            currentElement.lineNumber = currentRoot.lineNumber + 1;
            currentRoot.leftChild = currentElement;
        } else if (currentRoot.availableToAddRightChildren) {
            currentElement.parent = currentRoot;
            currentElement.lineNumber = currentRoot.lineNumber + 1;
            currentRoot.rightChild = currentElement;
        }
        currentRoot.checkChildren();
    }

    @Override
    public boolean remove(Object o) {
        if(o instanceof String){
            boolean deleteElement = false;
            ArrayList<Entry<String>> intQueue = new ArrayList<Entry<String>>();
            intQueue.add(root);

            while (! intQueue.isEmpty()){
                Entry<String> current = intQueue.remove(0);
                if (current.leftChild != null){
                    if(o.equals(current.leftChild.elementName)) {
                        current.leftChild = null;
                        current.availableToAddLeftChildren = true;
                        deleteElement = true;
                        break;
                    }
                    intQueue.add(current.leftChild);
                }

                if (current.rightChild != null){
                    if(o.equals(current.rightChild.elementName)) {
                        current.rightChild = null;
                        current.availableToAddRightChildren = true;
                        deleteElement = true;
                        break;
                    }
                    intQueue.add(current.rightChild);
                }

            }


            boolean addElement = false;
            intQueue = new ArrayList<Entry<String>>();
            intQueue.add(root);

            while (! intQueue.isEmpty()){
                Entry<String> current = intQueue.remove(0);

                if (current.availableToAddLeftChildren){
                    addElement =  true;
                    break;
                }
                else if(current.leftChild !=null){
                    intQueue.add(current.leftChild);
                }

                if (current.availableToAddRightChildren){
                    addElement = true;
                    break;
                }
                else if(current.rightChild !=null) {
                    intQueue.add(current.rightChild);
                }
            }


            return deleteElement;
        }
        else{
            throw new UnsupportedOperationException();
        }
    }

    //метод ищет указанный элемент в графе и взвращает его или null, если его нет
    public Entry<String> findElement(Entry<String> root, String findElement) {
        Entry<String> elementOut = null;
        Queue<Entry<String>> queue = new ConcurrentLinkedQueue<>();
        queue.add(root);
        while (queue.size() != 0) {
            Entry<String> currentElement = queue.remove();
            if (currentElement.elementName.equals(findElement)) {
                elementOut = currentElement;
                break;
            } else {
                if (currentElement.leftChild != null)
                    queue.add(currentElement.leftChild);
                if (currentElement.rightChild != null)
                    queue.add(currentElement.rightChild);
            }
        }
        return elementOut;
    }

    @Override
    public int size() {
        int size = 0;
        Queue<Entry<String>> queue = new ConcurrentLinkedQueue<>();
        queue.add(root);
        // пробегаемся по элементам
        while (queue.size() != 0) {
            Entry<String> currentElement = queue.remove();
            if (currentElement.leftChild != null) {
                queue.add(currentElement.leftChild);
                size++;
            }
            if (currentElement.rightChild != null) {
                queue.add(currentElement.rightChild);
                size++;
            }
        }
        return size;
    }

    public String getParent(String element) {
        Entry<String> findElement = findElement(root, element);
        if (findElement != null)
            return findElement.parent.elementName;
        else return null;
    }
}
