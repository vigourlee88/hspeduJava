package com.hspedu.stringbuffer_;

public class StringBufferExercise01 {
	public static void main(String[] args) {
		/*
		 * @IntrinsicCandidate
	    public synchronized StringBuffer append(String str) {
	        toStringCache = null;
	        super.append(str);
	        return this;
	    }
	    public AbstractStringBuilder append(String str) {
        if (str == null) {
            return appendNull();
        }
        int len = str.length();
        ensureCapacityInternal(count + len);
        putStringAt(count, str);
        count += len;
        return this;
        }

		 */
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);//查看源码，底层调用的是AbstractStringBuilder的appendNull
		System.out.println(sb.length());//4
		
		System.out.println(sb);//null
		//下面的构造器会抛出空指针异常
		
		StringBuffer sb1 = new StringBuffer(str);//看底层源码 str =null super(str.length() + 16);
		/*
		 * public StringBuffer(String str);
		 *     super(str.length() + 16);
		 *     append(str);
		 * }
		 */
		System.out.println(sb1);//
	}
}
