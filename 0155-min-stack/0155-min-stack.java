class MinStack {
    Stack<Long> stack=new Stack<>();
    long min;
    public MinStack() {
        min=Integer.MAX_VALUE;
    }

    public void push(int val) {
        Long num=Long.valueOf(val);
        if(stack.empty()){
            min=num;
            stack.push(num);
        }
        else{
            if(num<min){
                stack.push(2*num-min);
                min=num;
            }
            else stack.push(num);
        }
    }

    public void pop() {
        if(stack.empty())return;
        if(stack.peek()<min){
            min=2*min-stack.peek();
            stack.pop();
        }
        else stack.pop();
    }

    public int top() {
        if(stack.empty()) return -1;
        Long num = stack.peek();
        if (num < min) {
            return (int) min;
        }
        return num.intValue();
    }

        public int getMin () {
            return (int) min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */