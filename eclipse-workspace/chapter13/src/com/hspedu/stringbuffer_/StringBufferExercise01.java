package com.hspedu.stringbuffer_;

public class StringBufferExercise01 {
	public static void main(String[] args) {
		/*
		 * @IntrinsicCandidate
	    public synchronized StringBuffer append(String str2) {
	        toStringCache = null;
	        super.append(str2);
	        return this;
	    }
	    public AbstractStringBuilder append(String str2) {
        if (str2 == null) {
            return appendNull();
        }
        int len2 = str.length();
        ensureCapacityInternal(count + len2);
        putStringAt(count, str2);
        count += len2;
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
		 * public StringBuffer(String str2);
		 *     super(str2.length() + 16);
		 *     append(str2);
		 * }
		 */
		System.out.println(sb1);//
	}
}
