package com.core.java.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonSerialization implements Serializable{
	
	private static SingletonSerialization s_instance = null;
	
	private SingletonSerialization() {
        // initialize
    }
	
	public static synchronized SingletonSerialization getInstance() {
        if (s_instance == null) {
            s_instance = new SingletonSerialization();
        }
        return s_instance;
    }


	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		assert(getInstance() == getInstance());

        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(getInstance());
        oos.close();

        java.io.InputStream is = new java.io.ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(is);
        SingletonSerialization s = (SingletonSerialization)ois.readObject();
        assert(s == getInstance());

	}   
    

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        synchronized (SingletonSerialization.class) {
            if (s_instance == null) {
                // re-initialize if needed

                s_instance = this; // only if everything succeeds
            }
        }
    }

    // this function must not be called other than by the deserialization runtime
    private Object readResolve() throws ObjectStreamException {
        assert(s_instance != null);
        return s_instance;
    }


}
