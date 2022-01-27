package org.gdal.gdal;

public class Statistics {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Statistics(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Statistics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_Statistics(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Statistics obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Statistics)
      equal = (((Statistics)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public double getMin() {
    return gdalJNI.Statistics_min_get(swigCPtr, this);
  }

  public double getMax() {
    return gdalJNI.Statistics_max_get(swigCPtr, this);
  }

  public double getMean() {
    return gdalJNI.Statistics_mean_get(swigCPtr, this);
  }

  public double getStd_dev() {
    return gdalJNI.Statistics_std_dev_get(swigCPtr, this);
  }

  public long getValid_count() {
    return gdalJNI.Statistics_valid_count_get(swigCPtr, this);
  }

  public Statistics() {
    this(gdalJNI.new_Statistics(), true);
  }

}
