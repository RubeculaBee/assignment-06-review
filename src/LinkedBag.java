/*********************************************************************************
 *
 * File: LinkedBag.java
 * By: Robin Lane
 * Date: 05-06-2025
 *
 * Description: Simple implementation of a Linked Bag data structure. Uses
 *              generic data-type T. Data can be added \ to, removed from,
 *              changed, obtained, among other methods.
 *
 *********************************************************************************/

import java.lang.reflect.Array;

public class LinkedBag<T>
{
    private Node<T> firstNode;

    public LinkedBag()
    {
        this.firstNode = null;
    }

    public LinkedBag(T... contents)
    {
        this.firstNode = new Node<T>(contents[0]);
        Node<T> currentNode = this.firstNode;

        for(int i = 1; i < contents.length; i++)
        {
            currentNode.nextNode = new Node<>(contents[i]);
            currentNode = currentNode.nextNode;
        }
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public int size() {
        int count = 0;
        Node<T> currentNode = this.firstNode;

        while(currentNode != null)
        {
            count++;
            currentNode = currentNode.nextNode;
        }

        return count;
    }

    public void clear() {
        this.firstNode = null;
    }

    public boolean add(T newElement) {
        Node<T> newNode = new Node<>(newElement);
        if(this.isEmpty())
        {
            this.firstNode = newNode;
            return true;
        }

        Node<T> currentNode = this.firstNode;
        while(currentNode.nextNode != null)
            currentNode = currentNode.nextNode;

        currentNode.nextNode = newNode;
        return true;
    }

    public boolean add(int index, T element) {
        if(index == 0) { this.firstNode = new Node<>(element, this.firstNode); }
        if(index > 0 && index <= this.size())
        {
            Node<T> currentNode = this.firstNode;
            for (int i = 0; i < index-1; i++)
                currentNode = currentNode.nextNode;

            currentNode.nextNode = new Node<>(element, currentNode.nextNode);
            return true;
        }
        return false;
    }

    public boolean contains(T element) {
        Node<T> currentNode = this.firstNode;

        while (currentNode != null)
        {
            if (currentNode.data.equals(element))
                return true;
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public T get(int index) {
        if(index >= 0 && index < this.size())
        {
            Node<T> currentNode = this.firstNode;

            for (int i = 0; i < index; i++)
                currentNode = currentNode.nextNode;

            return currentNode.data;
        }
        return null;
    }

    public T get(T element) {
        Node<T> currentNode = this.firstNode;

        while (currentNode != null)
        {
            if (currentNode.data.equals(element))
                return currentNode.data;
            currentNode = currentNode.nextNode;
        }
        return null;
    }

    public T remove() {
        if(this.isEmpty())
            return null;

        Node<T> currentNode = this.firstNode;
        while(currentNode.nextNode.nextNode != null)
            currentNode = currentNode.nextNode;

        Node<T> removedNode = currentNode.nextNode;
        currentNode.nextNode = null;

        return removedNode.data;
    }

    public T remove(T element) {
        if(this.isEmpty() || !this.contains(element))
            return null;

        Node<T> currentNode = this.firstNode;
        while(currentNode.nextNode.data != element)
            currentNode = currentNode.nextNode;

        Node<T> removedNode = currentNode.nextNode;
        currentNode.nextNode = currentNode.nextNode.nextNode;
        return removedNode.data;
    }

    public T remove(int index) {
        if(this.isEmpty() || index < 0 || index >= this.size())
            return null;

        Node<T> currentNode = this.firstNode;
        for(int i = 0; i < index-1; i++)
            currentNode = currentNode.nextNode;

        Node<T> removedNode = currentNode.nextNode;
        currentNode.nextNode = currentNode.nextNode.nextNode;
        return removedNode.data;
    }

    public T set(int index, T element) {
        if(this.isEmpty() || index < 0 || index >= this.size())
            return null;

        Node<T> currentNode = this.firstNode;
        for(int i = 0; i < index; i++)
            currentNode = currentNode.nextNode;

        T removedData = currentNode.data;
        currentNode.data = element;
        return removedData;
    }

    public T[] toArray() {
        if(this.isEmpty())
            return null;

        Node<T> currentNode = this.firstNode;
        T[] array = (T[]) Array.newInstance(currentNode.data.getClass(), this.size());

        for(int i = 0; i < this.size(); i++)
        {
            array[i] = currentNode.data;
            currentNode = currentNode.nextNode;
        }

        return array;
    }

    public int indexOf(T element) {
        Node<T> currentNode = this.firstNode;

        for(int i = 0; i < this.size(); i++)
        {
            if (currentNode.data == element)
                return i;
            currentNode = currentNode.nextNode;
        }

        return -1;
    }

    public int lastIndexOf(T element) {
        Node<T> currentNode = this.firstNode;
        int index = -1;

        for(int i = 0; i < this.size(); i++)
        {
            if(currentNode.data == element)
                index = i;
            currentNode = currentNode.nextNode;
        }

        return index;
    }

    public int getFrequencyOf(T element) {
        Node<T> currentNode = this.firstNode;
        int count = 0;

        for(int i = 0; i < this.size(); i++)
        {
            if(currentNode.data == element)
                count++;
            currentNode = currentNode.nextNode;
        }

        return count;
    }

    public LinkedBag<T> subBag(int fromIndex, int toIndex) {
        if( fromIndex < 0 || fromIndex > this.size() ||
            toIndex < 0 || toIndex > this.size() ||
            fromIndex > toIndex || this.isEmpty())
            return null;

        Node<T> currentNode = this.firstNode;
        for(int i = 0; i < fromIndex; i++)
            currentNode = currentNode.nextNode;

        LinkedBag<T> subBag = new LinkedBag<>();
        for(int i = fromIndex; i < toIndex; i++)
        {
            subBag.add(currentNode.data);
            currentNode= currentNode.nextNode;
        }

        return subBag;
    }


    private class Node<T>
    {
        private T data;
        private Node<T> nextNode;

        Node(T data)
        {
            this.data = data;
            this.nextNode = null;
        }

        Node(T data, Node<T> nextNode)
        {
            this.data = data;
            this.nextNode = nextNode;
        }
    }
}


