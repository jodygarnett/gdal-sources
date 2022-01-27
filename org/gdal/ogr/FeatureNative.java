package org.gdal.ogr;

import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

import org.gdal.ogr.Feature;


/* This class enables to finalize native resources associated with the object */
/* without needing a finalize() method */

class FeatureNative extends WeakReference {
  private long swigCPtr;

  static private ReferenceQueue refQueue = new ReferenceQueue();
  static private Set refList = Collections.synchronizedSet(new HashSet());
  static private Thread cleanupThread = null;

  /* We start a cleanup thread in daemon mode */
  /* If we cannot, we will cleanup garbage features at creation time */
  static
  {
    cleanupThread = new Thread() {
        public void run()
        {
            while(true)
            {
                try
                {
                    FeatureNative nativeObject =
                        (FeatureNative) refQueue.remove();
                    if (nativeObject != null)
                        nativeObject.delete();
                }
                catch(InterruptedException ie) {}
            }
        }
    };
    try
    {
        cleanupThread.setName("Feature" + "NativeObjectsCleaner");
        cleanupThread.setDaemon(true);
        cleanupThread.start();
    }
    catch (SecurityException se)
    {
        //System.err.println("could not start daemon thread");
        cleanupThread = null;
    }
  }

  public FeatureNative(Feature javaObject, long cPtr) {
    super(javaObject, refQueue);

    if (cleanupThread == null)
    {
        /* We didn't manage to have a daemon cleanup thread */
        /* so let's clean manually */
        while(true)
        {
            FeatureNative nativeObject =
                (FeatureNative) refQueue.poll();
            if (nativeObject != null)
                nativeObject.delete();
            else
                break;
        }
    }

    refList.add(this);

    swigCPtr = cPtr;
  }

  public void dontDisposeNativeResources()
  {
      refList.remove(this);
      swigCPtr = 0;
  }

  public void delete() 
  {
    refList.remove(this);
    if(swigCPtr != 0) {
      ogrJNI.delete_Feature(swigCPtr);
    }
    swigCPtr = 0;
  }


}