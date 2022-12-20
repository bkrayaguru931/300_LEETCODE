//641. Design Circular Deque





class MyCircularDeque {
public:
/** Initialize your data structure here. Set the size of the deque to be k. */
vector<int> v;
int front,rear,capacity;
MyCircularDeque(int k) {
v.resize(k);
front=-1;
rear=-1;
capacity=k;
}

/** Adds an item at the front of Deque. Return true if the operation is successful. */
bool insertFront(int value) {
    if(rear==-1 && front==-1)
    {
        front=rear=0;
        v[rear]=value;
        return true;
    }
    if(front==(rear+1)%capacity)
        return false;
    front=(front-1+capacity)%capacity;
    v[front]=value; 
    return true;
}

/** Adds an item at the rear of Deque. Return true if the operation is successful. */
bool insertLast(int value) {
    if(front==-1 && rear==-1)
    {
        front=rear=0;
        v[rear]=value; 
        return true;
    }
    if(front==(rear+1)%capacity)
        return false;
    rear=(rear+1+capacity)%capacity;
    v[rear]=value;
    return true;
}

/** Deletes an item from the front of Deque. Return true if the operation is successful. */
bool deleteFront() {
    if(front==-1 && rear==-1)
        return false;
    if(front==rear)
    {
        front=rear=-1;
        return true;
    }
    front=(front+1+capacity)%capacity;
    return true;
}

/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
bool deleteLast() {
    if(front==-1 && rear==-1)
        return false;
    if(front==rear)
    {
        front=rear=-1;
        return true;
    }
    rear=(rear-1+capacity)%capacity;
    return true;
}

/** Get the front item from the deque. */
int getFront() {
    if(front==-1 && rear==-1)
        return -1;
    return v[front];
}

/** Get the last item from the deque. */
int getRear() {
    if(front==-1 && rear==-1 )
        return -1;
    return v[rear];
}

/** Checks whether the circular deque is empty or not. */
bool isEmpty() {
    if(front==-1 && rear==-1)
        return true;
    return false;
}

/** Checks whether the circular deque is full or not. */
bool isFull() {
    if(front==(rear+1)%capacity)
        return true;
    return false;
}
};

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque* obj = new MyCircularDeque(k);
 * bool param_1 = obj->insertFront(value);
 * bool param_2 = obj->insertLast(value);
 * bool param_3 = obj->deleteFront();
 * bool param_4 = obj->deleteLast();
 * int param_5 = obj->getFront();
 * int param_6 = obj->getRear();
 * bool param_7 = obj->isEmpty();
 * bool param_8 = obj->isFull();
 */
