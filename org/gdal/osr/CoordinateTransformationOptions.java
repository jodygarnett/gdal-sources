package org.gdal.osr;

public class CoordinateTransformationOptions {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CoordinateTransformationOptions(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CoordinateTransformationOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        osrJNI.delete_CoordinateTransformationOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(CoordinateTransformationOptions obj) {
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
    if (obj instanceof CoordinateTransformationOptions)
      equal = (((CoordinateTransformationOptions)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public CoordinateTransformationOptions() {
    this(osrJNI.new_CoordinateTransformationOptions(), true);
  }

  public boolean SetAreaOfInterest(double westLongitudeDeg, double southLatitudeDeg, double eastLongitudeDeg, double northLatitudeDeg) {
    return osrJNI.CoordinateTransformationOptions_SetAreaOfInterest(swigCPtr, this, westLongitudeDeg, southLatitudeDeg, eastLongitudeDeg, northLatitudeDeg);
  }

  public boolean SetOperation(String operation) {
    return osrJNI.CoordinateTransformationOptions_SetOperation(swigCPtr, this, operation);
  }

  public boolean SetDesiredAccuracy(double accuracy) {
    return osrJNI.CoordinateTransformationOptions_SetDesiredAccuracy(swigCPtr, this, accuracy);
  }

  public boolean SetBallparkAllowed(boolean allowBallpark) {
    return osrJNI.CoordinateTransformationOptions_SetBallparkAllowed(swigCPtr, this, allowBallpark);
  }

}
