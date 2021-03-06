package Java_Collections.level_4.lesson_15.amigoSet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * @author Ivan Korol on 6/8/2018
 */
public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        map = new HashMap();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    @Override
    public Iterator<E> iterator() {
        Set<E> keySet = map.keySet();
        return keySet.iterator();
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        map.remove(o);
        return super.remove(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean addAll(Collection c) {
        return super.addAll(c);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object clone() {
       AmigoSet copy;
       try{
           copy = (AmigoSet) super.clone();
           copy.map = (HashMap) map.clone();
       } catch (Exception e) {
           throw new InternalError();
       }
        return copy;
    }

    private void writeObject(ObjectOutputStream oos) {

        try
        {
            oos.defaultWriteObject();

            oos.writeObject(map.keySet().size());
            for (E elem : map.keySet())
            {
                oos.writeObject(elem);
            }

            oos.writeObject(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
            oos.writeObject(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream s) {
        try
        {
            s.defaultReadObject();

            Set<E> set = new HashSet<>();
            int size = (int) s.readObject();
            for (int i = 0; i < size; i++)
            {
                set.add((E) s.readObject());
            }

            int capacity = (int) s.readObject();
            float loadFactor = (float) s.readObject();
            map = new HashMap<>(capacity, loadFactor);
            for (E elem : set)
            {
                map.put(elem, PRESENT);
            }
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
